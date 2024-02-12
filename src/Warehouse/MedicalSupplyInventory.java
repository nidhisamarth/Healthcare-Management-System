/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warehouse;

/**
 *
 * @author saurabhsrivastava
 */
public class MedicalSupplyInventory {
    String id;
    String equipName;
    String price;
    String quantity;

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MedicalSupplyInventory(String id, String equipName, String price, String quantity) {
        this.id = id;
        this.equipName = equipName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  equipName;
    }
    
    
}
