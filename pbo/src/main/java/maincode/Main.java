/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincode;

import com.asset.Mobil;
import com.asset.MobilMewah;

/**
 *
 * @author A-25
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Hitam", 200000, 230, "Avanza");
        Mobil mobil3 = new Mobil("Putih", "Sigra");
        Mobil mobil4 = new MobilMewah("Italia");
        mobil4.getInfo();
        mobil4.setHarga(700000);
        mobil4.getInfo();
        
        Mobil mobilMewah2 = new MobilMewah(800000.0), "Lamborghini");
        mobilMewah2.getInfo();
        mobil4.gasPol();
    }
}
