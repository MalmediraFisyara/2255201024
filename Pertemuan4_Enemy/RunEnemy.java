/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author SST Sang Surya
 */
public class RunEnemy {
  public static void main(String[] args) {
      
      // objek enemy
      Enemy monster = new Enemy();
      
      Zombie zumbi = new Zombie();
      zumbi.walk();
      
      Pocong hantuPocong = new Pocong();
      hantuPocong.jump();
      
      Burung garuda = new Burung();
      garuda.walk();
      garuda.jump();
      garuda.fly();
      
      // menunjukkan inheritance
      monster.attack();
      
      zumbi.attack();
      
      hantuPocong.attack();
      
      garuda.attack();
  }
}
