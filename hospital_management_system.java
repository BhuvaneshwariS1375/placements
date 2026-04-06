package placement;
import java.util.Scanner;
public class hospital_management_system {
	static String[] patientNames = new String[100];
    static int[] patientIds = new int[100];
    static int patientCount = 0;
    static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		 while (true) {
	            System.out.println("\n--- Hospital Management System ---");
	            System.out.println("1. Add Patient\n2. View Patients\n3. Search Patient\n4. Delete Patient\n5. Exit");
	            System.out.print("Choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Clear buffer

	            if (choice == 1) addPatient();
	            else if (choice == 2) viewPatients();
	            else if (choice == 3) searchPatient();
	            else if (choice == 4) deletePatient();
	            else if (choice == 5) break;
	            else System.out.println("Invalid choice!");
	        }
	    }

	    public static void addPatient() {
	        System.out.print("Enter ID: ");
	        patientIds[patientCount] = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Enter Name: ");
	        patientNames[patientCount] = scanner.nextLine();
	        patientCount++;
	        System.out.println("Patient added successfully!");
	    }

	    public static void viewPatients() {
	        System.out.println("\nID\tName");
	        for (int i = 0; i < patientCount; i++) {
	            if (patientIds[i] != -1) { // Check if not deleted
	                System.out.println(patientIds[i] + "\t" + patientNames[i]);
	            }
	        }
	    }

	    public static void searchPatient() {
	        System.out.print("Enter Name to search: ");
	        String searchName = scanner.nextLine();
	        for (int i = 0; i < patientCount; i++) {
	            if (patientNames[i].equalsIgnoreCase(searchName)) {
	                System.out.println("Found! ID: " + patientIds[i]);
	                return;
	            }
	        }
	        System.out.println("Patient not found.");
	    }

	    public static void deletePatient() {
	        System.out.print("Enter ID to delete: ");
	        int deleteId = scanner.nextInt();
	        for (int i = 0; i < patientCount; i++) {
	            if (patientIds[i] == deleteId) {
	                patientIds[i] = -1; // Mark as deleted
	                System.out.println("Patient removed.");
	                return;
	            }
	        }
		//Scanner sc = new Scanner(System.in);
		//System.out.println("-----Hospital Management System-----");
		//System.out.println("Enter choice(1-4): ");
		//4int choice = sc.nextInt();
		
	}

}
