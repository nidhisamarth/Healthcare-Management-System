/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author saurabhsrivastava
 */
public abstract class Role {
    
   
    public enum RoleType{
        Doctor("Doctor"), 
        Receptionist("Receptionist"),
        Technician("Technician"),
        WarehouseAdmin("WarehouseAdmin"),
        DeliveryManager("DeliveryManager"),
        FinanceAdmin("FinanceAdmin");
        private String name;
        
        private RoleType(String name) {
            this.name = name;
        }
        
        String getName() {
            return this.name;
        }
        
        @Override
        public String toString() {
            return name;
        }
        
    }
    
}
