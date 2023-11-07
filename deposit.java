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
public class deposit extends withdraw {
    public int the_amount ;
   withdraw whitd = new withdraw();
    public void Depo(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the amount you want to deposit :");
        the_amount = scan.nextInt();
        System.out.println("Your deposit is :"+the_amount);
        System.out.println("did you to continue y/n :");
        String depo_con = scan.next();
        switch(depo_con){
            case "y":
                 System.out.println("enter operation : 1- for deposit . 2- for withdraw ");
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
                        System.out.println("good lack");}
                    else{
                        System.out.println("try again with enter y/n :");
                        String tryenter = scan.next();
                        if("y".equals(tryenter)){
                            depoo.Depo();
                            }
                        else if("n".equals(tryenter)){System.out.println("good lack");;}
                        else{System.out.println("try again ");}
                    }
                    break;
               case 2:
                   
                   whitd.Withdraw();
                   
                   System.out.println("did you want to cuntinue : y/n");
                    String wcontinue = scan.next();
                    if("y".equals(wcontinue)){
                        whitd.Withdraw();
                        
                         }
                    else if("n".equals(wcontinue)){
                        System.out.println("good lack");;}
                    else{
                        System.out.println("try again with enter y/n :");
                        String tryenter = scan.next();
                        if("y".equals(tryenter)){
                         whitd.Withdraw();
                        }
                        else if("n".equals(tryenter)){System.out.println("good lack");;}
                        else{System.out.println("try again ");}
                    }
                   break;
               default:
                   System.out.println("try again with enter 1 or 2 ");
                break;    
           } 
           
       
                break;
            case "n":
                
                break;
            default :
                System.out.println("try again");
                break;
        
        }
        
         
        
    }
}
