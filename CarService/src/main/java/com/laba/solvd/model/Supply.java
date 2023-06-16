package com.laba.solvd.model;
import java.util.List;
import java.util.Objects;

public class Supply {
    private int id;
    private String name;
    private String address;
    private String phone;
    private Part part;
    private List<Inventory> inventoryList;

    public Supply(int id, String name, String address, String phone, Part part, List<Inventory> inventoryList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.part = part;
        this.inventoryList = inventoryList;
    }

    public Supply(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supply supply = (Supply) o;
        return getId() == supply.getId() && Objects.equals(getName(), supply.getName()) && Objects.equals(getAddress(), supply.getAddress()) && Objects.equals(getPhone(), supply.getPhone()) && Objects.equals(getPart(), supply.getPart());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress(), getPhone(), getPart());
    }

    @Override
    public String toString() {
        return "Supply{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", part=" + part +
                ", inventoryList=" + inventoryList +
                '}';
    }
}
