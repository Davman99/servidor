/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Francisco
 */
public class movimiento implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int a;
        int movi = 0;
        switch (movi){
            case 37:// izq
                a=(e.getKeyChar());
                break;
            case 38: // abajo
                a=(e.getKeyChar());
                break;
            case 39:// derecha
                a=(e.getKeyChar());
                break;
            case 40://arriba
                a=(e.getKeyChar());
                break;
            default :
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
