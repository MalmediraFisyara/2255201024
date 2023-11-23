/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7_PolymorfismeDinamis;

/**
 *
 * @author SST Sang Surya
 */
public class RunBubble {
    public static void main(String[] args) {
        
        Bubble bubble = new Bubble();
        bubblenct bubn = new bubblenct();
        bubblewayv bubw = new bubblewayv();
        bubbleaespa buba = new bubbleaespa();
        
        bubn.group="NCT";
        bubw.group="WayV";
        buba.group="Aespa";
        
        bubn.lysn();
        bubn.tiket();
        bubn.bubble();  
        
        bubw.lysn();
        bubw.tiket();
        bubw.bubble();
        
        buba.lysn();
        buba.tiket();
        buba.bubble();
}
}
