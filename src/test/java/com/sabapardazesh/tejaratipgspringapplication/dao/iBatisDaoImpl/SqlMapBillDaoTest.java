package com.sabapardazesh.tejaratipgspringapplication.dao.iBatisDaoImpl;

import com.sabapardazesh.tejaratipgspringapplication.dao.BillDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SqlMapBillDaoTest {

    @Autowired
    BillDao billDao;
    @Test
    void getPaymentId() throws SQLException {

       Long id =  billDao.getPaymentId("4054843930165","2813019");
       assertEquals(134858017,id);
    }
}