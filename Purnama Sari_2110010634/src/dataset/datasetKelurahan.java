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
public class datasetKelurahan {
    private ArrayList<Integer> idKelurahan;
    private ArrayList<String> namaKelurahan;
    
    //constructor
    public datasetKelurahan (){
        idKelurahan = new ArrayList<Integer>();
        namaKelurahan = new ArrayList<String>();
    }
    
    public void insertidKelurahan(Integer isi){
        this.idKelurahan.add(isi);
    }
    public ArrayList<Integer> getdatasetidKelurahan(){
        return this.idKelurahan;
    }
     
    public void insertnamaKelurahan(String isi){
        this.namaKelurahan.add(isi);
    }
     public ArrayList<String> getdatasetnamaKelurahan(){
        return this.namaKelurahan;
    }
    
}
