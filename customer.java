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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Habiba Mohamady
 */
public  class customer extends person{
    
    
   
   boolean check=false;
    Menus menus = new Menus();
    Scanner in = new Scanner(System.in);
    @Override
    void readFile() {
        try {

            FileReader fr = new FileReader(f + "\\login.txt");

        } catch (FileNotFoundException e) {
            try {
                FileWriter fw = new FileWriter(f + "\\login.txt");
            } catch (IOException ex) {
                Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    void countLines() {
        try {
            ln = 1;
            RandomAccessFile raf = new RandomAccessFile(f + "\\login.txt", "rw");
            for (int i = 0;raf.readLine()!= null; i++) {
                ln++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void user_login(String usr, String psw) {
        try {
            boolean isLogged = false;
            RandomAccessFile raf = new RandomAccessFile(f + "\\login.txt", "rw");
            for (int i = 0; i < ln; i += 4)/*loop lines to check data in file*/ 
            {
                setName(raf.readLine().substring(9));/*Checking username after 9 charcters in file*/
                
                setPassword(raf.readLine().substring(9));/*Checking password after 9 charcters in file*/
                
               
                if (getName().equals(usr) & getPassword().equals(psw)) {
                    check=true;
                    isLogged = true;
                    System.out.println("You Logged in Successfully!");
                    System.out.println("-------------------------------------------------");
                    break;
                }
                
                for (int k = 1; k <= 2; k++)/*to skip lines which will not be checked*/ {
                    raf.readLine();
                }
            }
            if (isLogged == false) {
                check=false;
                System.out.println("Wrong Password/Username");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void user_regiester(String user, String pass, String email) {
        try {
            RandomAccessFile raf = new RandomAccessFile(f + "\\login.txt", "rw");
            for (int i = 0; i < ln; i++) {
                raf.readLine();
            }
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");
            raf.writeBytes("username:" + user + "\r\n");
            raf.writeBytes("password:" + pass + "\r\n");
            raf.writeBytes("Email:" + email);
            System.out.println("You Registered Successfully!");
            System.out.println("-------------------------------------------------");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
  
  }
    
   
    

