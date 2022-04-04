package com.example.onetomanydb;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="Cart")
public class Cart {

    @Id
    @GeneratedValue
    @Column(name="cart_id")
    private int cartId;

    @OneToMany(mappedBy="cart")
    private List<Items> items = new LinkedList<>();

    public Cart() {
    }

    public Cart(int cartId, List<Items> items) {
        this.cartId = cartId;
        this.items = items;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return cartId == cart.cartId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartId);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId+"}";
    }
}
