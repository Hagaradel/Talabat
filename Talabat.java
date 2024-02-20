/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat;


import java.awt.Menu;
import java.util.ArrayList;

/**
 *
 * @author JC.TECH
 */
public class Talabat {

 
    public static void main(String[] args) {
        Menus m2=new Menus();
        Resturants resturant = new Resturants();
        //0
        resturant.res_name.add("Papa johns");
        //1
        resturant.res_name.add("Chicken Fila");
        //2
        resturant.res_name.add("Dominos");
        //3
        resturant.res_name.add("StarBucks");
        //4
        resturant.res_name.add("McDonald's");
        //5
        resturant.res_name.add("KFC");
        //6
        resturant.res_name.add("Zacks");
        //7
        resturant.res_name.add("Pizza Hut");
        //8
        resturant.res_name.add("Ciantro");
        //9
        resturant.res_name.add("Costa Coffee");
        //10
        resturant.res_name.add("Burger King");
        //11
        resturant.res_name.add("Buffalo Burger");
        
        //papa johns menu
        //0
        m2.m.name.add("1-Marghreita");
        m2.m.price.add("40");
        m2.m.Description.add("Mozzarella Cheese and Pizza Sauce");
        //1
        m2.m.name.add("2-Super Papa");
        m2.m.price.add("60");
        m2.m.Description.add("Pepperoni, Italian Sausage, Smoked Veal, Onions, "+"\r\n"+ "Green Pepper,  Fresh Mushroom, Black Olives");
        //2
        m2.m.name.add("3-Six Cheese");
        m2.m.price.add("75");
        m2.m.Description.add("A blend of 6 delicious cheeses (Gouda,Cheddar , Emmental,  Romano, Mozzarella, Edam )");
        //3
        m2.m.name.add("4-Chicken Ranch");
        m2.m.price.add("65");
        m2.m.Description.add("Grilled Chicken, Tomato, Fresh Mushroom, Ranch Sauce");
        //4
        m2.m.name.add("5-Garden Special");
        m2.m.price.add("51");
        m2.m.Description.add("Tomato, Onions, Green Pepper, Fresh Mushroom, Black Olives");
        //5
        m2.m.name.add("6-Fisherman's Catch");
        m2.m.price.add("78");
        m2.m.Description.add("Shrimps, Calamari, Onions, Green Pepper, Pizza Sauce ");        
        //chicken fila menu
        //6
        m2.m.name.add("1-Hot Rings");
        m2.m.price.add("50");
        m2.m.Description.add("Very spicy fried chicken stuffed with cheese "+"\r\n"+ " sweet chili mayo sauce , spicy sauce ,"+"\r\n"+ " fried onion rings  and lettuce");
        //7
        m2.m.name.add("2-The American Fill");
        m2.m.price.add("53");
        m2.m.Description.add("Fried chicken stuffed with cheese, salted pickles sauce,"+"\r\n"+ "  beef bacon, lettuce");
        //8
        m2.m.name.add("3-uicy Lucy");
        m2.m.price.add("53");
        m2.m.Description.add("Fried chicken stuffed with cheese , ranch sauce ,"+"\r\n"+ "   fried cream cheese bites and lettuce ");
        //9
        m2.m.name.add("4-Big Bang");
        m2.m.price.add("64");
        m2.m.Description.add("Very messy and very spicy, non stuffed fried chicken,,"+"\r\n"+ "  spicy sauce, fried onion rings, jalapenos,,"+"\r\n"+ "  cheese sauce , French fries and lettuce");
        //10
        m2.m.name.add("5-The Mexican Fila");
        m2.m.price.add("54");
        m2.m.Description.add("Very messy with lots of cheese and sauces, mild spicy,"+"\r\n"+ "  fried chicken stuffed with cheese, doritos, colored peppers,"+"\r\n"+ "  spicy mayo sauce, cheese sauce and lettuce  "); 
        //11
        m2.m.name.add("6-Supre Nova");
        m2.m.price.add("64");
        m2.m.Description.add("sauce,  beef bacon, sauteed mushrooms, cheese slice,"+"\r\n"+ "  lettuce and special medium bun");       
        //Dominos
        //12
        m2.m.name.add("1-Margherita");
        m2.m.price.add("35.5");
        m2.m.Description.add("Rich layer of mozzarella cheese and Domino's special sauce ");
        //13
        m2.m.name.add("2-Deluxe Pizza");
        m2.m.price.add("55");
        m2.m.Description.add("Beef pepperoni, Italian sojouk, green pepper,"+"\r\n"+ "  mushroom, onion & Domino's special sauce  ");
        //14
        m2.m.name.add("3-Viggie Pizza");
        m2.m.price.add("64");
        m2.m.Description.add("Green pepper, onion, mushroom and  black olives"+"\r\n"+ " with mozzarella cheese & Domino's special sauce ");
        //15
        m2.m.name.add("4-Chicken BBQ Pizza");
        m2.m.price.add("55");
        m2.m.Description.add("Grilled chicken with BBQ sauce,  onion slices and Domino's special sauce");
        //16
        m2.m.name.add("5-Tuna Pizza");
        m2.m.price.add("55");
        m2.m.Description.add("Tuna, black olives, onion, mozzarella cheese,"+"\r\n"+ " Domino's special sauce");
        //17
        m2.m.name.add("6-Hawaiian Pizza");
        m2.m.price.add("46");
        m2.m.Description.add("Beef pepperoni, hawaiian pineapple,"+"\r\n"+ " mozzarella, Domino's special sauce");
        //KFC
        //18
        m2.m.name.add("1-Mighty Zinger ");
        m2.m.price.add("55");
        m2.m.Description.add("Mighty zinger sandwich, fries & drink");
        //19
        m2.m.name.add("2-Zinger Supreme");
        m2.m.price.add("55");
        m2.m.Description.add(" 2 pieces spicy crispy fried chicken, turkey slices,"+"\r\n"+ " cheddar cheese slices, lettuce and mayonnaise sauce ");
        //20
        m2.m.name.add("3-Chicken Fillet");
        m2.m.price.add("44");
        m2.m.Description.add("Grand Feast Bucket 253 12 Pcs of chicken + Large Fries + Large Coleslaw"+"\r\n"+ " +  5 Buns + 1 ltr Drink + 2 Rizo ");
        //21
        m2.m.name.add("4-Grand Frast Bucket");
        m2.m.price.add("253");
        m2.m.Description.add(" 12 Pcs of chicken + Large Fries + Large Coleslaw +"+"\r\n"+ " 5 Buns + 1 ltr Drink + 2 Rizo");
        //22
        m2.m.name.add("5-Shrimp Box ");
        m2.m.price.add("100");
        m2.m.Description.add(" 7 pcs shrimps + small Coleslaw + Small fries + Rice"+"\r\n"+ " +  Bun + 2 Cocktail sauces + Drink ");
        //23
        m2.m.name.add("6-Gamer's Box");
        m2.m.price.add("120");
        m2.m.Description.add("Mighty Zinger Sandwich + Fries + Drink + Cookie");
        //pizzaHut
        //24
        m2.m.name.add("1-Margherita");
        m2.m.price.add("34.5");
        m2.m.Description.add("Mozzarella Cheese and Pizza Sauce");
        //25
        m2.m.name.add("2-Super Supreme");
        m2.m.price.add("60");
        m2.m.Description.add("Our famous combination of Beef Pepperoni, juicy Beef,"+"\r\n"+ " Mushrooms,  Green Peppers, Onions,"+"\r\n"+ " Black Olives and melting mozzarell ");
        //26
        m2.m.name.add("3-Cheese Lovers");
        m2.m.price.add("47");
        m2.m.Description.add("A special triple blend of cheese "+"\r\n"+ "with any two toppings of your choice   ");
        //27
        m2.m.name.add("4-Chicken Supreme");
        m2.m.price.add("60");
        m2.m.Description.add("The ultimate mix of Chicken together with Mushrooms,"+"\r\n"+"  Red Onions, Green Peppers,frsh tomatoes, olives  and melting mozarella");
        //28
        m2.m.name.add("5-Vegetarian");
        m2.m.price.add("51");
        m2.m.Description.add("Mushrooms, Green peppers, Fresh Tomatoes, Onions,"+"\r\n"+" and Black Olives  Loaded on a tomato base "+"\r\n"+"and topped with melted mozarella cheese");
        //29
        m2.m.name.add("6-Seafood Lovers");
        m2.m.price.add("78");
        m2.m.Description.add("The Ultimate Seafood pizza! Generously Topped"+"\r\n"+" with a sea of prawns, "+"\r\n"+" Calamari,parsley and touch of garlic  ");
        //StarBucks
        //30
        m2.m.name.add("1-Iced Shaken Green Tea");
        m2.m.price.add("37"); 
        m2.m.Description.add("Delicious teavana (TM) green tea, hand shaken with ice");
        //31
        m2.m.name.add("2-Chocolate Donut");  
        m2.m.price.add("23");
        m2.m.Description.add("Freshly made round donuts with a delicious chocolate topping");
        //32
        m2.m.name.add("3-Turkey And Cheese");  
        m2.m.price.add("35");
        m2.m.Description.add("soft golden brown baked pretzel filled with cream chees,"+"\r\n"+" mozzarella and turkey ham topped with parmeson sprinkles,"+"\r\n"+" tomato snacks and dried parsley");
        //33
        m2.m.name.add("4-Caffe Mocha");  
        m2.m.price.add("40");
        m2.m.Description.add("Espresso with Mocha sauce and steamed milk");
        //34
        m2.m.name.add("5- Double Careml Frappu");
        m2.m.price.add("50 ");
        m2.m.Description.add(" Caramel flavor syrub combined with coffe and milk,"+"\r\n"+" blended with ice, topped with whipped cream"+"\r\n"+" and double layer of caramel drizzle ");
        //35
        m2.m.name.add("6-Cheese Crissant"); 
        m2.m.price.add("26 ");
        m2.m.Description.add("Flaky golden croissant filled with chedder and"+"\r\n"+" mozzarilla cheese mix");
        //Cilantiro
        //36
        m2.m.name.add("1-Chicken Quinoa salad");  
        m2.m.price.add("62");
        m2.m.Description.add("Grilled chicken with quinoa and fresh vegetables, with honey mustrad dressing");
        //37
        m2.m.name.add("2-Plain");  
        m2.m.price.add("18");
        m2.m.Description.add("Fresh buttery flakey croissant baked to perfection");
        //38
        m2.m.name.add("3-Chocolata Chip Brownis");  
        m2.m.price.add("25");
        m2.m.Description.add("Clintaro's signature rich chocolate brownie"+"\r\n"+" with chunks of milk chocolate");
        //39
        m2.m.name.add("4-Mocha Frappe ");
        m2.m.price.add("35 ");
        m2.m.Description.add("Cilantro's creamy ice cold coffe frappe"+"\r\n"+" flavored with chocolate");
        //40
        m2.m.name.add("5-Classic Roat Beef");  
        m2.m.price.add(" 35");
        m2.m.Description.add("Roast beef, lettuce, cheeder cheese,"+"\r\n"+" tomatoes, mayonnaise and mustrad");
        //41
        m2.m.name.add("6-Tea Latte");  
        m2.m.price.add("28");
        m2.m.Description.add("Freshly brewed black tea with velvety "+"\r\n"+"steamed milk and rick milk forth on the top ");
        //costa caffee
        //42
        m2.m.name.add("1-Chicken Tandoori"); 
        m2.m.price.add("70");
        m2.m.Description.add("Tandoori chicken, watercress and mayo cream"+"\r\n"+", served in panini bread");
        //43
        m2.m.name.add("2-Chocolata Brownie");  
        m2.m.price.add("29");
        m2.m.Description.add("Indulging soft and chunky chocolate squares");
        //44
        m2.m.name.add("3-Chicken Caesar Salad "); 
        m2.m.price.add("46");
        m2.m.Description.add("Grilled chicken, parmesan, lettuce,"+"\r\n"+" bread croutons and caesar dressing");
        //45
        m2.m.name.add("4-Mocha"); 
        m2.m.price.add("38");
        m2.m.Description.add(" Expretly steamed chocolate milk blended"+"\r\n"+" with espresso for a caffeinated chocolate treat");
        //46
        m2.m.name.add("5- Peach Iced Tea");  
        m2.m.price.add("30");
        m2.m.Description.add("A refreshing drink for sunny days, or rainy days, it's a real all rounder");
        //47
        m2.m.name.add("6-Croissant "); 
        m2.m.price.add("21");
        m2.m.Description.add("All-butter, flaky pastry");
        //McDonald's
        //48
        m2.m.name.add("1-Big Mac");  
        m2.m.price.add("40");
        m2.m.Description.add("two 100% beef patties,  tasty Big Mac sauce"+"\r\n"+", melting signature cheese, crisp shredded lettuce"+"\r\n"+", onions, pickles and a bun in the middle "+"\r\n"+"all between a toasted sesame seed bun");
        //49
         m2.m.name.add("2-Beef Burger "); 
        m2.m.price.add("57");
        m2.m.Description.add("100% beef patty with onions, pickles,"+"\r\n"+" mustard and a dollop of tomato ketchup,"+"\r\n"+" all in a soft bun");
        //50
         m2.m.name.add("3-Double Chees Burger "); 
        m2.m.price.add("67");
        m2.m.Description.add("100% juicy beef patties, two slices melty cheese"+"\r\n"+", chopped onions, pickles,"+"\r\n"+" ketchup and mustard, all in a soft burger bun.");
        //51
         m2.m.name.add("4-Chees Burger");  
        m2.m.price.add("57");
        m2.m.Description.add("100% juicy beef, melty cheese, chopped onions,"+"\r\n"+" pickles, ketchup and mustard,"+"\r\n"+" all in a soft burger bun.");
        //52
         m2.m.name.add("5-Big Tasty "); 
        m2.m.price.add("61");
        m2.m.Description.add("uicy beef patty smothered in three extraordinary"+"\r\n"+" slices of Emmental cheese, and "+"\r\n"+"topped with sliced tomato, shredded lettuce,"+"\r\n"+" onions and that special Big Tasty sauce.");
        //
        //53
         m2.m.name.add("6-Double Beff Buger "); 
        m2.m.price.add("70");
        m2.m.Description.add("Two simply delicious grilled 100% beef patties"+"\r\n"+" with onions, pickles, mustard and a dollop of"+"\r\n"+" tomato ketchup, all in a soft bun.");
        //Burger King
        //54
        m2.m.name.add("1-Big King "); 
        m2.m.price.add("50");
        m2.m.Description.add("A Big Dual Burger with a dozen layers starting "+"\r\n"+"from the top with a warm & toasted tower sesame"+"\r\n"+" seed sun crown, Big King sauce,"+"\r\n"+" lettuce, onion, pickles, savory Flame-Grilled"+"\r\n"+" Burger patty, warm & toasted tower middle bun,"+"\r\n"+" a second savory Flame-Grilled Burger patty,"+"\r\n"+" American cheese, onion, lettuce, Big King sauce, and"+"\r\n"+" at the bottom warm & toasted tower bun heel.");
        //55
        m2.m.name.add("2-Cheese Burger"); 
        m2.m.price.add("56 ");
        m2.m.Description.add("signature flame-grilled. beef patty topped with  "+"\r\n"+"a simple layer of melted American cheese,"+"\r\n"+"crinkle cut pickles,  yellow mustard, and ketchup "+"\r\n"+" on a toasted sesame seed bun");
        //56
        m2.m.name.add("3-Double Cheese Burger");  
        m2.m.price.add("70");
        m2.m.Description.add("two signature flame-grilled beef patties topped"+"\r\n"+" with a simple layer of melted American cheese,"+"\r\n"+" crinkle cut pickles, yellow mustard,"+"\r\n"+" and ketchup on a toasted sesame seed bun");
        //57
        m2.m.name.add("4-Whopper jr");  
        m2.m.price.add("48");
        m2.m.Description.add("features one savory flame-grilled beef patty"+"\r\n"+"  topped with juicy tomatoes, fresh lettuce,"+"\r\n"+"  creamy mayonnaise, ketchup, crunchy pickles,"+"\r\n"+"  and sliced white onions on a soft sesame seed bun");
        //58
        m2.m.name.add("5-Triple Whopper "); 
        m2.m.price.add("63");
        m2.m.Description.add("Our TRIPLE WHOPPER® Burger is a pairing of three ¼ "+"\r\n"+"lb* savory flame-grilled beef patties topped with juicy tomatoes"+"\r\n"+", fresh ice burg lettuce, creamy mayonnaise, ketchup,"+"\r\n"+" crunchy pickles, and sliced white"+"\r\n"+" onions on a soft sesame seed bun.");
        //59
        m2.m.name.add("6-Steakhouse"); 
        m2.m.price.add(" 74");
        m2.m.Description.add("A warm & toasted corn dusted bun crowns a variety of foodstuff"+"\r\n"+" such as mayonnaise, crispy onions, lettuce,"+"\r\n"+" tomato, BBQ sauce, veal bacon, Swiss cheese, Whopper®patty,"+"\r\n"+" and a warm & toasted corn dusted bun at the bottom.");
        //Buffalo burger
        //60
        m2.m.name.add("1-Hitchhiker"); 
        m2.m.price.add("67 ");
        m2.m.Description.add("Mozzarella cheese fingers, loaded with original ketchup,"+"\r\n"+" mustard drops, beef bacon and creamy buffalo sauce");
        //61
         m2.m.name.add("2-Umami");  
        m2.m.price.add("53");
        m2.m.Description.add("Crispy Breaded Jalapeneo, Hollandaise Sauce, Swiss Cheese Sauce,");
        //62
         m2.m.name.add("3-Shitake Mashroom "); 
        m2.m.price.add("51");
        m2.m.Description.add("Sautéed fresh mushroom, cheddar cheese and "+"\r\n"+"tinge of mayonnaise spread bound to leave you in awe");
        //63
         m2.m.name.add("4-Old School "); 
        m2.m.price.add("46");
        m2.m.Description.add(" The quintessence of burger made with our"+"\r\n"+" signature buffalo sauce and clean cut beef patties");
        //64
         m2.m.name.add("5-Animal Style "); 
        m2.m.price.add("55");
        m2.m.Description.add("Scrumptious onion rings, topped with a "+"\r\n"+"fresh spread of mustard & infused with our"+"\r\n"+" signature buffalo spread is surely "+"\r\n"+"unforgettable gastronomical experience");
        //65
         m2.m.name.add("6-Muscular "); 
        m2.m.price.add("58");
        m2.m.Description.add("Crispy fried cheese is stacked on a burger patty,"+"\r\n"+" topped with buffalo sauce. The muscular "+"\r\n"+"is only for the serious eaters ");
        //zacks
        //66
         m2.m.name.add("1-Big Zack "); 
        m2.m.price.add("69");
        m2.m.Description.add("2 layers of fried chicken, turkey, 2 cheddar cheese slices, lettuce, tomato, pickled cucumber, cheddar sauce, onion rings, BBQ sauce and mayonnaise sauce");
        //67
         m2.m.name.add("2-The Friebird "); 
        m2.m.price.add("73");
        m2.m.Description.add("text	2 layers of fried chicken, bacon, 2 cheddar cheese slices,jalapeno, lettuce,tomato, pickled cucumber, cheddar sauce,onion rings, mayonnaise sauce, fire sauce and BBQ sauce");
        //68
         m2.m.name.add("3-Fat Forrester");  
        m2.m.price.add("75");
        m2.m.Description.add("2 layers of fried chicken, lettuce, tomato, pickled cucumber, fresh mushroom, mushroom sauce with pepper sauce and mayonnaise");
        //69
         m2.m.name.add("4-Levantine Rush");  
        m2.m.price.add("75");
        m2.m.Description.add("Fried chicken breasts, chicken shawerma, turkey, 2 cheddar cheese slices, lettuce, tomato, pickled cucumber,cheddar sauce, onion rings, mayonnaise sauce and BBQ sauce");
        //70
         m2.m.name.add("5-Cheesy Supreme");  

        m2.m.price.add("57");
        m2.m.Description.add("Fried chicken breasts, lettuce, tomato, pickled cucumber, 2 cheddar cheese slices, cheddar sauce, mayonnaise sauce");
        //71
         m2.m.name.add("6-Cheesy Supreme"); 
        m2.m.price.add(" 57");
        m2.m.Description.add("Fried chicken breasts, lettuce, tomato, pickled cucumber, 2 cheddar cheese slices,cheddar sauce, mayonnaise sauce");
    }   
    
    
}
