/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Habiba Mohamady
 */
public class Talabat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Menus menus=new Menus();
            meal mm=new meal();
            customer c=new customer();
            owner o=new owner();
          
             
     menus.PapaJohns.add(new meal(1,"Marghreita","Mozzarella Cheese and Pizza Sauce",40));
     menus.PapaJohns.add(new meal(2,"Super Papa","Pepperoni, Italian Sausage, Smoked Veal, Onions, "+"\r\n"+ "Green Pepper,  Fresh Mushroom, Black Olives",60));
     menus.PapaJohns.add(new meal(3,"Six Cheese","A blend of 6 delicious cheeses (Gouda,Cheddar , Emmental,  Romano, Mozzarella, Edam )",75));
     menus.PapaJohns.add(new meal(4,"Chicken Ranch","Grilled Chicken, Tomato, Fresh Mushroom, Ranch Sauce",65));
     menus.PapaJohns.add(new meal(5,"Garden Special","Tomato, Onions, Green Pepper, Fresh Mushroom",51));
     menus.PapaJohns.add(new meal(6,"Fisherman's Catch","Shrimps, Calamari, Onions, Green Pepper, Pizza Sauce",78));
 
            
     menus.ChickenFila.add(new meal(1,"Hot Rings","Very spicy fried chicken stuffed with cheese "+"\r\n"+ " sweet chili mayo sauce , spicy sauce ,"+"\r\n"+" fried onion rings  and lettuce",50 ));
     menus.ChickenFila.add(new meal(2,"The American Fill","Fried chicken stuffed with cheese, salted pickles sauce,"+"\r\n"+ "  beef bacon, lettuce",53 ));
     menus.ChickenFila.add(new meal(3,"Juicy Lucy","Fried chicken stuffed with cheese , ranch sauce ,"+"\r\n"+ "   fried cream cheese bites and lettuce",53));
     menus.ChickenFila.add(new meal(4,"Big Bang","Very messy and very spicy, non stuffed fried chicken,,"+"\r\n"+ "  spicy sauce, fried onion rings, jalapenos,,"+"\r\n"+ "  cheese sauce , French fries and lettuce",64));
     menus.ChickenFila.add(new meal( 5,"The Mexican Fila","Very messy with lots of cheese and sauces, mild spicy,"+"\r\n"+ "  fried chicken stuffed with cheese, doritos, colored peppers,"+"\r\n"+ "  spicy mayo sauce, cheese sauce and lettuce",54));
     menus.ChickenFila.add(new meal( 6,"Supre Nova","sauce,  beef bacon, sauteed mushrooms, cheese slice,"+"\r\n"+ "  lettuce and special medium bun",64));
     /*============================================================*/
//Dominos:

       
         menus.Dominos.add(new meal (1,"Margherita","Rich layer of mozzarella cheese and Domino's special sauce ",35));
         menus.Dominos.add(new meal (2,"Deluxe Pizza", "Beef pepperoni, Italian sojouk, green pepper,"+"\r\n"+ "  mushroom, onion & Domino's special sauce ",55));
         menus.Dominos.add(new meal (3,"Vigge Pizza", "Green pepper, onion, mushroom and  black olives"+"\r\n"+ " with mozzarella cheese & Domino's special sauce ",64));
         menus.Dominos.add(new meal (4,"Chicken BBQ Pizza","Grilled chicken with BBQ sauce,  onion slices and Domino's special sauce",55));
         menus.Dominos.add(new meal (5,"Tuna Pizza","Tuna, black olives, onion, mozzarella cheese,"+"\r\n"+ " Domino's special sauce",55));
         menus.Dominos.add(new meal (6,"Hawaiian Pizza", "Beef pepperoni, hawaiian pineapple,"+"\r\n"+ " mozzarella, Domino's special sauce", 64));

