/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5_Overriding;

/**
 *
 * @author SST Sang Surya
 */
public class RunKpop {
    public static void main(String[] args) {
        Kpop kpop = new Kpop();
       // objek
        SuperJunior leeteuk = new SuperJunior();
        Nct taeyong = new Nct();
        Shinee onew = new Shinee();
        Exo Suho = new Exo();
        
        // memasukkan variabel
        leeteuk.group="Super Junior";
        leeteuk.fandom="Elf";
        
        taeyong.group="Nct";
        taeyong.fandom="NctZen";
                
        onew.group="Shinee";
        onew.fandom="Shawols";
        
        Suho.group="Exo";
        Suho.fandom="ExoL";
        
        // memanggil variabel
        kpop.group();
        kpop.agensi();
        
        leeteuk.group();
        leeteuk.agensi();
        leeteuk.slogan();
        
        taeyong.group();
        taeyong.agensi();
        taeyong.slogan();
        
        onew.group();
        onew.agensi();
        onew.slogan();
        
        Suho.group();
        Suho.agensi();
        Suho.slogan();
    }
}
