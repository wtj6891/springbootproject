package com.hello.springbootproject.repository.impl;

import com.hello.springbootproject.model.Account;
import com.hello.springbootproject.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/******
 *Name: AccountRepositoryImpl
 *User: Administrator
 *Date: 2019/5/5
 **/
@Repository
public class AccountRepositoryImpl implements AccountRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * 保存
     *
     * @param account
     * @return
     */
    @Override public int save(Account account) {
        String accountId = UUID.randomUUID().toString();
        return jdbcTemplate.update("INSERT INTO account(id, username, password) values (?, ?, ?)", accountId, account.getUsername(), account.getPassword());
    }

    /**
     * 修改
     *
     * @param account
     * @return
     */
    @Override public int update(Account account) {
        return jdbcTemplate.update("UPDATE account SET username = ?, password = ? WHERE id = ?", account.getUsername(), account.getPassword(), account.getId());
    }

    /**
     * 删除
     *
     * @param account
     * @return
     */
    @Override public int delete(Account account) {
        return jdbcTemplate.update("DELETE FROM account WHERE id = ?", account.getId());
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override public List<Account> findAll() {
        return jdbcTemplate.query("SELECT * FROM account",new BeanPropertyRowMapper(Account.class));
    }

    /**
     * 查找一个对象
     *
     * @param id
     * @return
     */
//    @Override public Account findById(String id) {
//        return jdbcTemplate.queryForObject("SELECT * FROM account WHERE id = ? ",new Object[]{id}, new BeanPropertyRowMapper(Account.class));
//    }
}
