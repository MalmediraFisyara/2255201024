/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_Malmedira2255201024;

/**
 *
 * @author SST Sang Surya
 */
public class NetShar extends Netflix{
    String payment;
    int durasi, harga, nominalp, totalharga;
    
    public NetShar(String email, String password, String profil, int pin){
    super (email, password, profil, pin);
    }
    
    @Override
    public void akun(){
        System.out.println("==============================");
        System.out.println("     Akun Netflix Sharing     ");
        System.out.println("==============================");
        super.akun();
    }
    @Override
    void payment(){
        System.out.print("Durasi: ");
        durasi = format.nextInt();
        int total = 22000*durasi;
        System.out.println("Harga 1 bulan: Rp." + harga);
        System.out.println("Nominal yang harus anda bayarkar: Rp." + total);
        System.out.println("===========================================");
        System.out.println("Silahkan pilih Payment: " + payment);
        System.out.print("Payment: ");
        payment = format.next();
        System.out.print("Masukan nominal pembayaran anda: ");
        nominalp = format.nextInt();
        int totalharga = nominalp-total;
        System.out.println("Pembayaran Berhasil!");
        System.out.println("Kembalian uang anda: Rp." + totalharga);
        
    }
}