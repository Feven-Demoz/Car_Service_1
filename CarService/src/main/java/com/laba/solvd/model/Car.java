package com.laba.solvd.model;

import java.util.Objects;

public class Car {
    private int id;
    private String licensePlate;
    private String make;
    private int year;
    private Customer customer;
    private Warranty warranty;

    public Car(int id, String licensePlate, String make, int year, Customer customer, Warranty warranty) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.make = make;
        this.year = year;
        this.customer = customer;
        this.warranty = warranty;
    }

   public Car () {

   }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getId() == car.getId() && getYear() == car.getYear() && Objects.equals(getLicensePlate(), car.getLicensePlate()) && Objects.equals(getMake(), car.getMake()) && Objects.equals(getCustomer(), car.getCustomer()) && Objects.equals(getWarranty(), car.getWarranty());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLicensePlate(), getMake(), getYear(), getCustomer(), getWarranty());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", customer=" + customer +
                ", warranty=" + warranty +
                '}';
    }
}
