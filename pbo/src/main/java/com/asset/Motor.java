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
public class Motor implements KendaraanBermotor {

    @Override
    public void gasPol() {
        System.out.println("Gas pol");
    }

    @Override
    public void ngerem() {
        System.out.println("Kendaraan Berhenti");
    }
    
    
}
