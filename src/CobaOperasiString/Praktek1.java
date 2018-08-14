/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaOperasiString;

import java.util.Locale;

/**
 *
 * @author User
 */
public class Praktek1 {
    public static void main(String[] args) {
        String identitas = "Muhammad Bagas Ramadhan / XRPL2 / 21";
        System.out.println("Identitas : "+ identitas);
   
        String x = "Operasi";
        System.out.println("isi variabel  x : " + x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Opersi";
        System.out.println("isi variable z : "+ z);
        System.out.println("isi x sama dengan z (Case Sensitive): " + x.equals(z));
        
        String r = "operasi";
        System.out.println("isi cariable r : "+ r);
        System.out.println("isi variable s sama dengan r (Case Sensitive): " + x.equals(r));
        System.out.println("isi x sama dengan r (Case Sensitive) : " + x.equalsIgnoreCase(r));
        
        System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("perbandingan isi x dengan z (Case Sensitive): " + x.compareTo(z));
        System.out.println("perbandingan isi x dengan r (Case Sensitive): " + x.compareToIgnoreCase(r));
        
        String s = "operasI";
        System.out.println("isi variable s : "+ s);
        System.out.println("perbandingan isi r dengan s (Case Sensitive) : " + r.compareTo(s));
        
        System.out.println("pada terdapat huruf 'a' : " + x.contains("a"));
        
        System.out.println("isi variable x besar semua : "+ x.toUpperCase());
        System.out.println("isi variable x kecil semua : "+ x.toLowerCase());
        
        
        String t = "    operasi string      ";
        System.out.println("isi variable t : \""+ t +"\"");
        System.out.println("isi variable t tanpa spasi : \""+t.trim() +"\"");
        
        System.out.println("gabungkan isi variable x dan r : "+ x.concat(r));
        
        
    }
    
}
