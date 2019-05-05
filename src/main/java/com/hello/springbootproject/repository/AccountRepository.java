package com.hello.springbootproject.repository;

import com.hello.springbootproject.model.Account;

import java.util.List;

public interface AccountRepository  {

    /**
     * 保存
     * @param account
     * @return
     */
    int save(Account account);

    /**
     * 修改
     * @param account
     * @return
     */
    int update(Account account);

    /**
     * 删除
     * @param account
     * @return
     */
    int delete(Account account);

    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 查找一个对象
     * @param id
     * @return
     */
//    Account findById(String id);
}
