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
public class QuoteMessageInput implements Input{
    private String quote = "We fly high, no lie, you know this (Ballin'!)";

    @Override
    public String inputText() {
        return quote;
    }
    
}
