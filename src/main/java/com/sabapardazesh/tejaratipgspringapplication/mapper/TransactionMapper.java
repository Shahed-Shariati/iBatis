package com.sabapardazesh.tejaratipgspringapplication.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface TransactionMapper {
    Long findStudentById(HashMap<String,String> id);

    long getPaymentId (HashMap<String,String> info);
}
