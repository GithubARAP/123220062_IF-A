/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lobby;


public class LogicResepsionis {
    
    public LogicResepsionis(){
        notif = "resepsionis dipanggil oleh chef";
        nama = "Khaenn";
        tinggi = "165 cm";
        dresscode = "Merah marun";
        
    }
    public String nama = "";
    public String tinggi = "";
    public String dresscode = "";
    public static String notif = "";  
    
    public LogicResepsionis(String nama, String tinggi, String dresscode){
        this.nama += nama;
        this.tinggi += tinggi;
        this.dresscode += dresscode;
    }
    public String dipanggil(){
        return notif;
    }
}
