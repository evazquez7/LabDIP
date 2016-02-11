package dip.lab2.student.solution1;

import dip.lab2.*;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator{
    private double min_Bill = 0.00;
    private  double max_Bill = 100.00;
    private String bill_Entry_Err =
            "Error: bill must be between " + min_Bill + " and "
            + max_Bill;
    private double good_Rate = 0.20;
    private double fair_Rate = 0.15;
    private double poor_Rate = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }
    
    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + good_Rate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fair_Rate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poor_Rate);
                break;
        }

        return tip;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public double getMin_Bill() {
        return min_Bill;
    }

    public void setMin_Bill(double min_Bill) {
        this.min_Bill = min_Bill;
    }

    public double getMax_Bill() {
        return max_Bill;
    }

    public void setMax_Bill(double max_Bill) {
        this.max_Bill = max_Bill;
    }

    public String getBill_Entry_Err() {
        return bill_Entry_Err;
    }

    public void setBill_Entry_Err(String bill_Entry_Err) {
        this.bill_Entry_Err = bill_Entry_Err;
    }

    public double getGood_Rate() {
        return good_Rate;
    }

    public void setGood_Rate(double good_Rate) {
        this.good_Rate = good_Rate;
    }

    public double getFair_Rate() {
        return fair_Rate;
    }

    public void setFair_Rate(double fair_Rate) {
        this.fair_Rate = fair_Rate;
    }

    public double getPoor_Rate() {
        return poor_Rate;
    }

    public void setPoor_Rate(double poor_Rate) {
        this.poor_Rate = poor_Rate;
    }

}
