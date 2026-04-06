package placement;
import java.util.Scanner;
public class student_result_management_system {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String studentname;
		int[]marks = new int[3];
		int totalmarks = 0;
		float average;
		char grade;
		System.out.println("Enter student name: ");
		studentname = sc.nextLine();
		
		System.out.println("Enter marks for 3 subjects(out of 100):");
		for(int i=0; i<3 ; i++) {
			System.out.println("Subject "+(i+1)+" Marks: ");
			marks[i]=sc.nextInt();
			totalmarks += marks[i];
		}
		average = (float)totalmarks/3;
		if(average>=90) {
			System.out.println("A grade");
		}
		else if(average>=80) {
			System.out.println("B grade");
		}
		else if(average>=50) {
			System.out.println("C grade");
		}
		else {
			System.out.println("fail");
		}
		
	System.out.println("Average: "+average );	
	}

}
