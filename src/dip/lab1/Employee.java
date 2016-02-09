package dip.lab1;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author your name goes here
 */
public interface Employee {
    // You gotta question if these are appropriate for ALL employees?
    

    /**
     * Returns annual wages for hourly workers. Is this polymorphic?
     * Could it be? Does it belong here?
     *
     * @return annual wages for hourly workers using the formula
     * annualWages = hourlyRate * totalHrsForYear
     */
    public abstract double getAnnualWages();



    /**
     * Returns annual bonus for salaried workers. Is this polymorphic?
     * Could it be? Does it belong here?
     *
     * @return annual bonus or zero if none.
     */
    

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualBonus -- think carefully about this
     */
  

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
  
    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualSalary - think carefully about this
     */
   
    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
    
    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param hourlyRate -- think carefully about this
     */
    

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
   
    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param totalHrsForYear -- think carefully about this
     */
    

}
