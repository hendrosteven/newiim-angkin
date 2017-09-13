/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Hendro Steven
 */
public class Tentara {

    SenjataInterface senjata;

    Tentara(SenjataInterface senjata) {
        this.senjata = senjata;
    }

    public void menembak() {
        this.senjata.tembak();
    }
}
