/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PRAKTIKUM_PERPUS;

/**
 *
 * @author FIRKY PRIBADY
 */
public class pengunjung extends pengurus implements Keterangan_Pengunjung{
    String nim,jurusan;
    boolean isMember;
    //method
    void dataWawi(String nama){
        this.nama = nama;
    }
    void dataNim(String nim){
        this.nim =  nim; 
    }
    void dataJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    void dataAlamat(String alamat){
        this.alamat = alamat;
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
    String cetakAlamat(){
        return alamat;
    }
    //constructor
    pengunjung(){
        nama = "Juan Mushofa Aris";
        nim = "2218051";
        jurusan = "Teknik Informatika";
        alamat = "Tumpang";
        
    }
    void setMembershipStatus(boolean isMember){
        this.isMember = isMember;
    }
    @Override
    public void Keterangan_Pengunjung() {
        if(isMember){
            System.out.println("Pengunjung adalah member");
        } else {
            System.out.println("Pengunjung bukan member");
        }
    }
}
