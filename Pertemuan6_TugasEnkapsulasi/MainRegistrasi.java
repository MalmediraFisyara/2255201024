/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pertemuan6_TugasEnkapsulasi;

/**
 *
 * @author SST Sang Surya
 */
public interface MainRegistrasi {
    public static void main(String[] args){
        
        Registrasi regist = new Registrasi();
        
        regist.SetNomorKartuKeluarga("5104013009090017");
        regist.SetNomorIndukKeluarga("5104013112460071");
        
        System.out.println("REGISTRASI SIM CARD");
        System.out.println("Format sms untuk semua operator");
        System.out.println("Ketik ULANG#NIK#Nomor KK# lalu kirim ke 4444");
        System.out.println("--------------------------------------------");
        System.out.println("ULANG#" + regist.GetNomorIndukKeluarga() + "#" + regist.GetNomorKartuKeluarga());
                
    }
}
