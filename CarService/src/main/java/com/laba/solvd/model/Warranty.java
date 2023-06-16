package com.laba.solvd.model;

import java.util.Date;
import java.util.Objects;

public class Warranty {
    private int id;
    private String type;
    private Date startDate;
    private Date endDate;
    private int carsId;

    public Warranty(int id, String type, Date startDate, Date endDate, int carsId) {
        this.id = id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.carsId = carsId;
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

    public int getCarsId() {
        return carsId;
    }

    public void setCarsId(int carsId) {
        this.carsId = carsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warranty warranty = (Warranty) o;
        return getId() == warranty.getId() && getCarsId() == warranty.getCarsId() && Objects.equals(getType(), warranty.getType()) && Objects.equals(getStartDate(), warranty.getStartDate()) && Objects.equals(getEndDate(), warranty.getEndDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getStartDate(), getEndDate(), getCarsId());
    }

    @Override
    public String toString() {
        return "Warranty{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", carsId=" + carsId +
                '}';
    }
}
