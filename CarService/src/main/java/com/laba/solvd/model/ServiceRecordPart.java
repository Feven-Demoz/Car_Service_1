package com.laba.solvd.model;

import java.util.Objects;

public class ServiceRecordPart {

    private int countRecord;
    private Part part;
    private ServiceRecord serviceRecord;

    public ServiceRecordPart(int countRecord, Part part, ServiceRecord serviceRecord) {
        this.countRecord = countRecord;
        this.part = part;
        this.serviceRecord = serviceRecord;
    }

    public ServiceRecordPart (){

    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public ServiceRecord getServiceRecord() {
        return serviceRecord;
    }

    public void setServiceRecord(ServiceRecord serviceRecord) {
        this.serviceRecord = serviceRecord;
    }

    public int getCountRecord() {
        return countRecord;
    }

    public void setCountRecord(int countRecord) {
        this.countRecord = countRecord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceRecordPart that = (ServiceRecordPart) o;
        return getCountRecord() == that.getCountRecord() && Objects.equals(getPart(), that.getPart()) && Objects.equals(getServiceRecord(), that.getServiceRecord());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountRecord(), getPart(), getServiceRecord());
    }

    @Override
    public String toString() {
        return "ServiceRecordPart{" +
                "countRecord=" + countRecord +
                ", part=" + part +
                ", serviceRecord=" + serviceRecord +
                '}';
    }
}
