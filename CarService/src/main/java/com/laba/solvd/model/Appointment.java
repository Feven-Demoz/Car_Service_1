package com.laba.solvd.model;

import java.util.Date;
import java.util.Objects;

public class Appointment {
    private int id;
    private int carId;
    private int customersId;
    private Date appointmentDate;
    private String serviceType;

    public Appointment(int id, int carId, int customersId, Date appointmentDate, String serviceType) {
        this.id = id;
        this.carId = carId;
        this.customersId = customersId;
        this.appointmentDate = appointmentDate;
        this.serviceType = serviceType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCustomersId() {
        return customersId;
    }

    public void setCustomersId(int customersId) {
        this.customersId = customersId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return getId() == that.getId() && getCarId() == that.getCarId() && getCustomersId() == that.getCustomersId() && Objects.equals(getAppointmentDate(), that.getAppointmentDate()) && Objects.equals(getServiceType(), that.getServiceType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCarId(), getCustomersId(), getAppointmentDate(), getServiceType());
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", carId=" + carId +
                ", customersId=" + customersId +
                ", appointmentDate=" + appointmentDate +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}
