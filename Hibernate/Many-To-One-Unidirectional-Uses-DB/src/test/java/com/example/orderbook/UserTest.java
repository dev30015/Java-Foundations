package com.example.orderbook;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserTest {
    @Resource
    private UserRepository userRespo;

    @Test
    void test() {
        for(User user:userRespo.findAll()) {
            System.out.println(user);
        }
    }
}
