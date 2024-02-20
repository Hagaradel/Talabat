/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat;

import java.util.Scanner;

/**
 *
 * @author JC.TECH
 */
public class meal {
    public int ItemNumber;
    public String MealName ;
    public String description ;
    public float price ;
    public String  ResturantName;
    
          // Constructor
            public meal(int itemNumber ,String mealName,String Description ,float Price){
            ItemNumber=itemNumber;
            MealName=mealName;
            description=Description;
            price=Price ; }

    meal() {
       
    }

           //getters
            public int getItemNumber()
            {return ItemNumber;}
            public String getMealName()
               {return MealName ;}
            public String getDescription()
               {return description;}
            public float getMealPrice ()
              {return price ;}
            
            //setters
            public void setMealName(String meal )
                   { MealName=meal;}
            public void setDescription (String describe )
                   { description=describe;}
            public void setPrice(float PrIce )
                    { price=PrIce;}
             public void setItemNumber(int item )
                    {  ItemNumber=item;}
             Scanner n =new Scanner(System.in);
    public void buy(float sum,String rname)
  { 
      sum=0;
          
      System.out.println("1-buy   2-exit");
      int m=n.nextInt();     
      while(m==1){
      
      int mealNumber =n.nextInt();
      for(int i=0;i<=5;i++){
           switch (mealNumber)
      {          
          case 1:         
          break;
          case 2:                          
      }
      }
     
      
      
      
      
     
      
     
      }

  }         
}
    

