package com.example.springboot1.dao;

import com.example.springboot1.entity.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper2 {

    int update( @Param("money") double money, @Param("id") int  id);

}