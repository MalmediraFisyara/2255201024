/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_Malmedira2255201024;
import java.util.Scanner;
/**
 *
 * @author SST Sang Surya
 */
public class Netflix {
    
    private String email, password, profil;
    private int pin;
    String nama, bulan, durasi, payment;
    int tanggal;
    
    Scanner format = new Scanner(System.in);
    public Netflix(){
        
    }
    public Netflix(String email, String password, String profil, int pin){
        this.email = email;
        this.password = password;
        this.profil = profil;
        this.pin = pin;
    }
    void akun(){
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("Profil : " + profil);
        System.out.println("Pin : " + pin);  
    }
    void format(){
        System.out.println("FORMAT ORDER NETFLIX");
        System.out.print("Nama Customer: ");
        nama = format.next();
        System.out.print("Tanggal Order: ");
        tanggal = format.nextInt();
        System.out.print("Bulan Order: ");
        bulan = format.next();          
    }
    void payment(){
        System.out.println("Silahkan pilih durasi! Ready 1-3 Bulan");
}  
}
