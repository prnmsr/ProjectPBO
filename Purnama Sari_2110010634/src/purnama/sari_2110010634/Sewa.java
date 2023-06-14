/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purnama.sari_2110010634;
import java.util.ArrayList;

/**
 *
 * @author TOSHIBA
 */
import java.util.Date;

public class Sewa {
    
    private int idSewa;
    private String tanggal;
    private String akhirSewa;
    private String status;
    
    public Sewa(int idSewa, String tanggal, String akhirSewa, String status) {
        this.idSewa= idSewa;
        this.tanggal = tanggal;
        this.akhirSewa = akhirSewa;
        this.status = status;
    }
    
    // getter dan setter untuk setiap properti
    public int getidSewa() {
        return idSewa;
    }
    
    public void setidSewa(int idSewa) {
        this.idSewa = idSewa;
    }
    
    public String getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public String getAkhirSewa() {
        return akhirSewa;
    }
    
    public void setAkhirSewa(String akhirSewa) {
        this.akhirSewa = akhirSewa;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void displayInfo(){
        System.out.println("idSewa : " + idSewa);
        System.out.println("tanggal : " + tanggal);
        System.out.println("akhirSewa : " + akhirSewa);
        System.out.println("status : " + status);
    }
}
