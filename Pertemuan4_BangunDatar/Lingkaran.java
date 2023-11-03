/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4_BangunDatar;

/**
 *
 * @author SST Sang Surya
 */
public class Lingkaran extends BangunDatar {
    int r;
    
    @Override
    double luas1(){
        double luas1 = 3.14*r*r;
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("Jari-jari : " + r);
        System.out.println("Rumusnya : 3.14*r*r");
        System.out.println("Jadi Luas Lingkaran : " + luas1);
        System.out.println("--------------------------------");
        return luas1;
    }
    @Override
    double keliling1(){
        double keliling1 = 2*3.14*r;
        System.out.println("Menghitung Keliling Lingkaran");
        System.out.println("Jari-jari : " + r);
        System.out.println("Rumusnya : 2*3.14*r");
        System.out.println("Jadi Keliling Lingkaran : " + keliling1);
        System.out.println("--------------------------------");
        return keliling1;
    }
}
