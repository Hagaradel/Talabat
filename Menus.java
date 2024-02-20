/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
/**
 *
 * @author JC.TECH
 */
public class Menus  {

    ArrayList<meal> PapaJohns = new ArrayList<meal>(6);
    ArrayList<meal> ChickenFila = new ArrayList<meal>(6);
    ArrayList<meal> Dominos = new ArrayList<meal>(6);
    ArrayList<meal> StarBucks = new ArrayList<meal>(6);
    ArrayList<meal> BurgerKing = new ArrayList<meal>(6);
    ArrayList<meal> McDonalds = new ArrayList<meal>(6);
    Scanner n = new Scanner(System.in);
    Ordered or=new Ordered();
    int answer;
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
    LocalDateTime now=LocalDateTime.now();
 
    public void browseC(String resName) {

        switch (resName) {
            case "PapaJohns":
                for (int i = 0; i <PapaJohns.size();i++) {
                    System.out.println(PapaJohns.get(i).ItemNumber);
                    System.out.println(PapaJohns.get(i).MealName);
                    System.out.println(PapaJohns.get(i).description);
                    System.out.println(PapaJohns.get(i).price + "$");
                }
                break;
            case "ChickenFila":
                for (int i = 0; i <ChickenFila.size(); i++) {
                    System.out.println(ChickenFila.get(i).ItemNumber);
                    System.out.println(ChickenFila.get(i).MealName);
                    System.out.println(ChickenFila.get(i).description);
                    System.out.println(ChickenFila.get(i).price + "$");
                }

                break;
            case "Dominos":
                for (int i = 0; i <Dominos.size(); i++) {
                    System.out.println(Dominos.get(i).ItemNumber);
                    System.out.println(Dominos.get(i).MealName);
                    System.out.println(Dominos.get(i).description);
                    System.out.println(Dominos.get(i).price + "$");
                }
                break;
            case "StarBucks":
                for (int i = 0; i <StarBucks.size(); i++) {
                    System.out.println(StarBucks.get(i).ItemNumber);
                    System.out.println(StarBucks.get(i).ItemNumber);
                    System.out.println(StarBucks.get(i).MealName);
                    System.out.println(StarBucks.get(i).description);
                    System.out.println(StarBucks.get(i).price + "$");
                }
                break;
            case "BurgerKing":
                for (int i = 0; i <BurgerKing.size(); i++) {
                    System.out.println(BurgerKing.get(i).ItemNumber);
                    System.out.println(BurgerKing.get(i).MealName);
                    System.out.println(BurgerKing.get(i).description);
                    System.out.println(BurgerKing.get(i).price + "$");
                }
                break;
            case "McDonalds":
                for (int i = 0; i <McDonalds.size(); i++) {
                    System.out.println(McDonalds.get(i).ItemNumber);
                    System.out.println(McDonalds.get(i).MealName);
                    System.out.println(McDonalds.get(i).description);
                    System.out.println(McDonalds.get(i).price + "$");
                }
                break;

        }
    }
   

