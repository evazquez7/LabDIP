/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Emilio
 */
public abstract class TipCalculator {
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;
     
    public abstract double getTip();
    
}


