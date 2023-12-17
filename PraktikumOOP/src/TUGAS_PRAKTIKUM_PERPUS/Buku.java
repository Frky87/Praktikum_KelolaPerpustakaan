/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PRAKTIKUM_PERPUS;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author FIRKY PRIBADY
 */
public class Buku extends pengurus {

    String judul, penerbit, penulis, tahunterbit;
    int stok;

    //inisialisasi data
    void dataJudul(){
        this.judul = "Hadits, Informatika, Qur'an";
    }
    void pilihJudul(){
        System.out.println("Pilih Salah Satu Judul Buku");
    }
    void dataPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    void dataPenulis(String penulis){
        this.penulis = penulis;
    }
    void dataTahunTerbit(String tahunterbit){
        this.tahunterbit = tahunterbit;
    }
    void dataStok(int stok){
        this.stok = stok;
    }
    void dataPenanggungjawab (String nama){
        this.nama = nama;
    }

    //method
    String cetakJudul(){
        return judul;
    }
    String cetakPenerbit(){
        return penerbit;
    }
    String cetakPenulis(){
        return penulis;
    }
    String cetakTahunTerbit(){
        return tahunterbit;
    }
    int cetakStok(){
        return stok;
    }

    //overloading kelola untuk mengelola stok
    int kelola(){
        stok = cetakStok();
        if (stok == 0) {
            try {
                throw new StokKosongException("Stok buku kosong");
            } catch (StokKosongException ex) {
                Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Stok Buku : " + stok);
        }
        return stok;
    }

    //Overriding
    String cetakNama(){
        return nama;
    }

    //konstruktor
    Buku(){
        judul = "Terbitnya Masa Emas Era Milenial";
        penerbit = "Studi Indonesia";
        penulis = "Muhamammad Al kaff";
        tahunterbit = "3030";
        stok = 5;
    }

    void dataJudul(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

//Kelas exception untuk menangani stok buku kosong
class StokKosongException extends Exception {

    public StokKosongException(String pesan){
        super(pesan);
    }
}