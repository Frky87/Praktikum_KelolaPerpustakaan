/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PRAKTIKUM_PERPUS;

/**
 *
 * @author FIRKY PRIBADY
 */
public class pengurus extends Pemeriksaan {
    String nama,jabatan,alamat;
    private String nomorTelepon;
    
    //method
    void dataNama(String nama){
        this.nama = nama;
    }
    void dataJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    void dataAlamat(String alamat){
        this.alamat = alamat;
    }
    void dataNomor(String nomorTelepon){
        this.nomorTelepon = nomorTelepon;
    }
    
    String cetakNama(){
        return nama;
    }
    String cetakJabatan(){
        return jabatan;
    }
    String cetakAlamat(){
        return alamat;
    }
    String cetakNomor(){
        return nomorTelepon;
    }
    
      @Override
    void JenisJabatan() {
         String jabatan = "Kepala"+"Sekretaris"+"PJ"+"Bendahara";
    }
    //constructor
    pengurus(){
        nama = "Firky Pribadi";
        jabatan = "Penanggung Jawab";
        alamat = "Singosari";
        nomorTelepon = "0812314543";
    }
    public String getNomorTelepon() {
        return nomorTelepon;
    }
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
    
}
