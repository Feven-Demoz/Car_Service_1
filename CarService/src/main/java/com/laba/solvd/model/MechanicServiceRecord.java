//package com.laba.solvd.model;
//
//import java.util.Objects;
//
//public class MechanicServiceRecord {
//    private int serviceRecordId;
//    private int mechanicsId;
//
//    public MechanicServiceRecord(int serviceRecordId, int mechanicsId) {
//        this.serviceRecordId = serviceRecordId;
//        this.mechanicsId = mechanicsId;
//    }
//    public MechanicServiceRecord (){
//
//    }
//
//    public int getServiceRecordId() {
//        return serviceRecordId;
//    }
//
//    public void setServiceRecordId(int serviceRecordId) {
//        this.serviceRecordId = serviceRecordId;
//    }
//
//    public int getMechanicsId() {
//        return mechanicsId;
//    }
//
//    public void setMechanicsId(int mechanicsId) {
//        this.mechanicsId = mechanicsId;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MechanicServiceRecord that = (MechanicServiceRecord) o;
//        return getServiceRecordId() == that.getServiceRecordId() && getMechanicsId() == that.getMechanicsId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getServiceRecordId(), getMechanicsId());
//    }
//
//    @Override
//    public String toString() {
//        return "MechanicServiceRecord{" +
//                "serviceRecordId=" + serviceRecordId +
//                ", mechanicsId=" + mechanicsId +
//                '}';
//    }
//}
