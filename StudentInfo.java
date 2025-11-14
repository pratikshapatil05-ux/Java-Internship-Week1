import java.util.Scanner;

public class StudentInfo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- STUDENT INFORMATION SYSTEM -----");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("\n----- STUDENT DETAILS -----");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Grade : " + grade);

        sc.close();
    }
}
