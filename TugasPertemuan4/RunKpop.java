/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author SST Sang Surya
 */
public class RunKpop {
    public static void main(String[] args) {
        Kpop kpop = new Kpop();
       // objek
        Enhypen engene = new Enhypen();
        Nct Nctzen = new Nct();
        StrayKids Stays = new StrayKids();
        TheBoyz TheB = new TheBoyz();
        
        // memasukkan variabel
        engene.group="Enhypen";
        engene.agensi="Hybe Entertaiment";
        
        Nctzen.group="Nct";
        Nctzen.agensi="SM Entertaiment";
                
        Stays.group="StrayKids";
        Stays.agensi="JYP Entertaiment";
        
        TheB.group="TheBoyz";
        TheB.agensi="IST Entertaiment";
        
        // memanggil variabel
        
        kpop.menampilkan();
        
        engene.menampilkan();
        engene.comeback();
        
        Nctzen.menampilkan();
        Nctzen.comeback();
        
        Stays.menampilkan();
        Stays.comeback();
        
        TheB.menampilkan();
        TheB.comeback();
    }
}
