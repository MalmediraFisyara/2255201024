/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7_PolymorfismeStatis;

/**
 *
 * @author SST Sang Surya
 */
public class sum {
    
    public int sum(int x, int y){
        return (x + y);
    } 
    public double sum(double x, double y){
        return (x + y);
    } 
    public static void main(String args[]){ 

    sum s = new sum(); 

    System.out.println(s.sum(6, 9));
    System.out.println(s.sum(5.7, 2.3)); 
    }
}
