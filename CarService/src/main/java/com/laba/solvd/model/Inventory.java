package com.laba.solvd.model;

import java.util.Objects;

public class Inventory {
    private int suppliesId;
    private int partsId;
    private int quantity;

    public Inventory(int suppliesId, int partsId, int quantity) {
        this.suppliesId = suppliesId;
        this.partsId = partsId;
        this.quantity = quantity;
    }
    public Inventory(){

    }
    public int getSuppliesId() {
        return suppliesId;
    }

    public void setSuppliesId(int suppliesId) {
        this.suppliesId = suppliesId;
    }

    public int getPartsId() {
        return partsId;
    }

    public void setPartsId(int partsId) {
        this.partsId = partsId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return getSuppliesId() == inventory.getSuppliesId() && getPartsId() == inventory.getPartsId() && getQuantity() == inventory.getQuantity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSuppliesId(), getPartsId(), getQuantity());
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "suppliesId=" + suppliesId +
                ", partsId=" + partsId +
                ", quantity=" + quantity +
                '}';
    }
}
