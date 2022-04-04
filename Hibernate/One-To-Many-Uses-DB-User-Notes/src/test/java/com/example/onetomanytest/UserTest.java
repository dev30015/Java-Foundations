package com.example.onetomanytest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UserTest {

    @Resource
    private UserRepository userRespo;

    @Test
    void testUser() {
        List<User> users = userRespo.findAll();
        for(User user:users) {
            System.out.println(user);
        }
    }
}
