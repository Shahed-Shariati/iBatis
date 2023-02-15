package com.sabapardazesh.tejaratipgspringapplication.dao;


import com.sabapardazesh.tejaratipgspringapplication.service.dto.BillTransaction;

import java.sql.SQLException;
import java.util.List;

/**
 * @author <a href="mailto:kamran.azizzadeh@avanoc.com">Kamran</a>
 *         Date: Oct 8, 2008
 *         Time: 8:57:05 AM
 */
public interface BillDao {

    public void insertBillTransaction(BillTransaction billTransaction) throws SQLException;

    public int updateBillTransactionAfterSend(BillTransaction billTransaction) throws SQLException;

    public void updateBillTransactionlevel200(Long paymentId) throws SQLException;

    public Integer getBillResultCode(Long paymentId) throws SQLException;

    public Long getPaymentId(String billNumber, String billPaymentId) throws SQLException;

    public void updateBilltransactionWith210(BillTransaction billTransaction) throws SQLException;

    public List getReversalBills() throws SQLException;

    public int updateBillWith0430(Long paymentId) throws SQLException;

    public Integer getISOResultCode(Long paymentId) throws SQLException;

}
