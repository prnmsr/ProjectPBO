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
public class datasetTb_peringatan {
    private ArrayList<Integer> id;
    private ArrayList<String> phone;
    private ArrayList<String> tgKamar;
    
    //constructor
    public datasetTb_peringatan (){
        id = new ArrayList<Integer>();
        phone = new ArrayList<String>();
        tgKamar = new ArrayList<String>();
    }
    
    public void insertid(Integer isi){
        this.id.add(isi);
    }
    public ArrayList<Integer> getdatsetid(){
        return this.id;
    }
     
    public void insertphone(String isi){
        this.phone.add(isi);
    }
     public ArrayList<String> getdatasetphone(){
        return this.phone;
    }
    
    public void inserttgKamar(String isi){
        this.tgKamar.add(isi);
    }
     public ArrayList<String> getdatasettgKamar(){
        return this.tgKamar;
    }
    
}
