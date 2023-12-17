/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PRAKTIKUM_PERPUS;

/**
 *
 * @author FIRKY PRIBADY
 */
public class pengembalian extends Peminjaman{
    String tgl_pengembalian,statusBuku;
    void dataWawi(String nama){
        this.nama = nama;
    }
    void dataNim(String nim){
        this.nim =  nim; 
    }
    void dataJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    void dataJml(int jml_buku){
        this.jml_buku = jml_buku;
    }
    void dataPinjam(String tgl_pinjam){
        this.tgl_pinjam = tgl_pinjam;
    }
    void dataKembali(String tgl_pengembalian){
        this.tgl_pengembalian = tgl_pengembalian;
    }
    void dataStatus(String statusBuku){
        this.statusBuku = statusBuku;
    }
    String cetakWawi(){
        return nama;
    }
    String cetakNim(){
        return nim;
    }
    String cetakJurusan(){
        return jurusan;
    }
    int cetakJml(){
        return jml_buku;
    }
    String cetakPinjam(){
        return tgl_pinjam;
    }
    String cetakKembali(){
        return tgl_pengembalian;
    }
    String cetakStat(){
        return statusBuku;
    }
    pengembalian(){
        nama = "Juan Mushofa Aris";
        nim = "2218051";
        jurusan = "Teknik Informatika";
        jml_buku = 5;
        tgl_pinjam = "30 Desember 3030";
        tgl_pengembalian = "4 Januari 3031";
        statusBuku = "Kurang";
    }
}
