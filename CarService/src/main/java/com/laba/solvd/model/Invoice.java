package com.laba.solvd.model;

import java.util.Date;
import java.util.Objects;

public class Invoice {
    private int id;
    private double totalAmount;
    private Date date;
    private int serviceRecordId;
    private int customersId;

    public Invoice(int id, double totalAmount, Date date, int serviceRecordId, int customersId) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.date = date;
        this.serviceRecordId = serviceRecordId;
        this.customersId = customersId;
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

    public int getServiceRecordId() {
        return serviceRecordId;
    }

    public void setServiceRecordId(int serviceRecordId) {
        this.serviceRecordId = serviceRecordId;
    }

    public int getCustomersId() {
        return customersId;
    }

    public void setCustomersId(int customersId) {
        this.customersId = customersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return getId() == invoice.getId() && Double.compare(invoice.getTotalAmount(), getTotalAmount()) == 0 && getServiceRecordId() == invoice.getServiceRecordId() && getCustomersId() == invoice.getCustomersId() && Objects.equals(getDate(), invoice.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTotalAmount(), getDate(), getServiceRecordId(), getCustomersId());
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", totalAmount=" + totalAmount +
                ", date=" + date +
                ", serviceRecordId=" + serviceRecordId +
                ", customersId=" + customersId +
                '}';
    }
}
