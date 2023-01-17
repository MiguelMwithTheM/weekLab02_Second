/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpushtest;
import java.lang.Math;

/**
 *
 * @author migue
 */
public class ProjectPushTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num = Math.round(Math.random());
        
        if (num == 0) {
            System.out.println("Not Banan");
        } else {
            System.out.println("Banan");   
        }
    }
    
}
