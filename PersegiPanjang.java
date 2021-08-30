/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studikasus;

/**
 *
 * @author Ardhika NR
 */
public class PersegiPanjang {
    int panjang, lebar, hasil;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public int getLuas(){
        this.hasil = panjang * lebar;
        System.out.println("Luas : "+ this.hasil);
        return this.hasil;
    }
    
    public void getKeliling(){
        this.hasil = 2*(panjang+lebar);
        System.out.println("Keliling : "+ this.hasil);
    }
    
    public void Show(){
        System.out.println("Panjang : "+ this.panjang);
        System.out.println("Lebar : "+ this.lebar);
//        System.out.println("Luas : "+ this.hasil);
//        System.out.println("Keliling : "+ this.hasil);
    }
    
}
