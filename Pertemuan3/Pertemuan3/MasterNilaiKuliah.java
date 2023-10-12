/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author SST Sang Surya
 */
public class MasterNilaiKuliah {
    // Prosedur
  public void Penilaian(int nilai, String nim, String nama, String keterangan){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai : " + nilai);
        //Grade
        if ( nilai >= 95 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 85 ){
            System.out.println("Grade = A-");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 75 ){
            System.out.println("Grade = B");
        }else if ( nilai >= 65 ){
            System.out.println("Grade = B-");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 55 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C-");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        
        if ( nilai >= 70 ){
            keterangan =" Anda Lulus Mata Kuliah Pemrograman 2\n";
            System.out.println("Selamat " + nama + " dengan NIM : " + nim + keterangan);
        }else {
            keterangan =" Anda Tidak Lulus Mata Kuliah Pemrograman 2\n";
            System.out.println("Mohon maaf " + nama + " dengan NIM : " + nim + keterangan);
        }
    }
  //Fungsi
  public String penilaian1(int nilai, String nim, String nama, String keterangan){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai : " + nilai);
        //Grade
        if ( nilai >= 95 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 85 ){
            System.out.println("Grade = A-");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 75 ){
            System.out.println("Grade = B");
        }else if ( nilai >= 65 ){
            System.out.println("Grade = B-");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 55 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C-");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        
        if ( nilai >= 70 ){
            keterangan =" Anda Lulus Mata Kuliah Pemrograman 2\n";
            System.out.println("Selamat " + nama + " dengan NIM : " + nim + keterangan);
        }else {
            keterangan =" Anda Tidak Lulus Mata Kuliah Pemrograman 2\n";
            System.out.println("Mohon maaf " + nama + " dengan NIM : " + nim + keterangan);
        }
        return keterangan;
  }
  
  //Static Prosedur
  public static void penilaian2(int nilai, String nim, String nama, String keterangan){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai : " + nilai);
        //Grade
        if ( nilai >= 95 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 85 ){
            System.out.println("Grade = A-");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 75 ){
            System.out.println("Grade = B");
        }else if ( nilai >= 65 ){
            System.out.println("Grade = B-");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 55 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C-");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        
        if ( nilai >= 70 ){
            keterangan =" Anda Lulus Mata Kuliah Pemrograman 2\n";
            System.out.println("Selamat " + nama + " dengan NIM : " + nim + keterangan);
        }else {
            keterangan =" Anda Tidak Lulus Mata Kuliah Pemrograman 2\n";
            System.out.println("Mohon maaf " + nama + " dengan NIM : " + nim + keterangan);
        }
    }
  
  //Static Fungsi
  public static String penilaian3(int nilai, String nim, String nama, String keterangan){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai : " + nilai);
        //Grade
        if ( nilai >= 95 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 85 ){
            System.out.println("Grade = A-");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 75 ){
            System.out.println("Grade = B");
        }else if ( nilai >= 65 ){
            System.out.println("Grade = B-");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 55 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C-");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        
        if ( nilai >= 70 ){
            keterangan =" Anda Lulus Mata Kuliah Pemrograman 2\n";
            System.out.println("Selamat " + nama + " dengan NIM : " + nim + keterangan);
        }else {
            keterangan =" Anda Tidak Lulus Mata Kuliah Pemrograman 2\n";
            System.out.println("Mohon maaf " + nama + " dengan NIM : " + nim + keterangan);
        }
        return keterangan;
  }
}