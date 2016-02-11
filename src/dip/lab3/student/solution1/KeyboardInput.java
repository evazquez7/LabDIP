/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Emilio
 */
import java.util.Scanner;
public class KeyboardInput implements Input{

    @Override
    public String inputText() {
        System.out.println("input text");
        
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
}
