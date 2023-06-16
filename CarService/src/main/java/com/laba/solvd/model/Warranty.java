package com.laba.solvd.model;

import java.util.Date;
import java.util.Objects;

public class Warranty {
    private int id;
    private String type;
    private Date startDate;
    private Date endDate;
    private Car car;

    public Warranty(int id, String type, Date startDate, Date endDate, Car car) {
        this.id = id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.car = car;
    }

    public Warranty(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warranty warranty = (Warranty) o;
        return getId() == warranty.getId() && Objects.equals(getType(), warranty.getType()) && Objects.equals(getStartDate(), warranty.getStartDate()) && Objects.equals(getEndDate(), warranty.getEndDate()) && Objects.equals(getCar(), warranty.getCar());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getStartDate(), getEndDate(), getCar());
    }

    @Override
    public String toString() {
        return "Warranty{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", car=" + car +
                '}';
    }
}
