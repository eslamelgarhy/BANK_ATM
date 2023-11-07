/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_atm;

import java.util.Scanner;

/**
 *
 * @author eslam
 */
public class signup_signin extends deposit  {
   private String fname ;
   private String lname ;
   private int phone;
   private String email;
   private String country;
   private int pass ;
   
   deposit depoin = new deposit();
   
   public void Signup(){
       Scanner scan = new Scanner(System.in);
       System.out.println("####### sign up ######");
       System.out.println("enter your frist name :");
        fname = scan.next();
       System.out.println("enter your last name :");
        lname = scan.next();
       System.out.println("enter your phone :");
        phone = scan.nextInt();
       System.out.println("enter your Email :");
        email = scan.next();
       System.out.println("enter your country :");
       country = scan.next();
       System.out.println("enter your password :");
       pass = scan.nextInt();
   } 
   public void signin(){
       Scanner scan = new Scanner(System.in);
       System.out.println("####### sign in ######");
       System.out.println("enter your first name :");
       String fname = scan.next();
       System.out.println("enter your last name :");
       String lname = scan.next();
       System.out.println("enter your password :");
       int pass = scan.nextInt();
      
       if(fname.equals(this.fname)||lname==this.lname||pass==this.pass ){
           System.out.println("enter operation : 1- for deposot . 2- for withdraw ");
           int operation = scan.nextInt();
           deposit depoo = new deposit();
           switch(operation){
               case 1:
                   
                   depoo.Depo();
                   
                   System.out.println("did you want to cuntinue : y/n");
                    String Dcontinue = scan.next();
                    if("y".equals(Dcontinue)){
                        depoo.Depo();
                        
                         }
                    else if("n".equals(Dcontinue)){
                        System.out.println("good lack");;}
                    else{
                        System.out.println("try again with enter y/n :");
                        String tryenter = scan.next();
                        if("y".equals(tryenter)){depoo.Depo();}
                        else if("n".equals(tryenter)){System.out.println("good lack");;}
                        else{System.out.println("try again ");}
                    }
                    break;
               case 2:
                   
                   depoo.Withdraw();
                   System.out.println("did you want to cuntinue : y/n");
                    String wcontinue = scan.next();
                    if("y".equals(wcontinue)){
                        depoo.Withdraw();
                         }
                    else if("n".equals(wcontinue)){
                        System.out.println("good lack");;}
                    else{
                        System.out.println("try again with enter y/n :");
                        String tryenter = scan.next();
                        if("y".equals(tryenter)){depoo.Withdraw();}
                        else if("n".equals(tryenter)){System.out.println("good lack");;}
                        else{System.out.println("try again ");}
                    }
                   break;
               default:
                   System.out.println("try again with enter 1 or 2 ");
                break;    
           } 
           
       
       }else{System.out.println("wrong");}
       
   }
    
}
