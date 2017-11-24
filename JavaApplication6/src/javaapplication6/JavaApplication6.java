/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.ArrayList;

/**
 *
 * @author Franco Nuñez
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Mme> momos = new ArrayList();
        ArrayList<Mme> memes = new ArrayList();
        Mme meme = new Mme();
        meme.meme = "Chao no vimoh";
        meme.ja = 3;
        momos.add(meme);
        memes = (ArrayList<Mme>) momos.clone();
        Mme newMeme = memes.get(0);
        //newMeme.meme = "Memazo";
        System.out.println("" + momos.get(0).meme + " - " + momos.get(0).meme);
        System.out.println("" + momos.get(0).ja + " - " + momos.get(0).ja);
        
    }
    
}
