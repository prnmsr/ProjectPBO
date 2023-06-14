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
public class datasetAdmin {
    private ArrayList<Integer> idAdmin;
    private ArrayList<String> username;
    private ArrayList<String> password;
    
    //constructor
    public datasetAdmin (){
        idAdmin= new ArrayList<Integer>();
        username= new ArrayList<String>();
        password= new ArrayList<String>();
    }
    
    public void insertidAdmin(Integer isi){
        this.idAdmin.add(isi);
    }
     public ArrayList<Integer> getdatasetidAdmin(){
        return this.idAdmin;
    }
     
     public void insertusername(String isi){
       this.username.add(isi);
    }
     public ArrayList<String> getdatasetusername(){
        return this.username;
    }
     
     public void insertpassword(String isi){
       this.password.add(isi);
    }
     public ArrayList<String> getdatasetpassword(){
        return this.password;
    }
     
}
