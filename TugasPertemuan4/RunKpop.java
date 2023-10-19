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
        SuperJunior leeteuk = new SuperJunior();
        Nct taeyong = new Nct();
        Shinee onew = new Shinee();
        Exo Suho = new Exo();
        
        // memasukkan variabel
        leeteuk.group="Super Junior";
        leeteuk.gen="-2";
        
        taeyong.group="Nct";
        taeyong.gen="-3";
                
        onew.group="Shinee";
        onew.gen="-2";
        
        Suho.group="Exo";
        Suho.gen="-3";
        
        // memanggil variabel
        
        kpop.agensi();
        
        leeteuk.menampilkan();
        leeteuk.agensi();
        leeteuk.slogan();
        
        taeyong.menampilkan();
        taeyong.agensi();
        taeyong.slogan();
        
        onew.menampilkan();
        onew.agensi();
        onew.slogan();
        
        Suho.menampilkan();
        Suho.agensi();
        Suho.slogan();
    }
}