//====================================================
//StarBucks:


      
        menus.StarBucks.add(new meal (1,"Iced Shaken Green Tea","Delicious teavana (TM) green tea, hand shaken with ice",37));
        menus.StarBucks.add(new meal (2,"Chocolate Donut","Freshly made round donuts with a delicious chocolate topping",23));
        menus.StarBucks.add(new meal (3,"Turkey And Cheese","soft golden brown baked pretzel filled with cream chees,"+"\r\n"+" mozzarella and turkey ham topped with parmeson sprinkles,"+"\r\n"+" tomato snacks and dried parsley",35));
        menus.StarBucks.add(new meal (4,"Caffe Mocha","Espresso with Mocha sauce and steamed milk",40));
        menus.StarBucks.add(new meal (5,"Double Careml Frappu"," Caramel flavor syrub combined with coffe and milk,"+"\r\n"+" blended with ice, topped with whipped cream"+"\r\n"+" and double layer of caramel drizzle ",50));
        menus.StarBucks.add(new meal (6,"Cheese Croissant","golden croissant filled with chedder and"+"\r\n"+" mozzarilla cheese mix",26));

//=====================================================================
//BurgerKing:


        
        menus.BurgerKing.add(new meal (1,"Big King ","A Big Dual Burger with a dozen layers starting "+"\r\n"+"from the top with a warm & toasted tower sesame"+"\r\n"+" seed sun crown, Big King sauce,"+"\r\n"+" lettuce, onion, pickles, savory Flame-Grilled"+"\r\n"+" Burger patty, warm & toasted tower middle bun,"+"\r\n"+" a second savory Flame-Grilled Burger patty,"+"\r\n"+" American cheese, onion, lettuce, Big King sauce, and"+"\r\n"+" at the bottom warm & toasted tower bun heel.",50));
        menus.BurgerKing.add(new meal (2,"Cheese Burger","signature flame-grilled. beef patty topped with  "+"\r\n"+"a simple layer of melted American cheese,"+"\r\n"+"crinkle cut pickles,  yellow mustard, and ketchup "+"\r\n"+" on a toasted sesame seed bun",56));
        menus.BurgerKing.add(new meal (3,"Double Cheese Burger","two signature flame-grilled beef patties topped"+"\r\n"+" with a simple layer of melted American cheese,"+"\r\n"+" crinkle cut pickles, yellow mustard,"+"\r\n"+" and ketchup on a toasted sesame seed bun",70));
        menus.BurgerKing.add(new meal (4,"Whopper jr","features one savory flame-grilled beef patty"+"\r\n"+"  topped with juicy tomatoes, fresh lettuce,"+"\r\n"+"  creamy mayonnaise, ketchup, crunchy pickles,"+"\r\n"+"  and sliced white onions on a soft sesame seed bun",48));
        menus.BurgerKing.add(new meal (5,"Triple Whopper ","Our TRIPLE WHOPPER® Burger is a pairing of three ¼ "+"\r\n"+"lb* savory flame-grilled beef patties topped with juicy tomatoes"+"\r\n"+", fresh ice burg lettuce, creamy mayonnaise, ketchup,"+"\r\n"+" crunchy pickles, and sliced white"+"\r\n"+" onions on a soft sesame seed bun.",63));
        menus.BurgerKing.add(new meal (6,"Steakhouse","A warm & toasted corn dusted bun crowns a variety of foodstuff"+"\r\n"+" such as mayonnaise, crispy onions, lettuce,"+"\r\n"+" tomato, BBQ sauce, veal bacon, Swiss cheese, Whopper®patty,"+"\r\n"+" and a warm & toasted corn dusted bun at the bottom.",74));

