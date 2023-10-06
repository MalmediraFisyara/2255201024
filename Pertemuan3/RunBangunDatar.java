/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author pc12
 */
public class RunBangunDatar {
    
    public static void main(String[]args){
        int alas = 14, tinggi = 5;
        int a = 4, b = 6;
        MasterBangunDatar p = new MasterBangunDatar();
        p.hitungLuasJajarGenjang(alas, tinggi);
        p.hitungKelilingJajarGenjang(a, b);
        System.out.println("luas jajar genjang = " + p.hitungKelilingJajarGenjang1(alas, tinggi));
        System.out.println("keliling jajar genjang = " + p.hitungKelilingJajarGenjang1(a, b));
        MasterBangunDatar.hitungLuasJajarGenjang2(alas, tinggi);
        MasterBangunDatar.hitungKelilingJajarGenjang2(a, b);
        System.out.println("luas jajar genjang = " + MasterBangunDatar.hitungLuasJajarGenjang3(alas, tinggi));
        System.out.println("luas jajar genjang = " + MasterBangunDatar.hitungKelilingJajarGenjang3(a, b));
}
}