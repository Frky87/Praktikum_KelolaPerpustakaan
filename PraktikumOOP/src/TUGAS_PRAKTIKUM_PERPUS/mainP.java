/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PRAKTIKUM_PERPUS;

import TUGAS_PRAKTIKUM_PERPUS.pengurus;
import java.util.Scanner;

/**
 *
 * @author FIRKY PRIBADY
 */
public class mainP {
    public static void main(String[]args){
        pengurus pgs = new pengurus();
        Scanner input = new Scanner(System.in);
       
        
        System.out.println("---------------------------------------");
        System.out.println("          Data Pengurus Perpustakaan ");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan Nama Pengurus: ");
        pgs.dataNama(input.nextLine());
        System.out.print("Masukkan Jabatan Pengurus: ");
        pgs.dataJabatan(input.nextLine());
        System.out.print("Masukkan Alamat Pengurus: ");
        pgs.dataAlamat(input.nextLine());
        System.out.print("Masukkan Nomor Telp Pengurus: ");
        pgs.dataNomor(input.nextLine());
    }
}