    public void Buy(String rName, float sum, int m, int resNumber, int quantity) {

        sum = 0;
        System.out.println("1-buy   2-exit");
        m = n.nextInt();

        while (m == 1) {

            switch (rName) {
                case "PapaJohns":
                    System.out.println("Choos your meal");
                    resNumber = n.nextInt();
                    System.out.println(" quantity ?");
                    quantity = n.nextInt();
                    for (int i = 0; i <= 5; i++) {
                        if (i == resNumber - 1) 
                        {
                            sum += (PapaJohns.get(i).price * quantity);                          
                           or.QuantitiyRequired_papa[i]=quantity;
                            or.MealOrdered_papa[i]=PapaJohns.get(i).MealName;
                            System.out.println("Do you have any Additions notes");
                            System.out.println("1-yes    2-no");
                            answer=n.nextInt();
                           if(answer==1)
                          {
                            or.Addition_papa[i]=n.next();
                          }
                    }
                  }
                    System.out.println("1-buy   2-exit");
                    m = n.nextInt();
                    break;
                case "ChickenFila":
                    System.out.println("Choos your meal");
                    resNumber = n.nextInt();
                    System.out.println(" quantity ?");
                    quantity = n.nextInt();
                    for (int i = 0; i <= 5; i++) {

                        if (i == resNumber - 1) {
                            sum += (ChickenFila.get(i).price * quantity);
                            or.QuantitiyRequired_ChickenFila[i]=quantity;
                            or.MealOrdered_ChickenFila[i]=PapaJohns.get(i).MealName;
                            System.out.println("Do you have any Additions notes");
                            System.out.println("1-yes    2-no");
                            answer=n.nextInt();
                           if(answer==1)
                          {
                            or.Addition_ChickenFila[i]=n.next();
                          }
                        }
                    }
                    
                    System.out.println("1-buy   2-exit");
                    m = n.nextInt();
                    break;
                case "Dominos":
                    System.out.println("Choos your meal");
                    resNumber = n.nextInt();
                    System.out.println(" quantity ?");
                    quantity = n.nextInt();
                    for (int i = 0; i <= 5; i++) {
                        if (i == resNumber - 1) {
                            sum += (Dominos.get(i).price * quantity);
                            or.QuantitiyRequired_Dominos[i]=quantity;
                            or.MealOrdered_Dominos[i]=PapaJohns.get(i).MealName;
                            System.out.println("Do you have any Additions notes");
                            System.out.println("1-yes    2-no");
                            answer=n.nextInt();
                           if(answer==1)
                          {
                            or.Addition_Dominos[i]=n.next();
                          }
                        }
                    }
                    
                    System.out.println("1-buy   2-exit");
                    m = n.nextInt();
                    break;
                case "StarBucks":
                    System.out.println("Choos your meal");
                    resNumber = n.nextInt();
                    System.out.println(" quantity ?");
                    quantity = n.nextInt();
                    for (int i = 0; i <= 5; i++) {
                        if (i == resNumber - 1) {
                            sum += (StarBucks.get(i).price * quantity);
                            or.QuantitiyRequired_StarBucks[i]=quantity;
                            or.MealOrdered_StarBucks[i]=PapaJohns.get(i).MealName;
                            System.out.println("Do you have any Additions notes");
                            System.out.println("1-yes    2-no");
                            answer=n.nextInt();
                           if(answer==1)
                          {
                            or.Addition_StarBucks[i]=n.next();
                          }
                        }
                    }
                    
                    System.out.println("1-buy   2-exit");
                    m = n.nextInt();
                    break;
                case "BurgerKing":
                    System.out.println("Choos your meal");
                    resNumber = n.nextInt();
                    System.out.println(" quantity ?");
                    quantity = n.nextInt();
                    for (int i = 0; i <= 5; i++) {
                        if (i == resNumber - 1) {
                            sum += (BurgerKing.get(i).price * quantity);
                            or.QuantitiyRequired_BurgerKing[i]=quantity;
                            or.MealOrdered_BurgerKing[i]=PapaJohns.get(i).MealName;
                            System.out.println("Do you have any Additions notes");
                            System.out.println("1-yes    2-no");
                            answer=n.nextInt();
                           if(answer==1)
                          {
                            or.Addition_BurgerKing[i]=n.next();
                          }
                        }
                    }
                    
                    System.out.println("1-buy   2-exit");
                    m = n.nextInt();
                    break;
                case "McDonalds":
                    System.out.println("Choos your meal");
                    resNumber = n.nextInt();
                    System.out.println(" quantity ?");
                    quantity = n.nextInt();
                    for (int i = 0; i <= 5; i++) {
                        if (i == resNumber - 1) {
                            sum += (McDonalds.get(i).price * quantity);
                            or.QuantitiyRequired_McDonalds[i]=quantity;
                            or.MealOrdered_McDonalds[i]=PapaJohns.get(i).MealName;
                            System.out.println("Do you have any Additions notes");
                            System.out.println("1-yes    2-no");
                            answer=n.nextInt();
                           if(answer==1)
                          {
                            or.Addition_McDonalds[i]=n.next();
                          }
                        }
                    }
                     
                    System.out.println("1-buy   2-exit");
                    m = n.nextInt();
                    break;

            }

        }
        System.out.println(sum + "$");

    }

