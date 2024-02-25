/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resto;

import Lobby.LogicResepsionis;
        
public class Chef {
    
    public static void main(String[] args) {
        LogicChef l = new LogicChef();
        System.out.println("Koki malam ini : " + l.koki);
        System.out.println("Menu malam ini : " + l.menu);
        System.out.println("Porsi yang dihidangkan : " + l.porsi);
        LogicResepsionis n = new LogicResepsionis();
        String panggil = n.dipanggil();
        System.out.println("hey, " + panggil);
    }
    
    
}
