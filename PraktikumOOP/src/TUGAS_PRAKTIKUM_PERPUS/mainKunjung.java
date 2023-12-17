/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PRAKTIKUM_PERPUS;

import java.util.Scanner;

/**
 *
 * @author FIRKY PRIBADY
 */
public class mainKunjung {
    public static void main(String[]args){
        pengunjung pgj = new pengunjung();
        Scanner input = new Scanner(System.in);
        
        System.out.println("---------------------------------------");
        System.out.println("          Data Pengunjung Perpustakaan ");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan Nama Pengunjung: ");
        pgj.dataWawi(input.nextLine());
        System.out.print("Masukkan Nim Pengunjung: ");
        pgj.dataNim(input.nextLine());
        System.out.print("Masukkan Jurusan Pengunjung: ");
        pgj.dataJurusan(input.nextLine());
        System.out.print("Masukkan Alamat Pengunjung: ");
        pgj.dataAlamat(input.nextLine());
        
    }
}