//=======================================================================================================
//McDonald's:

      
        menus.McDonalds.add(new meal (1,"Big Mac","two 100% beef patties,  tasty Big Mac sauce"+"\r\n"+", melting signature cheese, crisp shredded lettuce"+"\r\n"+", onions, pickles and a bun in the middle "+"\r\n"+"all between a toasted sesame seed bun",40));
        menus.McDonalds.add(new meal (2,"Beef Burger ","100% beef patty with onions, pickles,"+"\r\n"+" mustard and a dollop of tomato ketchup,"+"\r\n"+" all in a soft bun",57));
        menus.McDonalds.add(new meal (3,"Double Chees Burger ","100% juicy beef patties, two slices melty cheese"+"\r\n"+", chopped onions, pickles,"+"\r\n"+" ketchup and mustard, all in a soft burger bun.",67));
        menus.McDonalds.add(new meal (4,"Chees Burger","100% juicy beef, melty cheese, chopped onions,"+"\r\n"+" pickles, ketchup and mustard,"+"\r\n"+" all in a soft burger bun.",57));
        menus.McDonalds.add(new meal (5,"Big Tasty ","uicy beef patty smothered in three extraordinary"+"\r\n"+" slices of Emmental cheese, and "+"\r\n"+"topped with sliced tomato, shredded lettuce,"+"\r\n"+" onions and that special Big Tasty sauce.",61));
        menus.McDonalds.add(new meal (6,"Double Beff Buger ","Two simply delicious grilled 100% beef patties"+"\r\n"+" with onions, pickles, mustard and a dollop of"+"\r\n"+" tomato ketchup, all in a soft bun.",70));

//================================================================================================
        while(true){
            Scanner in=new Scanner(System.in);
            System.out.println("You're 1-Owner or 2-Customer?");
             int num=in.nextInt();
        
        if(num==1)
        {
            System.out.println("Want to 1-Sign in or 2-Sign up?");
                 num=in.nextInt();
                if(num==1)
                {
                    System.out.println("Enter Your Resturant");
                    String res=in.next(); 
                    System.out.println("Enter Your Password");
                    String psr=in.next(); 
                    o.countLines();
                    o.owner_login(res, psr);
                    menus.browseO(res);
                    menus.browserOrder(res);
                    System.out.println("1-Add     2-Edit    3-Remove");
                    int Options=in.nextInt();
                    switch(Options)
                    {
                        case 1:
                        menus.add(res);
                        menus.browseO(res);
                        break;
                        case 2:
                        menus.edit(res);
                        menus.browseO(res);
                        break;
                        case 3:
                        menus.remove(res);
                        menus.browseO(res);
                        break;
                    
                    }
                }
                else if(num==2)
                {
                    System.out.println("Enter Your Resturant");
                    String res2=in.next();
                    System.out.println("Enter Your Password");
                    String psr2=in.next();
                    System.out.println("Enter Your E-mail");
                    String mail2=in.next();
                    o.countLines();
                    o.owner_regiester(res2, psr2,mail2 );
                   menus.browseO(res2);
                   
                   System.out.println("1-Add     2-Edit    3-Remove");
                    int Options=in.nextInt();
                    switch(Options)
                    {
                        case 1:
                        menus.add(res2);
                        break;
                        case 2:
                        menus.edit(res2);
                        break;
                        case 3:
                        menus.remove(res2);
                        break;
                    
                    }
                }
                
               
                
                
        }
        else if(num==2)
        {
          System.out.println("Want to 1-Sign in or 2-Sign up?");
               num=in.nextInt();
            if(num==1)
            {
                System.out.println("Enter Your name");
                String name=in.next();
                System.out.println("Enter Your Password");
                String psr=in.next(); 
                c.countLines();
                c.user_login(name, psr);
                System.out.println("Choose a reasturant");
                String resturantName=in.next();
                menus.browseC(resturantName);
                int resNumber=0;
                int m=0,quantity=0;
                float sum = 0;
                menus.Buy(resturantName,sum , m, resNumber,quantity);
                
                
            }
            else if(num==2)
            {
               System.out.println("Enter Your name");
                String name=in.next();
                System.out.println("Enter Your Password");
                String psr=in.next();
                System.out.println("Enter Your E-mail");
                String mail=in.next();
                c.countLines();
                c.user_regiester(name, psr, mail);
                System.out.println("Choose a reasturant");
                String resturantName2=in.next();
                menus.browseC(resturantName2);
                int resNumber2=0;
                int m2=0,quantity2=0;
                int sum2 = 0;
                menus.Buy(resturantName2,sum2 , m2, resNumber2,quantity2);
            }
            
            
            
            
            
            
            
           
            
            
            
        }
       
       
    }
    } 
}
