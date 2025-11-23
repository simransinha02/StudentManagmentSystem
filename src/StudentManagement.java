import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int roll;
    String name;
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n1.Add 2.View 3.Delete 4.Exit");
            int choice = sc.nextInt();
            if(choice == 1) {
                System.out.print("Enter Roll No: ");
                int r = sc.nextInt();
                System.out.print("Enter Name: ");
                String n = sc.next();
                students.add(new Student(r,n));
            } else if(choice == 2) {
                for(Student s : students)
                    System.out.println(s.roll + " - " + s.name);
            } else if(choice == 3) {
                System.out.print("Enter Roll No to delete: ");
                int r = sc.nextInt();
                students.removeIf(s -> s.roll == r);
            } else break;
        }
        sc.close();
        System.out.println("Program exited!");
    }
}
