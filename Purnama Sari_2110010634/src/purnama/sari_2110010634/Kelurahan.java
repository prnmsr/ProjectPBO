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
public class Kelurahan {
    
    private int idKelurahan;
    private String namaKelurahan;
    
    // Constructor
    public Kelurahan(int idKelurahan, String namaKelurahan) {
        this.idKelurahan = idKelurahan;
        this.namaKelurahan = namaKelurahan;
    }
    
    // Getter dan Setter untuk properti idKelurahan
     public int getidKelurahan() {
        return idKelurahan;
    }
    
    public void setidKelurahan(int idKelurahan) {
        this.idKelurahan = idKelurahan;
    }
    
    // Getter dan Setter untuk properti namaKelurahan
    public String getNamaKelurahan() {
        return namaKelurahan;
    }
    
    public void setNamaKelurahan(String namaKelurahan) {
        this.namaKelurahan = namaKelurahan;
    }
    
    public void displayInfo(){
        System.out.println("idKelurahan : " + idKelurahan);
        System.out.println("namaKelurahan : " + namaKelurahan);
    }
}
