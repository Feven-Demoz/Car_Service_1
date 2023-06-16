package com.laba.solvd.model;

import java.util.Date;
import java.util.Objects;

public class Payment {
    private int id;
    private Date date;
    private String paymentMethod;
    private double amount;
    private int invoicesId;

    public Payment(int id, Date date, String paymentMethod, double amount, int invoicesId) {
        this.id = id;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.invoicesId = invoicesId;
    }
    public Payment(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getInvoicesId() {
        return invoicesId;
    }

    public void setInvoicesId(int invoicesId) {
        this.invoicesId = invoicesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return getId() == payment.getId() && Double.compare(payment.getAmount(), getAmount()) == 0 && getInvoicesId() == payment.getInvoicesId() && Objects.equals(getDate(), payment.getDate()) && Objects.equals(getPaymentMethod(), payment.getPaymentMethod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDate(), getPaymentMethod(), getAmount(), getInvoicesId());
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", date=" + date +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                ", invoicesId=" + invoicesId +
                '}';
    }
}
