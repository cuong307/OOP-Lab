package hust.soict.dsai.ooplab01;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class DayOfMonth  {
	public static void main(String []args) { 
        
		String[] monthinnum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] month3 = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        String[] monthabbre = {"jan.", "feb.", "mar.", "apr.", "may.", "jun.", "jul.", "aug.", "sep.", "oct.", "nov.", "dec."};
        String[] monthf = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};      
        int index = -1;
        boolean validInput = false;
        
        /*enter input*/
        Scanner keyboard = new Scanner(System.in);   		   	
        System.out.println("enter month");
    	String month = keyboard.nextLine().toLowerCase();
    	System.out.println("enter year");
    	int year = keyboard.nextInt();
    
        /*check leap year*/          
        if ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
                day[1]++;
                validInput=true;
        }
        
        /*check month*/
        for (int i = 0; i < monthf.length; i++) {
        	if ( month.equals(monthabbre[i]) || month.equals(month3[i]) || month.equals(monthinnum[i]) && year>0 ) {                   
        		index = i;
        		validInput=true;               
            }       
        }   
        
        if (!validInput) {
            System.out.println( "Invalid input.");
        }
        else {
        System.out.println( "There are " + day[index] + " days in " + monthf[index] + ", " + year + ".");
        }
	} 
}