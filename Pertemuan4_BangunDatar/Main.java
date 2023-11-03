/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4_BangunDatar;

/**
 *
 * @author SST Sang Surya
 */
public class Main {
   public static void main(String[] args) {
       
       BangunDatar bangunDatar = new BangunDatar();
       
       Persegi persegi = new Persegi();
       persegi.sisi= 5;
       
       Lingkaran lingkaran = new Lingkaran();
       lingkaran.r= 14;
       
       PersegiPanjang persegiPanjang = new PersegiPanjang();
       persegiPanjang.lebar= 4;
       persegiPanjang.panjang= 8;
       
       Segitiga segitiga = new Segitiga();
       segitiga.alas= 12;
       segitiga.tinggi= 8;
       
       // menunjukkan inheritance
       bangunDatar.luas();
       bangunDatar.keliling();
       
       persegi.luas();
       persegi.keliling();
       
       persegiPanjang.luas();
       persegiPanjang.keliling();
       
       lingkaran.luas1();
       lingkaran.keliling1();
       
       segitiga.luas1();
   }
}
