package com.laba.solvd.model;

import java.util.Objects;

public class Car {
    private int id;
    private int customersId;
    private String licensePlate;
    private String make;
    private int year;

    public Car(int id, int customersId, String licensePlate, String make, int year) {
        this.id = id;
        this.customersId = customersId;
        this.licensePlate = licensePlate;
        this.make = make;
        this.year = year;
    }
   public Car () {

   }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomersId() {
        return customersId;
    }

    public void setCustomersId(int customersId) {
        this.customersId = customersId;
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
        return getId() == car.getId() && getCustomersId() == car.getCustomersId() && getYear() == car.getYear() && Objects.equals(getLicensePlate(), car.getLicensePlate()) && Objects.equals(getMake(), car.getMake());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCustomersId(), getLicensePlate(), getMake(), getYear());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", customersId=" + customersId +
                ", licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}
