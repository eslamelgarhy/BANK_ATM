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
public class withdraw {
    public int the_amount ;
     public int new_withdraw ;
    public void Withdraw(){
    deposit depo = new deposit();
    Scanner scan = new Scanner(System.in);    
    System.out.println("enter the amount to withdraw :");
    the_amount  =scan.nextInt();
    if(the_amount>depo.the_amount){
     new_withdraw = the_amount -depo.the_amount;
    
        System.out.println("has been withdrawn :"+ new_withdraw);
    
    }else{System.out.println("you are poor !!! ");}
    
        
    
    }
    
    
}
