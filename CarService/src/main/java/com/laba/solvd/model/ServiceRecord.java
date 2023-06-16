package com.laba.solvd.model;

import java.util.Date;
import java.util.Objects;

public class ServiceRecord {
    private int id;
    private String description;
    private Date date;
    private int carId;

    public ServiceRecord(int id, String description, Date date, int carId) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.carId = carId;
    }
    public ServiceRecord(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceRecord that = (ServiceRecord) o;
        return getId() == that.getId() && getCarId() == that.getCarId() && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getDate(), that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getDate(), getCarId());
    }

    @Override
    public String toString() {
        return "ServiceRecord{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", carId=" + carId +
                '}';
    }
}
