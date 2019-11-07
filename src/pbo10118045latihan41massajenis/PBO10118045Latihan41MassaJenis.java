/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan41massajenis;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : Muhammad Ilham Apriyadi
 * Kelas    : if 2
 * NIM      : 10118045
 * Deskripsi Program : menghitung massa jenis
 */
public class PBO10118045Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.print("Sisi : ");
        Scanner scanner = new Scanner(System.in);
        kubus.setSisi(scanner.nextInt());
        System.out.print("Massa : ");
        kubus.setMassa(scanner.nextInt());
        System.out.println("");
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : " +kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " +kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
    }
    
}
