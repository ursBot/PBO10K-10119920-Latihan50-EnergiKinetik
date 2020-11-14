/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan50.energikinetik;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class BolaBaseball {
    
    private double massaBola;
    private double kecepatanBola;
    
    public BolaBaseball(double massaBola, double kecepatanBola) {
        this.massaBola = massaBola;
        this.kecepatanBola = kecepatanBola;
    }
    
    public double getMassaBola() {
        return massaBola;
    }
    
    public double getKecepatanBola() {
        return kecepatanBola;
    }
    
    public double hitungEnergiKinetik(double massaBola, double kecepatanBola) {
        return (0.5 * massaBola * (kecepatanBola * kecepatanBola));
    }
    
    public double usahaKetikaDiam(double energiKinetik) {
        return energiKinetik;
    }
    
}

public class EnergiKinetik {
    
    public static void main(String[] args) {
        
        BolaBaseball bola = new BolaBaseball(0.145, 25);
        double energiKinetik;
        
        energiKinetik = bola.hitungEnergiKinetik(bola.getMassaBola(), bola.getKecepatanBola());
        
        System.out.println("--Perhitungan Energi Kinetik Bola Baseball--");
        System.out.println("Massa Bola Baseball \t : " + bola.getMassaBola() + " kg");
        System.out.println("Kecepatan Lemparan \t : " + bola.getKecepatanBola() + " m/s");
        System.out.println("Energi Kinetik \t\t : " + energiKinetik + " J");
        System.out.println("Usaha Saat Diam \t : " + bola.usahaKetikaDiam(energiKinetik) + " J");
    }
    
}