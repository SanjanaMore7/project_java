package project_02;
import java.awt.desktop.SystemEventListener;
import java.util.*;
public class password_checker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String correctPassword="sanjana7@";
		int attempts=3;
		
		
		System.out.println("set your Password:-");
		correctPassword=sc.nextLine();
		
		
		while (attempts>0) {
			System.out.println("Enter the Password");
			String enterPassword=sc.nextLine();
			if(enterPassword.equals(correctPassword)) {
				System.out.println("Correct password! You may proceed to the MCQ exam.");
				startMCQExam(sc);
				return;	
			}else {
			
				attempts--;
                System.out.println("Wrong password... Try " + attempts + " more time(s) out of 3.");
            }
			
		}
		System.out.println("You have exceeded the maximum number of password attempts. Program terminated.");
	}	
	
		 public static void startMCQExam(Scanner sc) {
			 int score=0;			 
			 System.out.println("MCQ Exam:");
		        System.out.println("Q1) Who invented Java Programming?");
		        System.out.println("   1) Guido van Rossum");
		        System.out.println("   2) James Gosling");
		        System.out.println("   3) Dennis Ritchie");
		        System.out.println("   4) Bjarne Stroustrup");
		        
		        System.out.print("Select your answer (1-4): ");
		        int answer1 = sc.nextInt();
		        if (answer1 == 2) {
		        	System.out.println("Correct answer! Proceeding to the next question.");
		            score++;
		        }
		        else {
		            System.out.println("Wrong answer. Try again next time.");
		            return;
		        }
		        System.out.println("Q2) Which component is used to compile, debug, and execute the Java programs?");
		        System.out.println("   1) JRE");
		        System.out.println("   2) JIT");
		        System.out.println("   3) JDK");
		        System.out.println("   4) JVM");
		        
		        System.out.print("Select your answer (1-4): ");
		        int answer2 = sc.nextInt();
		        if (answer2 == 3) {
		        	System.out.println("Correct answer!");
		            score++;
		        }
		        else {
		            System.out.println("Wrong answer. ");
		            return;
		        }
		        System.out.println("MCQ Exam completed. Your score is: " + score);
		 }
}
