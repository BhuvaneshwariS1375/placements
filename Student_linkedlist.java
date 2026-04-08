package placement;
import java.util.Scanner;
class Student {
    int id;
    String name;
    Student next;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.next = null;
    }
}
class StudentList {
    Student head = null;
    void addStudent(int id, String name) {
        Student newStudent = new Student(id, name);
        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStudent;
        }
        System.out.println("Student added successfully!");
    }
    void displayStudents() {
        if (head == null) {
            System.out.println("No students found!");
            return;
        }

        Student temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name);
            temp = temp.next;
        }
    }
    void searchStudent(int id) {
        Student temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Student Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }
    void deleteStudent(int id) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.id == id) {
            head = head.next;
            System.out.println("Student deleted!");
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted!");
        }
    }
}
public class Student_linkedlist {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    list.addStudent(id, name);
                    break;

                case 2:
                    list.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    list.searchStudent(sid);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    list.deleteStudent(did);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }

}
