package com.example.orderbook;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class OrderTest {

    @Resource
    private OrderRepository orderRespo;

    @Test
    public void test() {
        List<Order> orders = orderRespo.findAll();
        for(Order order:orders) {
            System.out.println(order);
        }
    }
}
