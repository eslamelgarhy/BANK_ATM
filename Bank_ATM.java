/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank_atm;

import java.util.Scanner;

/**
 *
 * @author eslam
 */
public class Bank_ATM extends signup_signin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        signup_signin sup = new signup_signin();
        System.out.println("if you want to sign in enter i / to sign up enter u");
        String sign = scan.next();
        if("u".equals(sign)){
         sup.Signup();
            System.out.println("did you want to continue y / n");
            String con = scan.next();
            if("y".equals(con)){
                 sup.signin();}
            else if("n".equals(con)){System.out.println("good lack , data saved");}
            else{System.out.println("try again with enter y / n");
                 String tryenter = scan.next();
                 if("y".equals(tryenter)){sup.signin();}
                 else if("n".equals(tryenter)){System.out.println("good lack , data saved");}
                 else{System.out.println("good lack , data saved");}
            }
        
     }
        else if ("i".equals(sign)){
            sup.signin();
            
        }
        else{System.out.println("try again");
        }
     
    }
    
}
