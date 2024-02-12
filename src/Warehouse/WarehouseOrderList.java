/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warehouse;

import java.util.ArrayList;

/**
 *
 * @author saurabhsrivastava
 */
public class WarehouseOrderList {
    
    String id;
    String totalAmount;
    ArrayList<WarehouseOrder> warehouseOrderList = new ArrayList<>();

    public ArrayList<WarehouseOrder> getWarehouseOrderList() {
        return warehouseOrderList;
    }

    public void setWarehouseOrderList(ArrayList<WarehouseOrder> warehouseOrderList) {
        this.warehouseOrderList = warehouseOrderList;
    }
    
    public void addWarehouseOrder(WarehouseOrder warehouseOrder) {
        warehouseOrderList.add(warehouseOrder);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WarehouseOrderList(String id, ArrayList<WarehouseOrder> warehouseOrderList) {
        this.id = id;
        this.warehouseOrderList = warehouseOrderList;
    }

    public WarehouseOrderList() {
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
    
    
    
    
}
