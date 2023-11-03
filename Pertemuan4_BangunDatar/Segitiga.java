/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4_BangunDatar;

/**
 *
 * @author SST Sang Surya
 */
public class Segitiga extends BangunDatar{
    int tinggi;
    int alas;
    
    @Override
    double luas1(){
        double luas = 0.5*alas*tinggi;
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("Alas : " + alas);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Rumusnya : 0.5*alas*tinggi");
        System.out.println("Jadi Luas Segitiga : " + luas);
        System.out.println("--------------------------------");
        return luas;
    }
}
