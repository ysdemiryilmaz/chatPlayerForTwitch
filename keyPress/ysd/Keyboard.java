package keyPress.ysd;

import chatty.Chatty;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Keyboard {

    public static void keyPress(String username, String msg) {
        
        try {
            
            Robot r = new Robot();
            int cmnd = KeyEvent.VK_SHIFT;
            String inputText = msg;
            Locale enLocale = Locale.forLanguageTag("en-US");
            
            inputText = inputText.toUpperCase(enLocale);
            
            switch(inputText){
                case "UP":
                    cmnd = KeyEvent.VK_UP;
                    Chatty.v.setUser(username, "]");
                    break;
                case "DOWN":
                    cmnd = KeyEvent.VK_DOWN;
                    Chatty.v.setUser(username, "^");
                    break;
                case "RIGHT":
                    cmnd = KeyEvent.VK_RIGHT;
                    Chatty.v.setUser(username, "[");
                    break;
                case "LEFT":
                    cmnd = KeyEvent.VK_LEFT;
                    Chatty.v.setUser(username, "\\");
                    break;
                case "A":
                    cmnd = KeyEvent.VK_Z;
                    Chatty.v.setUser(username, inputText);
                    break;
                case "B":
                    cmnd = KeyEvent.VK_X;
                    Chatty.v.setUser(username, inputText);
                    break;
                case "L":
                    cmnd = KeyEvent.VK_A;
                    Chatty.v.setUser(username, inputText);
                    break;
                case "R":
                    cmnd = KeyEvent.VK_S;
                    Chatty.v.setUser(username, inputText);
                    break;
                case "SELECT":
                    cmnd = KeyEvent.VK_O;
                    Chatty.v.setUser(username, inputText);
                    break;
                case "START":
                    cmnd = KeyEvent.VK_ENTER;
                    Chatty.v.setUser(username, inputText);
                    break;
                default: break;
            }
            
            try {
                r.keyPress(cmnd);
                Thread.sleep(200);
                r.keyRelease(cmnd);
            } catch (InterruptedException ex) {
                Logger.getLogger(Keyboard.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (AWTException ex) {
            Logger.getLogger(Keyboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

