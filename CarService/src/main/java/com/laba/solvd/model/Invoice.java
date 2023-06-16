package com.laba.solvd.model;

import java.util.Date;
import java.util.Objects;

public class Invoice {
    private int id;
    private double totalAmount;
    private Date date;
    private ServiceRecord serviceRecord;
    private Customer customer;

    public Invoice(int id, double totalAmount, Date date, ServiceRecord serviceRecord, Customer customer) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.date = date;
        this.serviceRecord = serviceRecord;
        this.customer = customer;
    }

    public Invoice(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ServiceRecord getServiceRecord() {
        return serviceRecord;
    }

    public void setServiceRecord(ServiceRecord serviceRecord) {
        this.serviceRecord = serviceRecord;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return getId() == invoice.getId() && Double.compare(invoice.getTotalAmount(), getTotalAmount()) == 0 && Objects.equals(getDate(), invoice.getDate()) && Objects.equals(getServiceRecord(), invoice.getServiceRecord()) && Objects.equals(getCustomer(), invoice.getCustomer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTotalAmount(), getDate(), getServiceRecord(), getCustomer());
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", totalAmount=" + totalAmount +
                ", date=" + date +
                ", serviceRecord=" + serviceRecord +
                ", customer=" + customer +
                '}';
    }
}
