/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan22.perhitunganlingkaran;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program :Perhitungan Lingkaran
 */
public class PBO0610119916Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float phi = (float) 3.14;
        int d, luas, keliling, jari;
        
        
        System.out.println("==========Program Luas Lingkaran==========");
        System.out.print("Masukkan Diameter Lingkaran : ");
        d = (int) input.nextDouble();
        
            jari = d / 2;
            luas = (int) (  phi * d * d / 4 );
            keliling = (int) (d * phi);
            
            System.out.println("==========Hasil Perhitungan Lingkaran=========");
            System.out.print("Jari-jari = " + (int)jari + "\nLuas Lingkaran = " + (float)luas + " \nKeliling Lingkaran = " + (float)keliling);
        
    }
    
}
