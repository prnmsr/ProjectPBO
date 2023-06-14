/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author TOSHIBA
 */
public class datasetRumah_kost {
    private ArrayList<Integer> idRumahKost;
    private ArrayList<String> namaKost;
    private ArrayList<String> alamatKost;
    private ArrayList<String> fasilitas;
    private ArrayList<String> latitude;
    private ArrayList<String> longitude;
    private ArrayList<String> hargaTerendah;
    private ArrayList<String> jenisKost;
    private ArrayList<String> attribute52;
    
    //constructor
    public datasetRumah_kost (){
        idRumahKost = new ArrayList<Integer>();
        namaKost = new ArrayList<String>();
        alamatKost = new ArrayList<String>();
        fasilitas = new ArrayList<String>();
        latitude = new ArrayList<String>();
        longitude = new ArrayList<String>();
        hargaTerendah = new ArrayList<String>();
        jenisKost = new ArrayList<String>();
        attribute52 = new ArrayList<String>();
    }
    
    public void insertidRumahKost(Integer isi){
        this.idRumahKost.add(isi);
    }
    public ArrayList<Integer> getdatasetidRumahKost(){
        return this.idRumahKost;
    }
     
    public void insertnamaKost(String isi){
        this.namaKost.add(isi);
    }
     public ArrayList<String> getdatasetnamaKost(){
        return this.namaKost;
    }
    
    public void insertalamatKost(String isi){
        this.alamatKost.add(isi);
    }
     public ArrayList<String> getdatasetnalamatKost(){
        return this.alamatKost;
    }
     
    public void insertfasilitas(String isi){
        this.fasilitas.add(isi);
    }
     public ArrayList<String> getdatasetfasilitas(){
        return this.fasilitas;
    }
    
    public void insertlatitude(String isi){
        this.latitude.add(isi);
    }
     public ArrayList<String> getdatasetlatitude(){
        return this.latitude;
    }
     
    public void insertlongitude(String isi){
        this.longitude.add(isi);
    }
     public ArrayList<String> getdatasetlongitude(){
        return this.longitude;
    }
    
    public void inserthargaTerendah(String isi){
        this.hargaTerendah.add(isi);
    }
     public ArrayList<String> getdatasethargaTerendah(){
        return this.hargaTerendah;
    }
     
    public void insertjenisKost(String isi){
        this.jenisKost.add(isi);
    }
     public ArrayList<String> getdatasetjenisKost(){
        return this.jenisKost;
    }
    
    public void insertattribute52(String isi){
        this.attribute52.add(isi);
    }
     public ArrayList<String> getdatasetattribute52(){
        return this.attribute52;
    }
    
}
