/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapOne;
import javax.swing.JOptionPane;
/**
 *
 * @author Frebby
 */
public class RandomGuess {
    public static void main(String[] args){
        String check = JOptionPane.showInputDialog("Choose a number");
        JOptionPane.showMessageDialog(null,"The number is "+
                (1 + (int)(Math.random() * 10)));
       
    }
}
