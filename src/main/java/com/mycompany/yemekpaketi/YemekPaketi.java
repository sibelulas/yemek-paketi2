/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.yemekpaketi;

/**
 *
 * @author Mehmet Cem
 */
public class YemekPaketi {

    public static void main(String[] args) {
       User kullanici1= new User(0,"mardin artuklu","Mehmet Cem Karaca"); /*bir öğrenci oluşturalım burası hesap da saklanır*/
    
      kullanici1.isim_degistir(0);
      System.out.println("");
    kullanici1.okulismidegis(0);
     System.out.println("");
     
     System.out.println("Güncel bakiyeniz: "+kullanici1.bakiye);
     kullanici1.harcama_yap(20);
     
     
     
     
     User kullanici2= new User(1,"mardin artuklu","Hüseyin ahmetoğlu"); /*bir yönetixci oluşturalım burası hesap da saklanır*/
    
      kullanici2.isim_degistir(1);
      System.out.println("");
    kullanici2.okulismidegis(1);
     System.out.println("");
     
     System.out.println("Güncel bakiyeniz: "+kullanici1.bakiye);
     kullanici2.harcama_yap(20);
     
     
     
     
     
     
   
     
     
     
     
     
     
    
   
    
      
      
      
    }
}
