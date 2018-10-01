/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapOne;

/**
 *
 * @author Frebby
 */
public class TableAndChairs {
     public static void main(String[] args) {
        String rowOne = "X\t\t\t X\n";
        String rowTwo = "X\t \t\t X\n";
        String rowThree = "X\tXXXXXXXXX\t X\n";
        String rowFour = "XXXXXXX\tX\tX  XXXXXXX\n";
        String rowFive = "X     X X\tX  X\t X\n";
        String rowSix = "X     X X\tX  X\t X\n";
        
        System.out.println(rowOne + rowTwo + rowThree + rowFour + rowFive + 
                rowSix);
     }
}
