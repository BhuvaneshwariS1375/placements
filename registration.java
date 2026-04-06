package placement;
import java.util.Scanner;
public class registration {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter name:");
	        String name = sc.nextLine();
	        System.out.println("Enter age:");
	        int age = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter Id no:");
	        int Idno = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter e-mail Id:");
	        String email = sc.nextLine();
	        System.out.println("Enter passsword:");
	        String password = sc.nextLine();
	        if(name.isEmpty()){
	            System.out.println("Name cannot be empty");
	        }
	        else if(age<18){
	            System.out.println("Age must be 18 or above");
	        }
	        else if(!email.contains("@")){
	            System.out.println("invalid email");
	        }
	        else if(password.length()<6){
	            System.out.println("passsword must be atleast 6 characters");
	        }
	        System.out.println(name);
	        System.out.println(age);
	        System.out.println(Idno);
	        System.out.println(email);
	        System.out.println(password);
	        System.out.println("Registration Successful");
	    }
	}

