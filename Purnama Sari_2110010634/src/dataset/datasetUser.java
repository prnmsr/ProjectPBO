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
public class datasetUser {
    private ArrayList<Integer> idUser;
    private ArrayList<String> noIdentitas;
    private ArrayList<String> jenisId;
    private ArrayList<String> nama;
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> email;
    private ArrayList<String> tempatLahir;
    private ArrayList<String> tanggalLahir;
    private ArrayList<String> jenisKelamin;
    private ArrayList<String> telphone;
    private ArrayList<String> status;
    
    //constructor
    public datasetUser (){
        idUser = new ArrayList<Integer>();
        noIdentitas = new ArrayList<String>();
        jenisId = new ArrayList<String>();
        nama = new ArrayList<String>();
        username = new ArrayList<String>();
        password = new ArrayList<String>();
        email = new ArrayList<String>();
        tempatLahir = new ArrayList<String>();
        tanggalLahir = new ArrayList<String>();
        jenisKelamin = new ArrayList<String>();
        telphone = new ArrayList<String>();
        status = new ArrayList<String>();
    }
    
    public void insertidUser(Integer isi){
        this.idUser.add(isi);
    }
    public ArrayList<Integer> getdatsetidUser(){
        return this.idUser;
    }
     
    public void insertnoIdentitas(String isi){
        this.noIdentitas.add(isi);
    }
     public ArrayList<String> getdatasetnoIdentitas(){
        return this.noIdentitas;
    }
    
    public void insertjenisId(String isi){
        this.jenisId.add(isi);
    }
     public ArrayList<String> getdatasetjenisId(){
        return this.jenisId;
    }
     
    public void insertnama(String isi){
        this.nama.add(isi);
    }
     public ArrayList<String> getdatasetnama(){
        return this.nama;
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
    
    public void insertemail(String isi){
        this.email.add(isi);
    }
     public ArrayList<String> getdatasetemail(){
        return this.email;
    }
     
    public void inserttempatLahir(String isi){
        this.tanggalLahir.add(isi);
    }
     public ArrayList<String> getdatasettempatLahir(){
        return this.tanggalLahir;
    }
    
    public void inserttanggalLahir(String isi){
        this.tanggalLahir.add(isi);
    }
     public ArrayList<String> getdatasettanggalLahir(){
        return this.tanggalLahir;
    }
     
    public void insertjenisKelamin(String isi){
        this.jenisKelamin.add(isi);
    }
     public ArrayList<String> getdatasetjenisKelamin(){
        return this.jenisKelamin;
    }
    
    public void inserttelphone(String isi){
        this.telphone.add(isi);
    }
     public ArrayList<String> getdatasettelphone(){
        return this.telphone;
    }
     
    public void insertstatus(String isi){
        this.status.add(isi);
    }
     public ArrayList<String> getdatasetstatus(){
        return this.status;
    }
}
