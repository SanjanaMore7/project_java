package project_01;
import java.util.*;
//first class create  than create two array in function
class bill {
	void bill(String name[],int price[]) {
		for(int a=0;a<price.length;a++) {
			System.out.println((a+1)+""+name[a]+""+price[a]);
		}
	}
	void Total(int price[],int Gst) {
		int sum=0;
		int gst,total;
		for(int a=0;a<price.length;a++) {
			sum+=price[a];     //adding sum value and price
		}
		gst=(sum*Gst)/100;
		total=sum+gst;
		System.out.println("Total="+sum+"/-");
		System.out.println("---------------");
		System.out.println("Gst"+Gst+"%="+gst+"/-");
		System.out.println("---------------");
		System.out.println("Total+Gst ="+total+"/-");
	}
}
public class billing_system {
	public static void main(String[] args) {
		
		int gst=0;
		Scanner sc=new Scanner(System.in);
		bill obj=new bill();
		System.out.println("Enter Shop name=");
		String name =sc.next();
		System.out.println("Enter the size of list=");
		int size=sc.nextInt();
		
		
		String Data[]=new String [size];
		int data[]=new int[size];
		
		for(int a=0;a<Data.length;a++) {
			System.out.println("Enter the product="+(a+1));
			Data[a]=sc.next();
			
		}
		for(int a=0;a<Data.length;a++) {
			System.out.println("Enter the product="+Data[a]);
			data[a]=sc.nextInt();
	}
		System.out.println("Add GST (Enter 1 for yes or Enter 2 for no)");
		int Choice = sc.nextInt();
		if(Choice==1) {
			System.out.println("Enter Gst:-");
			gst=sc.nextInt();
			
		}
		else {
			System.out.println("Gst not applied");
		}
		System.out.println("------Bill-------");
		System.out.println("--"+name+"--");
		obj.bill(Data, data);
		System.out.println("---------");
		obj.Total(data, gst);
		
		
		
}
}
