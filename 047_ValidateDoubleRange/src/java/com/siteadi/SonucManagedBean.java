/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class SonucManagedBean {

    /**
     * Creates a new instance of SonucManagedBean
     */
    public SonucManagedBean() {
    }
    int tamSayi;
    double virgulluSayi;

    public int getTamSayi() {
        return tamSayi;
    }

    public void setTamSayi(int tamSayi) {
        this.tamSayi = tamSayi;
    }

    public double getVirgulluSayi() {
        return virgulluSayi;
    }

    public void setVirgulluSayi(double virgulluSayi) {
        this.virgulluSayi = virgulluSayi;
    }
    
    
}
