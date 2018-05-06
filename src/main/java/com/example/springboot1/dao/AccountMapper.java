package com.example.springboot1.dao;

import com.example.springboot1.entity.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    @Insert("INSERT INTO account(name, money) VALUES(#{name}, #{money})")
    int add(@Param("name") String name, @Param("money") double money);

    @Update("UPDATE account SET name = #{name}, money = #{money} WHERE id = #{id}")
    int update(@Param("name") String name, @Param("money") double money, @Param("id") int id);

    @Delete("DELETE FROM account WHERE id = #{id}")
    int delete(int id);

    @Select("SELECT id, name AS name, money AS money FROM account WHERE id = #{id}")
    Account findAccount(@Param("id") int id);

    @Select("SELECT id, name AS name, money AS money FROM account")
    List<Account> findAccountList();
}