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
public class Rumah_kost {
    
    private int idRumahKost;
    private String namaKost;
    private String alamatKost;
    private String fasilitas;
    private String latitude;
    private String longitude;
    private String hargaTerendah;
    private String jenisKost;
    private String attribute52;
    
    public Rumah_kost(int idRumahKost, String namaKost, String alamatKost, String fasilitas, String latitude, String longitude, String hargaTerendah, String jenisKost, String attribute52) {
        this.idRumahKost= idRumahKost;
        this.namaKost = namaKost;
        this.alamatKost = alamatKost;
        this.fasilitas = fasilitas;
        this.latitude = latitude;
        this.longitude = longitude;
        this.hargaTerendah = hargaTerendah;
        this.jenisKost = jenisKost;
        this.attribute52 = attribute52;
    }
    
    //getter dan setter untuk setiap properti
    public int getidRumahKost() {
        return idRumahKost;
    }
    
    public void setidRumahKost(int idRumahKost) {
        this.idRumahKost = idRumahKost;
    }
    
    public String getNamaKost() {
        return namaKost;
    }
    
    public void setNamaKost(String namaKost) {
        this.namaKost = namaKost;
    }
    
    public String getAlamatKost() {
        return alamatKost;
    }
    
    public void setAlamatKost(String alamatKost) {
        this.alamatKost = alamatKost;
    }
    
    public String getFasilitas() {
        return fasilitas;
    }
    
    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }
    
    public String getLatitude() {
        return latitude;
    }
    
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    
    public String getLongitude() {
        return longitude;
    }
    
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    public String getHargaTerendah() {
        return hargaTerendah;
    }
    
    public void setHargaTerendah(String hargaTerendah) {
        this.hargaTerendah = hargaTerendah;
    }
    
    public String getJenisKost() {
        return jenisKost;
    }
    
    public void setJenisKost(String jenisKost) {
        this.jenisKost = jenisKost;
    }
    
    public String getAttribute52() {
        return attribute52;
    }
    
    public void setAttribute52(String attribute52) {
        this.attribute52 = attribute52;
    }
    
    public void displayInfo(){
        System.out.println("idRumahKost : " + idRumahKost);
        System.out.println("namaKost : " + namaKost);
        System.out.println("alamatKost : " + alamatKost);
        System.out.println("fasilitas : " + fasilitas);
        System.out.println("latitude : " + latitude);
        System.out.println("longitude : " + longitude);
        System.out.println("hargaTerendah : " + hargaTerendah);
        System.out.println("jenisKost : " + jenisKost);
        System.out.println("attribute52 : " + attribute52);
    }
}
