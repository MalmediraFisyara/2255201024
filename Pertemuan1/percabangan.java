package Percabangan;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {

    // membuat variabel dan Scanner
        String nama, nim;
        int nilai;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Nama : ");
        nama = scan.nextLine();
        System.out.print("NIM : ");
        nim = scan.nextLine();
        System.out.print("Nilai : ");
        nilai = scan.nextInt();

        // cek apakah dia lulus atau tidak
        if( nilai >= 75 ) {
            System.out.println("Selamat " + nama + "dengan NIM : " + nim + ",Anda Lulus Mata Kuliah Pemrograman 2" + " dengan Nilai " + nilai);
        } else {
            System.out.println("Mohon Maaf " + nama + "dengan NIM : " + nim + ", Anda Tidak Lulus Mata Kuliah Pemrograman 2" + ", Ayo terus belajar dan tetap semangat^_^");
        }

    }

}
