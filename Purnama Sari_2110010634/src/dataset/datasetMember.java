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
public class datasetMember {
    private ArrayList<Integer> idMember;
    private ArrayList<String> nama;
    private ArrayList<String> noKTP;
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> alamat;
    private ArrayList<String> tempatLahir;
    private ArrayList<String> tanggalLahir;
    private ArrayList<String> jenisKelamin;
    private ArrayList<String> noHP;
    private ArrayList<String> email;
    private ArrayList<String> attribute52;
    
    //constructor
    public datasetMember (){
        idMember = new ArrayList<Integer>();
        nama = new ArrayList<String>();
        noKTP = new ArrayList<String>();
        username = new ArrayList<String>();
        password = new ArrayList<String>();
        alamat = new ArrayList<String>();
        tempatLahir = new ArrayList<String>();
        tanggalLahir = new ArrayList<String>();
        jenisKelamin = new ArrayList<String>();
        noHP = new ArrayList<String>();
        email = new ArrayList<String>();
        attribute52 = new ArrayList<String>();
    }
    
    public void insertidMember(Integer isi){
        this.idMember.add(isi);
    }
    public ArrayList<Integer> getdatsetidMember(){
        return this.idMember;
    }
     
    public void insertnama(String isi){
        this.nama.add(isi);
    }
     public ArrayList<String> getdatasetnama(){
        return this.nama;
    }
    
    public void insertnoKTP(String isi){
        this.noKTP.add(isi);
    }
     public ArrayList<String> getdatasetnoKTP(){
        return this.noKTP;
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
     
    public void insertalamat(String isi){
        this.alamat.add(isi);
    }
     public ArrayList<String> getdatasetalamat(){
        return this.alamat;
    }
    
    public void inserttempatLahir(String isi){
        this.tempatLahir.add(isi);
    }
     public ArrayList<String> getdatasettempatLahir(){
        return this.tempatLahir;
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
     
    public void insertnoHP(String isi){
        this.noHP.add(isi);
    }
     public ArrayList<String> getdatasetnoHP(){
        return this.noHP;
    }
    
    public void insertemail(String isi){
        this.email.add(isi);
    }
     public ArrayList<String> getdatasetemail(){
        return this.email;
    }
     
    public void insertattribute52(String isi){
        this.attribute52.add(isi);
    }
     public ArrayList<String> getdatasetattribute52(){
        return this.attribute52;
    }
    
}
