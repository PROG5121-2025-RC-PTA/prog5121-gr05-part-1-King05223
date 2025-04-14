/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;

import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Assignment1 {

    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter your Username: ");
      scanner.nextLine();
        boolean validateUserame = false;
      
      if (validateUserame == true){
      System.out.println("Username successfully captured");
      }else{
          System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length. ");
          
      }
      
      System.out.print("Enter your Password: ");
      scanner.nextLine();
        boolean validatePassword = false;
      
      if (validatePassword == true){
      System.out.println("Password successfully captured");
      }else{
          System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital and small letter, a number and a special character. ");
      }
      
      System.out.print("Enter your Cellphone Numbers: ");
      int cellNumber = scanner.nextInt();
        boolean validateCellphoneNumbers = false;
      
      if (validateCellphoneNumbers){
      System.out.println("Cellphone number successfully added");
      }else{
          System.out.println("Cellphone number incorrectly formatted or does not contain international code ");
      }
      
 
     
      
      
      
      
      
      scanner.close();
      
      
    }



      
       
  
}
 