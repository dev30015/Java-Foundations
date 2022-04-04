package com.example.onetomanydb;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Items")
public class Items {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;

    public Items() {
    }

    public Items(int id, Cart cart) {
        this.id = id;
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return id == items.id && Objects.equals(cart, items.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cart);
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", cart=" + cart +
                '}';
    }
}
