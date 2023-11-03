/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4_BangunDatar;

/**
 *
 * @author SST Sang Surya
 */
public class PersegiPanjang extends BangunDatar{
    int panjang;
    int lebar;
    
    @Override
    int luas(){
        int luas = panjang*lebar;
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Rumusnya : panjang*lebar");
        System.out.println("Jadi Luas Persegi Panjang : " + luas);
        System.out.println("--------------------------------");
        return luas;
    }
    @Override
    int keliling(){
        int keliling = 2*(panjang+lebar);
        System.out.println("Menghitung Keliling Persegi Panjang");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Rumusnya : 2*(panjang+lebar)");
        System.out.println("Jadi Keliling Persegi Panjang : " + keliling);
        System.out.println("--------------------------------");
        return keliling;
    }
}
