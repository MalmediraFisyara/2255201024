/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author pc12
 */
public class contohFungsi {
    int alas = 14;
    int tinggi =5;
    int a = 4;
    int b = 6;
    
    int hitungLuasJajarGenjang(){
        int luas = alas*tinggi;
        System.out.println("alas = " + alas);
        System.out.println("tinggi = " + tinggi);
        return luas;
   } 
    int hitungKelilingJajarGenjang(){
        int keliling = 2*a+b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        return keliling;
    }
        
    public static void main(String[]args){
        contohFungsi F = new contohFungsi();
        System.out.println("luas jajar genjang = " + F.hitungLuasJajarGenjang());
        System.out.println("keliling jajar genjang = " + F.hitungKelilingJajarGenjang());
    }
}

