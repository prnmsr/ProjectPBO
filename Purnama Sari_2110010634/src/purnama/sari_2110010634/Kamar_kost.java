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
public class Kamar_kost {
    
    private int idKamar;
    private String kamar;
    private String fasilitasKamar;
    private int kouta;
    private int harga;
    private String waktuSewa;
    private String informasiKamar;

    // Constructor
    public Kamar_kost(int idKamar, String kamar, String fasilitasKamar, int kouta, int harga, String waktuSewa, String informasiKamar) {
        this.idKamar = idKamar;
        this.kamar = kamar;
        this.fasilitasKamar = fasilitasKamar;
        this.kouta = kouta;
        this.harga = harga;
        this.waktuSewa = waktuSewa;
        this.informasiKamar = informasiKamar;
    }

    // Getter dan Setter untuk properti idKamar
    public int getidKamar() {
        return idKamar;
    }

    public void setidKamar(int idKamar) {
        this.idKamar = idKamar;
    }

    // Getter dan Setter untuk properti kamar
    public String getKamar() {
        return kamar;
    }

    public void setKamar(String kamar) {
        this.kamar = kamar;
    }

    // Getter dan Setter untuk properti fasilitasKamar
    public String getFasilitasKamar() {
        return fasilitasKamar;
    }

    public void setFasilitasKamar(String fasilitasKamar) {
        this.fasilitasKamar = fasilitasKamar;
    }

    // Getter dan Setter untuk properti kouta
    public int getKouta() {
        return kouta;
    }

    public void setKouta(int kouta) {
        this.kouta = kouta;
    }

    // Getter dan Setter untuk properti harga
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Getter dan Setter untuk properti waktuSewa
    public String getWaktuSewa() {
        return waktuSewa;
    }

    public void setWaktuSewa(String waktuSewa) {
        this.waktuSewa = waktuSewa;
    }

    // Getter dan Setter untuk properti informasiKamar
    public String getInformasiKamar() {
        return informasiKamar;
    }

    public void setInformasiKamar(String informasiKamar) {
        this.informasiKamar = informasiKamar;
    }
    
    public void displayInfo(){
        System.out.println("idKamar : " + idKamar);
        System.out.println("kamar : " + kamar);
        System.out.println("fasilitasKamar : " + fasilitasKamar);
        System.out.println("kouta : " + kouta);
        System.out.println("harga : " + harga);
        System.out.println("waktuSewa : " + waktuSewa);
        System.out.println("informasiKamar : " + informasiKamar);
    }
}
