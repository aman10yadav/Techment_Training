/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techment.assignment.day3;

/**
 *
 * @author AMAN10HERO-PC
 */
public class BreakpointArray {
    
     public static void main(String args[]){
         int marks[] = {90,50,79,38};
         for(int i=0; i<marks.length; i++) {
             marks[i] = marks[i] + 10;
             if(marks[i]>45)
             {
                 System.out.println("Pass");
                 System.out.println(marks[i]);
             }
         }
     }
}
