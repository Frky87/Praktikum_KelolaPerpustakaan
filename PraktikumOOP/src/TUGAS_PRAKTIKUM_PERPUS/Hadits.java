/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PRAKTIKUM_PERPUS;

/**
 *
 * @author FIRKY PRIBADY
 */
public class Hadits extends Buku {
    public Hadits(){
        this.judul = "Nurul Iman";
        this.penulis ="Ustad Sholeh";
        this.tahunterbit = "2021";
        this.stok = 57 ;
    }
    void dataPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    String cetakPenerbit(){
        return penerbit;
    }
    void pilihJudul(){
        System.out.println(judul + "buku ini ditulis oleh Ustad Sholeh");
    }
}
