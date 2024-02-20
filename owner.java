/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Habiba Mohamady
 */
public class owner extends person {

   boolean check=false;
   @Override
   void readFile()
   {
       try
       {
           
       FileReader fr=new FileReader(f+"\\login_owner.txt");
           
       }catch(FileNotFoundException e)
       {
           try {
               FileWriter fw=new FileWriter(f+"\\login_owner.txt");
           } catch (IOException ex) {
               Logger.getLogger(owner.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       
   }
   @Override
   void countLines()
   {
        try {
            ln=1;
            RandomAccessFile raf=new RandomAccessFile(f+"\\login_owner.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++)
            {
             ln++;   
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(owner.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(owner.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   
    public void owner_regiester(String rest_name, String pass, String email) {
        try {
            RandomAccessFile raf=new RandomAccessFile(f+"\\login_owner.txt","rw");
                for(int i=0;i<ln;i++)
                {
                    raf.readLine();
                }
            raf.writeBytes("\n");
            raf.writeBytes("\n");
            raf.writeBytes("resturant:"+rest_name+"\r\n");
            raf.writeBytes("password:"+pass+"\r\n");
            raf.writeBytes("Email:"+email);
            System.out.println("You Signed in Successfully!");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(owner.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(owner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void owner_login(String res,String psr) {
        try {
            boolean isLogged = false;
            RandomAccessFile raf =new RandomAccessFile(f+"\\login_owner.txt","rw");
            for (int i = 0; i < ln; i += 4)/*loop lines to check data in file*/ {
                setRest_name(raf.readLine().substring(10));/*Checking resturant name after 10 charcters in file*/
                setPassword(raf.readLine().substring(9));/*Checking password after 9 charcters in file*/
                
                if(getRest_name().equals(res)&getPassword().equals(psr))
                {
                    check=true;
                    isLogged = true;
                    System.out.println("You Logged in Successfully!");
                    break;
                }

                for (int k=1;k<=2;k++)
                {
                    raf.readLine();
                }
            }
             if (isLogged == false) {
                 check=false;
                System.out.println("Wrong Password/Username");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(owner.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(owner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
}
