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
public class datsetSewa {
    private ArrayList<Integer> idSewa;
    private ArrayList<String> tanggal;
    private ArrayList<String> akhirSewa;
    private ArrayList<String> status;
    
    //constructor
    public datsetSewa (){
        idSewa = new ArrayList<Integer>();
        tanggal = new ArrayList<String>();
        akhirSewa = new ArrayList<String>();
        status = new ArrayList<String>();
    }
    
    public void insertidSewa(Integer isi){
        this.idSewa.add(isi);
    }
    public ArrayList<Integer> getdatsetidSewa(){
        return this.idSewa;
    }
     
    public void inserttanggal(String isi){
        this.tanggal.add(isi);
    }
     public ArrayList<String> getdatasettanggal(){
        return this.tanggal;
    }
    
    public void insertakhirSewa(String isi){
        this.akhirSewa.add(isi);
    }
     public ArrayList<String> getdatasetakhirSewa(){
        return this.akhirSewa;
    }
     
    public void insertstatus(String isi){
        this.status.add(isi);
    }
     public ArrayList<String> getdatasetstatus(){
        return this.status;
    }
    
}
