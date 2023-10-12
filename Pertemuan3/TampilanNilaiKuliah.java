/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author SST Sang Surya
 */
public class TampilanNilaiKuliah {
    public static void main(String[] args) {
    MasterNilaiKuliah P = new MasterNilaiKuliah(); 
    
        //Prosedur
        P.Penilaian(92, "2255201014", "Resha Yuana", "");
        //Fungsi
        System.out.println(P.penilaian1(55, "2255201023", "Achmad Muzaki", ""));
        
        //Static Prosedur
        MasterNilaiKuliah.penilaian2(80, "2255201024", "Malmedira Fisyara", "");
        
        //Static Fungsi
        System.out.println(MasterNilaiKuliah.penilaian3(68, "2255201051", "Alifatus Safa'ah", ""));
    }
}