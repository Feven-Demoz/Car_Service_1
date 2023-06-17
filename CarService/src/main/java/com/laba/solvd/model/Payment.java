package com.laba.solvd.model;

import java.util.Date;
import java.util.Objects;

public class Payment {
    private int id;
    private Date date;
    private String paymentMethod;
    private double amount;
    private Invoice invoice;

    public Payment(int id, Date date, String paymentMethod, double amount, Invoice invoice) {
        this.id = id;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.invoice = invoice;
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

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return getId() == payment.getId() && Double.compare(payment.getAmount(), getAmount()) == 0 && Objects.equals(getDate(), payment.getDate()) && Objects.equals(getPaymentMethod(), payment.getPaymentMethod()) && Objects.equals(getInvoice(), payment.getInvoice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDate(), getPaymentMethod(), getAmount(), getInvoice());
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", date=" + date +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                ", invoice=" + invoice +
                '}';
    }
}
