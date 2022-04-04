package com.example.onetomanydb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class CartTest {

    @Resource
    private CartRepository cartRespo;

    @Test
    public void test() {
        List<Cart> carts = cartRespo.findAll();
        for(Cart cart:carts) {
            System.out.println(cart);
        }

    }
}
