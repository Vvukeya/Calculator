/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator2;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class CALCULATOR2 {

    public static void main(String[] args) {
     Scanner scan =new Scanner(System.in);
    
        float num1, num2;
        char operation;
        
        System.out.print("Enter a Number:");
        num1 = scan.nextFloat();
        System.out.print("Enter another Number:");
        num2 = scan.nextFloat();
        System.out.print("Operation to perform:");
        operation = scan.next().charAt(0);
        
        switch(operation){
            case '+':
                System.out.print(num1 + num2);
            break;
            case '-':
                System.out.print(num1 + num2);
            break;
            case '*':
                System.out.print(num1 + num2);
            break;
            case '/':
                if(num2 ==0){
                    System.out.print("Error: Division by zero");
                }else{
                    System.out.print(num1 / num2);
                }
                break;
            default:
                System.out.print("Invalid Operator");
        }
    }
    
}

