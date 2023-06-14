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
public class Kecamatan {
    
    private int idKecamatan;
    private String namaKecamatan;
    
    // Constructor
    public Kecamatan(int idKecamatan, String namaKecamatan) {
        this.idKecamatan = idKecamatan;
        this.namaKecamatan = namaKecamatan;
    }
    
    // Getter dan Setter untuk properti idKecamatan
    public int getidKecamatan() {
        return idKecamatan;
    }
    
    public void setidKecamatan(int idKecamatan) {
        this.idKecamatan = idKecamatan;
    }
    
    // Getter dan Setter untuk properti namaKecamatan
    public String getNamaKecamatan() {
        return namaKecamatan;
    }
    
    public void setNamaKecamatan(String namaKecamatan) {
        this.namaKecamatan = namaKecamatan;
    }
    
    public void displayInfo(){
        System.out.println("idKecamatan : " + idKecamatan);
        System.out.println("namaKecamatan : " + namaKecamatan);
    }
}