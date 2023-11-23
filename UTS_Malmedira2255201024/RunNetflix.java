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
public class RunNetflix {
    public static void main(String[] args) {
        String enter;
        
        Scanner login = new Scanner(System.in);
        
        System.out.println("--------------------------");
        System.out.println("|     **DIRA STRORE**    |");
        System.out.println("|  MENJUAL AKUN NETFLIX  |");
        System.out.println("--------------------------");
        System.out.println("|1. Netflix Sharing      |");
        System.out.println("|2. Netflix Semi Private |");
        System.out.println("|3. Netflix Private      |");
        System.out.println("--------------------------");
        System.out.print("Pilih Akun: ");
        int pilih = login.nextInt();
        System.out.println("\n");
        
        // membuat objek netflix
        Netflix net = new Netflix();
        NetShar nets = new NetShar("ajcdehiha@bhak.live", "pollen@223", "b", 1020);
        NetSemiPriv netsp = new NetSemiPriv("wasiff.pk@anup1.com", "poil@753", "d", 4444);
        NetPriv netp = new NetPriv("dirsy@bkk12.com", "rose5082", "a", 4872);
        // memasukkan variabel
        nets.payment="Dana, Gopay, Shopeepay, Ovo";
        nets.harga=22000;
        netsp.payment="Dana, Gopay, Shopeepay, Ovo";
        netsp.harga=48000;
        netp.payment="Dana, Gopay, Shopeepay, Ovo";
        netp.harga=155000;
        
        switch (pilih){
       
            case 1 :
                Scanner netflix = new Scanner(System.in);
                //otput format order
                System.out.println("ANDA MEMILIH AKUN NETFLIX SHARING");
                System.out.println("SILAHKAN ISI FORMAT ORDER NETFLIX");
                System.out.println("=================================");
                net.format();
                System.out.println("======================================");
                net.payment();
                nets.payment();
                System.out.println("\n");
                //
                System.out.println("Ketik 'enter' lalu tekan enter untuk mendapatkan akun netflix anda!");
                System.out.print("Ketik Enter: ");
                enter = netflix.next();
                
                //
                nets.akun();
                break;
                
                case 2 :
                Scanner netflix1 = new Scanner(System.in);
                //input format order
                System.out.println("ANDA MEMILIH AKUN NETFLIX SEMI PRIVATE");
                System.out.println("SILAHKAN ISI FORMAT ORDER NETFLIX     ");
                System.out.println("======================================");
                net.format();
                System.out.println("\n");
                net.payment();
                netsp.payment();
                System.out.println("\n");
                //
                System.out.println("Ketik 'enter' lalu tekan enter untuk mendapatkan akun netflix anda!");
                System.out.print("Ketik Enter: ");
                enter = netflix1.next();
                
                //
                netsp.akun();
                break;
                
                case 3 :
                Scanner netflix2 = new Scanner(System.in);
                //input format order
                System.out.println("ANDA MEMILIH AKUN NETFLIX PRIVATE");
                System.out.println("SILAHKAN ISI FORMAT ORDER NETFLIX");
                System.out.println("=================================");
                net.format();
                System.out.println("\n");
                net.payment();
                netp.payment();
                System.out.println("\n");
                //
                System.out.println("Ketik 'enter' lalu tekan enter untuk mendapatkan akun netflix anda!");
                System.out.print("Ketik Enter: ");
                enter = netflix2.next();
                
                //
                netp.akun();
                break;
        }
    }
    }