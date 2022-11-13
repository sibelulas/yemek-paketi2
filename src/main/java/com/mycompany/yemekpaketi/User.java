/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yemekpaketi;
import java.util.Scanner;

/**
 *
 * @author Mehmet Cem
 */
public class User {
    int user_id; /*kullanıcının yetkisi*/
    String okul; /* kullanıcının okulu burasını static yapmama sebebin idari personelin değiştirebilmesidir*/
    String adi; /*Kullanıcının adı*/
    int bakiye=0;
    
    
    User(int id,String okul,String adi) /*Yapıcı kısmı nesne ouşturulurken yapılacak işlemler*/
    {
    try{
        id=this.user_id;
    okul=this.okul;
    adi=this.adi;
    /*Gerekli oluşturma işlemleri tamamdır*/
    /* eğer id 0 ise öğrenci olsun ve nesne oluşturulurken soru sorsun nakit yükleyecek mi?
    1 ise yönetici id si
    
    */
     if(id==0 || id==1)
     {
         System.out.println("Bakiye yüklemek istiyor musunuz? (evet:e hayır:h) ");
         Scanner al= new Scanner(System.in);
         String cevap=al.next();
         if(cevap.indexOf("evet")>=0|| cevap.indexOf("Hayır")>=0) /*cevap evet ise */
         {
              System.out.print("Ne kadar yüklemek istiyorsunuz? ");
         Scanner para= new Scanner(System.in);
         int  odeme =para.nextInt();
         this.bakiye=odeme; /*parayı aktardım*/
         System.out.println("Hesabınıza "+odeme+" tanımlanmıştır bizi tavsiye ettiğiniz için teşekkür ederiz");
         }
         else if (cevap.indexOf("hayır")>=0||cevap.indexOf("HAYIR")>=0) /*Hayır ise */
         {
             System.out.println("Hesabınıza 100 tl tanımlanmıştır bizi tavsiye ettiğiniz için teşekkür ederiz");
             this.bakiye=100; /*Hesaba 100 tl atıyoruz*/
         }
         else
         {
             System.out.print(cevap);
             
         }
             
     }
    }
    catch(Exception hata)
    {
        System.out.print(hata);
    }
            
    
    }
    
    
    public void harcama_yap(int fiyat)
    {
       try{
            if(this.bakiye!=0) /*bakiye 0 değil ise */
        {
            bakiye-=fiyat;
            System.out.print("harcama onaylandı!");
        }
        else 
        {
            System.out.print("Bakiyeniz yetersiz");
        }
       }
       catch(Exception hata)
       {
           
       }
    }
    public void isim_degistir(int id) /*SADECE YÖNETİCİLER İSİM DEĞİŞTİREBİLİR YÖNETİCİ İD=1*/
    {
       try{
           if(id==1) /*id sadece 1 ise*/
        {
            System.out.print("Yeni isminizi giriniz: ");
         Scanner isimal= new Scanner(System.in);
         String  yenisim =isimal.nextLine();
         this.adi=yenisim; /*değiştir*/
         System.out.print("yeni isminiz başarı ile tanımlanmıştır.");
        }
        else
        {
             System.out.print("Yetkiniz yok");
        } 
       }
       catch(Exception hata)
       {
           
       }
    }
    
    
     public void okulismidegis(int id) /*SADECE YÖNETİCİLER İSİM DEĞİŞTİREBİLİR YÖNETİCİ İD=1*/
    {
       try{
            if(id==1) /*id sadece 1 ise*/
        {
            System.out.print("Yeni okul isminizi giriniz: ");
         Scanner isimal= new Scanner(System.in);
         String  yenisim =isimal.nextLine();
         this.okul=yenisim; /*değiştir*/
         System.out.print("yeni isminiz başarı ile tanımlanmıştır.");
        }
        else
        {
             System.out.print("Yetkiniz yok");
        }
       }
       catch(Exception hata)
       {
           
       }
    }
    
    
    
    
    
    
    
    
}
