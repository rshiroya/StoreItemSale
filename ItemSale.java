/**
* This class holds data for a sales slip after a discount is applied.
*
* @author (type your name)
* @version (type a version number or a date)
*/
public class ItemSale
{
     private double costOfOneItem;
     private int numberOfItems;
     private double discountRate;
     /** This is the no-args constructor that sets up initial
       * values for the fields. All numeric fields are set to 0.
         */
     public ItemSale( )
        {
            costOfOneItem = 0;
            numberOfItems = 0;
            discountRate = .05;
        }
        /** This is the method allows the user to set a value for the cost
           * of an item.
             * @param double- the value to change the cost field to
               */
     public void setCost(double inCost)
      {
          if(inCost < 0)
          costOfOneItem = 0;
          else
          costOfOneItem = inCost;
      }
     public void setNumberOfItems(int inNumber)
         {
         numberOfItems = inNumber < 0? 0:inNumber;
         }
        
        
    
     /** This is the method allows the user to set a value for the
     * discount rate.
     *
     * @param double- a number that represents the percent discount
     */
     public void setDiscount(double inDiscountRate)
     {
     discountRate = inDiscountRate < 0? 0: inDiscountRate;
     }
    
     /**
     * This method returns the price of the sales based on
     * the price per item, the number of items and the
     * amount of the discount.
     * @return A double value representing the total amount due
     */
    
     public double getFinalCost( )
     {
         double finalCost;//finalCost is a l    ocal variable to this method
         finalCost = numberOfItems * (costOfOneItem * (1 - discountRate));
        
         return finalCost;
     }
}//end of the class definition
    /** This is the method allows the user to set a value for the number
       * of items purchased.
         * @param int- the value to change the numberOfItems field
              */