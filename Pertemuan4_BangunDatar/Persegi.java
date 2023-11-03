/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4_BangunDatar;

/**
 *
 * @author SST Sang Surya
 */
public class Persegi extends BangunDatar {
    int sisi;
    
    @Override
    int luas(){
        int luas = sisi*sisi;
        System.out.println("Menghitung Luas Persegi ");
        System.out.println("Sisi : " + sisi);
        System.out.println("Rumusnya : sisi*sisi");
        System.out.println("Jadi Luas Persegi : " + luas);
        System.out.println("--------------------------------");
        return luas;
    }
    @Override
    int keliling(){
        int keliling = 4*sisi;
        System.out.println("Menghitung Keliling Persegi");
        System.out.println("Sisi : " + sisi);
        System.out.println("Rumusnya : 4*sisi");
        System.out.println("Jadi Keliling Persegi : " + keliling);
        System.out.println("--------------------------------");
        return keliling;
    }
}
