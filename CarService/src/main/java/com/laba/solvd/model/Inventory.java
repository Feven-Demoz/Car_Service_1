package com.laba.solvd.model;

import java.util.Objects;

public class Inventory {

    private int quantity;
    private Supply supply;
    private Part part;

    public Inventory(int quantity, Supply supply, Part part) {
        this.quantity = quantity;
        this.supply = supply;
        this.part = part;
    }

    public Inventory(){

    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return getQuantity() == inventory.getQuantity() && Objects.equals(getSupply(), inventory.getSupply()) && Objects.equals(getPart(), inventory.getPart());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuantity(), getSupply(), getPart());
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "quantity=" + quantity +
                ", supply=" + supply +
                ", part=" + part +
                '}';
    }
}
