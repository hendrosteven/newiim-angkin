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
public class TesterApp {

    public static void main(String[] args) {
        SenjataInterface s = new Pistol();
        Tentara t = new Tentara(s);
        t.menembak();
    }
}