   public void browseO(String ownerRes) {
         ArrayList<meal> restaurant = PapaJohns;
        switch (ownerRes) {
            case "PapaJohns":
                restaurant = PapaJohns;
                break;

            case "ChickenFila ":
                restaurant = ChickenFila;
                break;
            case "Dominos":
                restaurant = Dominos;
                break;

            case "StarBucks":
                restaurant = StarBucks;
                break;
            case "BurgerKing":
                restaurant = BurgerKing;
                 break;
            case "McDonalds":
                restaurant = McDonalds;
        }
         for (int i = 0; i <restaurant.size(); i++)
                    { System.out.println(restaurant.get(i).MealName);
                    System.out.println(restaurant.get(i).description);
                    System.out.println(restaurant.get(i).price + "$"); }
         
    }
    public void add(String resturant_name) {
       
        ArrayList<meal> restaurant = PapaJohns;
        switch (resturant_name) {
            case "PapaJohns":
                restaurant = PapaJohns;
                break;

            case "ChickenFila ":
                restaurant = ChickenFila;
                break;
            case "Dominos":
                restaurant = Dominos;
                break;

            case "StarBucks":
                restaurant = StarBucks;
                break;
            case "BurgerKing":
                restaurant = BurgerKing;
                 break;
            case "McDonalds":
                restaurant = McDonalds;
        }
        int itemOfnumber=6;
        String meal_name;
        String meal_description;
        float meal_price;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Meal Name:");
        meal_name = scan.nextLine();
        System.out.println("Enter Meal Description: ");
        meal_description = scan.nextLine();
        System.out.println("Enter Meal Price:");
        meal_price = scan.nextFloat();
       restaurant.add(new meal(++itemOfnumber,meal_name,meal_description,meal_price));
    }

    public void edit(String resturant_name) {
       
        ArrayList<meal> restaurant = PapaJohns;
        switch (resturant_name) {
            case "PapaJohns":
                restaurant = PapaJohns;
                break;

            case "ChickenFila ":
                restaurant = ChickenFila;
                break;
            case "Dominos":
                restaurant = Dominos;
                break;

            case "StarBucks":
                restaurant = StarBucks;
                break;
            case "BurgerKing":
                restaurant = BurgerKing;
                 break;
            case "McDonalds":
                restaurant = McDonalds;
        }
        
        System.out.println("enter the number of the meal: ");
        int i = n.nextInt() - 1;
        
        String meal_name;
        String meal_description;
        float meal_price;
        
        System.out.println("Do you want yo edit 1. name of meal ,2.description, 3.price 4.edit all ");
                Scanner scan_edit = new Scanner(System.in);
                int edit_number = n.nextInt();
                if (edit_number == 1) {
                    System.out.println("Enter meal name");
                    meal_name = n.next();
                    restaurant.get(i).setMealName(meal_name);
                } else if (edit_number == 2) {
                    System.out.println("Enter new description");
                    meal_description = n.next();
                    restaurant.get(i).setDescription(meal_description);
                } else if (edit_number == 3) {
                    System.out.println("Enter new price");
                    meal_price = n.nextFloat();
                    restaurant.get(i).setPrice(meal_price);
                } else {
                    System.out.println("Enter new name");
                    meal_name = n.next();
                    System.out.println("Enter new description");
                    meal_description = n.next();
                    System.out.println("Enter new price");
                    meal_price = n.nextFloat();
                    restaurant.get(i).setMealName(meal_name);
                    restaurant.get(i).setDescription(meal_description);
                    restaurant.get(i).setPrice(meal_price);
                }

    }

