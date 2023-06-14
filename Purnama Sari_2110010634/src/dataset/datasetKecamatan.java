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
public class datasetKecamatan {
    private ArrayList<Integer> idKecamatan;
    private ArrayList<String> namaKecamatan;
    
    //constructor
    public datasetKecamatan (){
        idKecamatan = new ArrayList<Integer>();
        namaKecamatan = new ArrayList<String>();
    }
    
    public void insertidKecamatan(Integer isi){
        this.idKecamatan.add(isi);
    }
    public ArrayList<Integer> getdatssetidKecamatan(){
        return this.idKecamatan;
    }
     
    public void insertnamaKecamatan(String isi){
        this.namaKecamatan.add(isi);
    }
     public ArrayList<String> getdatasetnamaKecamatan(){
        return this.namaKecamatan;
    }
    
}
