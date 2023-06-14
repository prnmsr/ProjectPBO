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
public class Tb_peringatan {
    
    private int id;
    private String phone;
    private String tgKamar;
    
    // Constructor
    public Tb_peringatan(int id, String phone, String tgKamar) {
        this.id = id;
        this.phone = phone;
        this.tgKamar = tgKamar;
    }
    
    // Getter dan Setter untuk properti id
    public int getid() {
        return id;
    }
    
    public void setid(int id) {
        this.id = id;
    }
    
    // Getter dan Setter untuk properti phone
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    // Getter dan Setter untuk properti tgKamar
    public String getTgKamar() {
        return tgKamar;
    }
    
    public void setTgKamar(String tgKamar) {
        this.tgKamar = tgKamar;
    }
    
    public void displayInfo(){
        System.out.println("id : " + id);
        System.out.println("phone : " + phone);
        System.out.println("tgKamar : " + tgKamar);
    }
}
