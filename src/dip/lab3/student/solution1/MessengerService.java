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
public class MessengerService {
    private Output output;
    private Input input;
    
    public MessengerService(Input input, Output output) {
        this.input= input;
        this.output = output;
    }
    
    public final void sendMessage(){
        String line =input.inputText();
        output.OutputText(line);
    }
}
