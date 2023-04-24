package ooplab01;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class DayOfMonth  {
	public static void main(String []args) { 
        
		String[] monthinnum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] month3 = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        String[] monthabbre = {"jan.", "feb.", "mar.", "apr.", "may.", "jun.", "jul.", "aug.", "sep.", "oct.", "nov.", "dec."};
        String[] monthf = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};      
        int index=-1;
        boolean validInput=false;
        Scanner keyboard = new Scanner(System.in);   		
    	
        System.out.println("press a month a:");
    	String a = keyboard.nextLine().toLowerCase();
    	System.out.println("press a year b:");
    	int b = keyboard.nextInt();
    
        
       
            
        if ((b % 4 == 0 && b % 100 != 0 ) || b % 400 == 0) {
                day[1]++;
                validInput=true;
        }
            
        for (int i = 0; i < monthf.length; i++) {
        	if ( a.equals(monthabbre[i]) || a.equals(month3[i]) || a.equals(monthinnum[i]) && b>0 ) {                   
        		index = i;
        		validInput=true;
                
            }       
        }
        
         
        
        if (!validInput) {
            System.out.println( "Invalid input ");
            

        	
        }
        else {
        System.out.println( "There are " + day[index] + " days in " + monthf[index] + ", " + b);
        }
        } 
}