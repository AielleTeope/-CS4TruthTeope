/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1;

/**
 *
 * @author TRUTH
 */
public class Q1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declare THREE OBJECTS
        
        /*obj 1*/
        String name1 = "Venti \n";
        String element1 = "Anemo \n";
        int rel1 = 2020;
        
        /*obj 2*/
        String name2 = "Zhongli \n";
        String element2 = "Geo \n";
        int rel2 = 2020;
        
        /*obj 3*/
        String name3 = "Raiden Ei \n";
        String element3 = "Electro \n";
        int rel3 = 2021;

       
        System.out.println("Character 1: \n" + "Name: " + name1 + "Element: " + element1 + "Year of Release: " + rel1 + "\n");
        System.out.println("Character 2: \n" + "Name: " + name2 + "Element: " + element2 + "Year of Release: " + rel2 + "\n");
        System.out.println("Character 3: \n" + "Name: " + name3 + "Element: " + element3 + "Year of Release: " + rel3 + "\n");
        
        //operations
        boolean op1 = rel1 == rel2;
            System.out.println("Venti and Zhongli were released in the same year: " + op1);
            
        boolean op2 = element2 == element3;
            System.out.println("Raiden Ei and Zhongli have the same element: " + op2);
            
        boolean op3 = rel3 < rel1;
            System.out.println("Raiden was released before Venti: " + op3);
    }
    
}
