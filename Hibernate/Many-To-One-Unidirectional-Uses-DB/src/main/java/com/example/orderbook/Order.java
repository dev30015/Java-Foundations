package com.example.orderbook;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Objects;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="oid")
    private long id;

    @Column(name="content")
    private String content;

    @Column(name="price")
    private float price;

    @ManyToOne
    @JoinColumn(name = "ordered_by")
    private User orderedBy;

    @Column(name="order_placed")
    private Calendar orderPlaced;

    @Column(name="order_execution_date")
    private Calendar executedDate;

    @Column(name="executed")
    private boolean executed;

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public User getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(User orderedBy) {
        this.orderedBy = orderedBy;
    }

    public Calendar getOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(Calendar orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public Calendar getExecutedDate() {
        return executedDate;
    }

    public void setExecutedDate(Calendar executedDate) {
        this.executedDate = executedDate;
    }

    public boolean isExecuted() {
        return executed;
    }

    public void setExecuted(boolean executed) {
        this.executed = executed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, price, orderedBy, orderPlaced, executedDate, executed);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", price=" + price +
                ", orderedBy=" + orderedBy +
                ", orderPlaced=" + orderPlaced +
                ", executedDate=" + executedDate +
                ", executed=" + executed +
                '}';
    }
}
