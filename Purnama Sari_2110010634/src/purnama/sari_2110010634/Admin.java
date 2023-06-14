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
public class Admin {
    
    private int idAdmin;
    private String username;
    private String password;
    
    // Constructor
    public Admin(int idAdmin, String username, String password) {
        this.idAdmin = idAdmin;
        this.username = username;
        this.password = password;
    }
    
    // Getter dan Setter untuk properti idAdmin
    public Integer getidAdmin() {
        return idAdmin;
    }
    
    public void setidAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    // Getter dan Setter untuk properti username
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    // Getter dan Setter untuk properti password
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void displayInfo(){
        System.out.println("idAdmin : " + idAdmin);
        System.out.println("username : " + username);
        System.out.println("Password : " + password);
    }
}
