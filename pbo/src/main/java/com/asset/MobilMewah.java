/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asset;

/**
 *
 * @author A-25
 */
public class MobilMewah extends Mobil implements  KendaraanBermotor{
    private double pajakBarangMewah = 200.0;
    private String asalnegara;
    
    public MobilMewah (String asalnegara) {
        this.asalnegara = asalnegara;
        
    public MobilMewah (double harga, String merk) {
        super("Merah", 500, 800000.0, "Lamborghini" );
        this.asalnegara = asalnegara;
    }

    public MobilMewah(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public MobilMewah(String italia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gasPol() {
        System.out.println("Ngegas sampai Kecepatan Maksimal");
    }

    @Override
    public void ngerem() {
        System.out.println("Kendaraan berhenti");
    }
}
