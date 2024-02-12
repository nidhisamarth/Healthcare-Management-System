/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warehouse;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saurabhsrivastava
 */
public class Warehouse {
    
    MedicalSupplyInventoryDirectory medicalSupplyInventoryDirectory;
    List<WarehouseOrderList> warehouseOrderListArray;

    public MedicalSupplyInventoryDirectory getMedicalSupplyInventoryDirectory() {
        return medicalSupplyInventoryDirectory;
    }

    public void setMedicalSupplyInventoryDirectory(MedicalSupplyInventoryDirectory medicalSupplyInventoryDirectory) {
        this.medicalSupplyInventoryDirectory = medicalSupplyInventoryDirectory;
    }

    public List<WarehouseOrderList> getWarehouseOrderList() {
        return warehouseOrderListArray;
    }

    public void setWarehouseOrderList( List<WarehouseOrderList> warehouseOrderListArray) {
        this.warehouseOrderListArray = warehouseOrderListArray;
    }
    
    public void addWarehouseOrder(WarehouseOrderList warehouseOrderList) {
        if(warehouseOrderListArray == null) warehouseOrderListArray = new ArrayList();
        warehouseOrderListArray.add(warehouseOrderList);              
    }
    
    public void addMedicalSupplyInventory(MedicalSupplyInventory medicalSupplyInventory) {
        if(medicalSupplyInventoryDirectory == null) medicalSupplyInventoryDirectory = new MedicalSupplyInventoryDirectory();
        medicalSupplyInventoryDirectory.addMedicalSupplyInventory(medicalSupplyInventory);              
    }
    
}
