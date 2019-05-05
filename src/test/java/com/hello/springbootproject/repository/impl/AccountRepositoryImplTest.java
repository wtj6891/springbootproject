package com.hello.springbootproject.repository.impl;

import com.hello.springbootproject.model.Account;
import com.hello.springbootproject.repository.AccountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountRepositoryImplTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test public void save() throws Exception {
        Account account = new Account();
        account.setUsername("linghu");
        account.setPassword("234567");
        accountRepository.save(account);
    }

    @Test public void update() throws Exception {
    }

    @Test public void delete() throws Exception {
    }

    @Test public void findAll() throws Exception {
    }

}