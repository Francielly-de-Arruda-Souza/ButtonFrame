/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttontest;

import javax.swing.JFrame;

/**
 *
 * @author franc
 */
public class ButtonTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ButtonFrame buttonFrame;
        buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(300, 200);
        buttonFrame.setVisible(true);
    }
    
}
