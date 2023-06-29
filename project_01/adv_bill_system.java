package project_01;
import java.util.*;
public class adv_bill_system {
	public static void main(String[] args) {
		String SName;     //Shop name
		char choice='N';
		int size=100;     //size limit
		int a=0,sum=0;
		int Gsum=0;    //Gst sum
		int Tsum=0;    //ToTal sum
		
		//here mentioned size of array
		String Pname[]=new String [size];
		int Pprice[]=new int [size];
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Shop name:- ");
		SName = sc.nextLine();
		
do {
			
			
			System.out.println("Enter food name "+(a+1));
			Pname[a]=sc.next();
			
			System.out.println("Add more (Y/N)"); //there is two choice Yes Or No
			choice = sc.next().charAt(0);
			a++;
		
				
				
				
			
			
}while(choice=='Y');  //if choice yes than loop is continued upto size you have mentioned
            size=a;
            System.out.println("The size of the list is "+size);
            System.out.println("-----PRICE-----");
            for(int j=0;j<size;j++) {
            	System.out.println("Enter the quantity of Food="+Pname[j]);
            	Pprice[j]=sc.nextInt();
            	sum += Pprice[j];
            	
            }
		
            System.out.println("Add Gst (Y/N)");
            choice = sc.next().charAt(0);
            // if you click yes than show this all text
            if (choice=='Y') {
            	Gsum=(sum*18)/100;
            	Tsum=sum+Gsum;
            	System.out.println("Printing Bill");
    			System.out.println("-----"+SName+"-----");
    			for(int k =0;k<size;k++) {
    				System.out.println((k+1)+"."+" "+Pname[k]+" :- "+Pprice[k]);
    				
    			}
    			System.out.println("--------------------");
    			System.out.println("Total:- "+sum);
    			System.out.println("GST 18%:- "+Gsum);
    			System.out.println("Total + GST:- "+Tsum);
    			
            }
            else {	
    			Tsum =  sum + Gsum;
    			System.out.println("Printing Bill");
    			System.out.println("-----"+SName+"-----");
    			for(int k =0;k<size;k++) {
    				System.out.println((k+1)+"."+" "+Pname[k]+" :- "+Pprice[k]);
    				
    			}
    			System.out.println("--------------------");
    			System.out.println("Total:- "+sum);
    			System.out.println("GST 0%:- "+Gsum);
    			System.out.println("Total + GST:- "+Tsum);
	}
            
            
	}
}

