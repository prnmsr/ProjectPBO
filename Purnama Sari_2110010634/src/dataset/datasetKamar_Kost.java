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
public class datasetKamar_Kost {
    private ArrayList<Integer> idKamar;
    private ArrayList<String> kamar;
    private ArrayList<String> fasilitasKamar;
    private ArrayList<Integer> kouta;
    private ArrayList<Integer> harga;
    private ArrayList<String> waktuSewa;
    private ArrayList<String> informasiKamar;
    
    //constructor
    public datasetKamar_Kost (){
        idKamar= new ArrayList<Integer>();
        kamar= new ArrayList<String>();
        fasilitasKamar= new ArrayList<String>();
        kouta= new ArrayList<Integer>();
        harga= new ArrayList<Integer>();
        waktuSewa= new ArrayList<String>();
        informasiKamar= new ArrayList<String>();
    }
    
    public void insertidKamar(Integer isi){
        this.idKamar.add(isi);
    }
    public ArrayList<Integer> getdatsetidKamar(){
        return this.idKamar;
    }
     
    public void insertkamar(String isi){
        this.kamar.add(isi);
    }
     public ArrayList<String> getdatasetkamar(){
        return this.kamar;
    }
     
    public void insertfasilitasKamar(String isi){
        this.fasilitasKamar.add(isi);
    }
     public ArrayList<String> getdatasetfasilitasKamar(){
        return this.fasilitasKamar;
    }
     
    public void insertkouta(Integer isi){
        this.kouta.add(isi);
    }
     public ArrayList<Integer> getdatasetkouta(){
        return this.kouta;
    }
     
    public void insertharga(Integer isi){
        this.harga.add(isi);
    }
     public ArrayList<Integer> getdatasetharga(){
        return this.harga;
    }
     
    public void insertwaktuSewa(String isi){
        this.waktuSewa.add(isi);
    }
     public ArrayList<String> getdatasetwaktuSewa(){
        return this.waktuSewa;
    }
     
    public void insertinformasiKamar(String isi){
        this.informasiKamar.add(isi);
    }
     public ArrayList<String> getdatasetinformasiKamar(){
        return this.informasiKamar;
    }
    
}
