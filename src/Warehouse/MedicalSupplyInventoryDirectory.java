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
public class MedicalSupplyInventoryDirectory {
    ArrayList<MedicalSupplyInventory> medicalSupplyInventoryList = new ArrayList<>();

    public ArrayList<MedicalSupplyInventory> getMedicalSupplyInventoryList() {
        return medicalSupplyInventoryList;
    }

    public void setMedicalSupplyInventoryList(ArrayList<MedicalSupplyInventory> medicalSupplyInventoryList) {
        this.medicalSupplyInventoryList = medicalSupplyInventoryList;
    }
    
    public void addMedicalSupplyInventory(MedicalSupplyInventory medicalSupplyInventory) {
        medicalSupplyInventoryList.add(medicalSupplyInventory);
    }
   
    
}
