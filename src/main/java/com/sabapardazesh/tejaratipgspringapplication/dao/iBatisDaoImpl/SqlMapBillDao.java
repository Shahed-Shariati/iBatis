package com.sabapardazesh.tejaratipgspringapplication.dao.iBatisDaoImpl;


import com.sabapardazesh.tejaratipgspringapplication.dao.BillDao;
import com.sabapardazesh.tejaratipgspringapplication.mapper.TransactionMapper;
import com.sabapardazesh.tejaratipgspringapplication.service.dto.BillTransaction;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;


/**
 * @author <a href="mailto:kamran.azizzadeh@avanoc.com">Kamran</a>
 *         Date: Oct 8, 2008
 *         Time: 8:57:54 AM
 */
@Component
public class SqlMapBillDao implements BillDao {

  //  private final SqlMapClient sqlMapClient;
    private static Logger log = Logger.getLogger(SqlMapBillDao.class);

    private final SqlSession sqlMapClient;

    private final TransactionMapper mapper;

    public SqlMapBillDao(SqlSession sqlMapClient, TransactionMapper mapper) {
        this.sqlMapClient = sqlMapClient;
        this.mapper = mapper;
    }

    public void insertBillTransaction(BillTransaction billTransaction) throws SQLException {
        if (!billTransaction.isBillMerchant())
            sqlMapClient.insert("Bill.insertBillTransactionWithoutEmail", billTransaction);
        else
            sqlMapClient.insert("Bill.insertBillTransactionMerchant", billTransaction);

    }

    public int updateBillTransactionAfterSend(BillTransaction billTransaction) throws SQLException {
        return sqlMapClient.update("Bill.updateBillAfterSend", billTransaction);
    }

    public void updateBillTransactionlevel200(Long paymentId) throws SQLException {
        sqlMapClient.update("Bill.updateLevel200", paymentId);
    }

    public Integer getBillResultCode(Long paymentId) throws SQLException {
        return (Integer) sqlMapClient.selectOne("Bill.getResultCode", paymentId);
    }

    public Long getPaymentId(String billNumber, String billPaymentId) throws SQLException {
        HashMap<String, String> info = new HashMap<String, String>(2);
        info.put("billNumber", billNumber);
        info.put("billPaymentId", billPaymentId);
        return  mapper.getPaymentId(info);
       // return (Long) sqlMapClient.selectOne("Bill.getPaymentId", info);
    }

    public void updateBilltransactionWith210(BillTransaction billTransaction) throws SQLException {

        int i = sqlMapClient.update("Bill.updateWith210", billTransaction);
        if (i != 1) {
            if (billTransaction.getIsoResultCode().equals(0))
            billTransaction.setLevel(200);
            else billTransaction.setLevel(210);
                i = sqlMapClient.update("Bill.updateWith210Merchant", billTransaction);
        }
        if (i != 1)
            log.error("No bill transaction found for update with 0210.PaymentId [" + billTransaction.getPaymentId() + "]");
    }

    public List getReversalBills() throws SQLException {
        return sqlMapClient.selectOne("Bill.getReversalBills");
    }

    public int updateBillWith0430(Long paymentId) throws SQLException {
        return sqlMapClient.update("Bill.updateWith0430", paymentId);
    }

    public Integer getISOResultCode(Long paymentId) throws SQLException {
        return (Integer) sqlMapClient.selectOne("Bill.getISOResultCode", paymentId);

    }
}
