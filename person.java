/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat;

import java.io.*;



/**
 *
 * @author Habiba Mohamady
 */
public abstract class person {
    int ln;
    File f=new File("D:\\talabat oop project\\Talabat\\files");
    private String name,password,mail,rest_name,meal_name;

        /*Getters*/
       public String getName() 
        {
        return name;
      }
       public String getPassword() 
        {
        return password;
    }
       public String getMeal_name() 
        {
        return meal_name;
      }
       public String getRest_name() 
        {
        return rest_name;
    }
       public String getMail() 
        {
        return mail;
    }
       
       /*Setters*/
        public void setMail(String mail)
        {
            this.mail = mail;
        }
        public void setName(String name) 
        {
            this.name = name;
        }
        public void setRest_name(String rest_name) 
        {
            this.rest_name = rest_name;
        }
        public void setPassword(String password) 
        {
            this.password = password;
        }
  

    public void setMeal_name(String meal_name) {
        this.meal_name = meal_name;
    }
   void createfolder()/*for creating files*/
    {
        if(!f.exists())
        {
            f.mkdirs();
        }
    }
   abstract void countLines();

   abstract void readFile();
    

 
}
