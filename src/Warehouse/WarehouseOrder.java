/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warehouse;

import java.util.HashMap;

/**
 *
 * @author saurabhsrivastava
 */
public class WarehouseOrder {
    
    String orderId;
    String equipName;
    String status;
    String orderAmount;
    String deliveryAgencyId;
    String quantity;
    boolean isDelivered;

    public WarehouseOrder(String orderId, String equipName, String orderAmount, String quantity, boolean isDelivered) {
        this.orderId = orderId;
        this.equipName = equipName;
        this.orderAmount = orderAmount;
        this.quantity = quantity;
        this.isDelivered = isDelivered;
    }
    
    
    
    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public boolean isIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(boolean isDelivered) {
        this.isDelivered = isDelivered;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getDeliveryAgencyId() {
        return deliveryAgencyId;
    }

    public void setDeliveryAgencyId(String deliveryAgencyId) {
        this.deliveryAgencyId = deliveryAgencyId;
    }

    @Override
    public String toString() {
        return orderId;
    }
    
    
    
}