    public void remove(String resturant_name) {
        int itemOfnumber;
        
        ArrayList<meal> restaurant = PapaJohns;
        switch (resturant_name) {
            case "PapaJohns":
                restaurant = PapaJohns;
                break;

            case "ChickenFila ":
                restaurant = ChickenFila;
                break;
            case "Dominos":
                restaurant = Dominos;
                break;

            case "StarBucks":
                restaurant = StarBucks;
                break;
            case "BurgerKing":
                restaurant = BurgerKing;
                 break;
            case "McDonalds":
                restaurant = McDonalds;
    }
        
       System.out.println("enter the number of the meal: ");
        itemOfnumber = n.nextInt() -1;
        restaurant.remove(itemOfnumber);
        
} 
    public void browserOrder(String resturant_name)
    {
        
        switch (resturant_name) {
            case "PapaJohns":
                for (int i=0;i<=5;i++)
          {
            if(or.MealOrdered_papa[i]!=null)
            {
               System.out.println("meals orderd :"); System.out.println(or.MealOrdered_papa[i]);
                System.out.println("quantity required :");System.out.println(or.QuantitiyRequired_papa[i]);
                System.out.println("Addition notes :");System.out.println(or.Addition_papa[i]);
                System.out.println(dtf.format(now));
             
            }
            else 
                continue;
          }
                break;

            case "ChickenFila ":
                for (int i=0;i<=5;i++)
            {
            if(or.MealOrdered_ChickenFila[i]!=null)
            {
               System.out.println("meals orderd :"); System.out.println(or.MealOrdered_ChickenFila[i]);
                System.out.println("quantity required :");System.out.println(or.QuantitiyRequired_ChickenFila[i]);
                System.out.println("Addition notes :");System.out.println(or.Addition_ChickenFila[i]);
                System.out.println(dtf.format(now));
             
            }
            else 
                continue;
           }
                
                break;
            case "Dominos":
                    for (int i=0;i<=5;i++)
            {
            if(or.MealOrdered_Dominos[i]!=null)
            {
               System.out.println("meals orderd :"); System.out.println(or.MealOrdered_Dominos[i]);
                System.out.println("quantity required :");System.out.println(or.QuantitiyRequired_Dominos[i]);
                System.out.println("Addition notes :");System.out.println(or.Addition_Dominos[i]);
                System.out.println(dtf.format(now));
             
            }
            else 
                continue;
           }
                
                break;

            case "StarBucks":
                        for (int i=0;i<=5;i++)
            {
            if(or.MealOrdered_StarBucks[i]!=null)
            {
               System.out.println("meals orderd :"); System.out.println(or.MealOrdered_StarBucks[i]);
                System.out.println("quantity required :");System.out.println(or.QuantitiyRequired_StarBucks[i]);
                System.out.println("Addition notes :");System.out.println(or.Addition_StarBucks[i]);
                System.out.println(dtf.format(now));
             
            }
            else 
                continue;
           }
                
                break;
            case "BurgerKing":
                            for (int i=0;i<=5;i++)
            {
            if(or.MealOrdered_BurgerKing[i]!=null)
            {
               System.out.println("meals orderd :"); System.out.println(or.MealOrdered_BurgerKing[i]);
                System.out.println("quantity required :");System.out.println(or.QuantitiyRequired_BurgerKing[i]);
                System.out.println("Addition notes :");System.out.println(or.Addition_BurgerKing[i]);
                System.out.println(dtf.format(now));
             
            }
            else 
                continue;
           }
                
                 break;
            case "McDonalds":
                               for (int i=0;i<=5;i++)
            {
            if(or.MealOrdered_McDonalds[i]!=null)
            {
               System.out.println("meals orderd :"); System.out.println(or.MealOrdered_McDonalds[i]);
                System.out.println("quantity required :");System.out.println(or.QuantitiyRequired_McDonalds[i]);
                System.out.println("Addition notes :");System.out.println(or.Addition_McDonalds[i]);
                System.out.println(dtf.format(now));
             
            }
            else 
                continue;
           }
              break;
                
        
     }
 }
}
