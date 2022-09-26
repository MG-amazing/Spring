package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
@Transactional()
public interface AccountService {
   public void transfer(String out, String in, Double money) throws IOException;
}
