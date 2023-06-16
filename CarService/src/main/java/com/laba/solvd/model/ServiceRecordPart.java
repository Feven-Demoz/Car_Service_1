package com.laba.solvd.model;

import java.util.Objects;

public class ServiceRecordPart {
    private int partsId;
    private int serviceRecordId;
    private int countRecord;

    public ServiceRecordPart(int partsId, int serviceRecordId, int countRecord) {
        this.partsId = partsId;
        this.serviceRecordId = serviceRecordId;
        this.countRecord = countRecord;
    }
    public ServiceRecordPart (){

    }

    public int getPartsId() {
        return partsId;
    }

    public void setPartsId(int partsId) {
        this.partsId = partsId;
    }

    public int getServiceRecordId() {
        return serviceRecordId;
    }

    public void setServiceRecordId(int serviceRecordId) {
        this.serviceRecordId = serviceRecordId;
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
        return getPartsId() == that.getPartsId() && getServiceRecordId() == that.getServiceRecordId() && getCountRecord() == that.getCountRecord();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPartsId(), getServiceRecordId(), getCountRecord());
    }

    @Override
    public String toString() {
        return "ServiceRecordPart{" +
                "partsId=" + partsId +
                ", serviceRecordId=" + serviceRecordId +
                ", countRecord=" + countRecord +
                '}';
    }
}
