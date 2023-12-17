/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PRAKTIKUM_PERPUS;


/**
 *
 * @author FIRKY PRIBADY
 */
public class main extends pengurus{
public static void main (String[]args){
    Buku Book =  new Buku();
    pengurus pgs =  new pengurus();
        System.out.println("---------------------------------------");
        System.out.println("          Buku Perpustakaan ");
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku : " + Book.cetakJudul());
        System.out.println("Penerbit : " + Book.cetakPenerbit());
        System.out.println("Penulis : " + Book.cetakPenulis());
        System.out.println("Tahun Terbit : " + Book.cetakTahunTerbit());
        System.out.println("Jumlah Stock : " + Book.cetakStok());
        System.out.println("Penanggung Jawab Buku : " + pgs.nama);
    }
}