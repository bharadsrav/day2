import java.util.Scanner;
public class oneplus{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter  name: ");
String name = sc.nextLine();
System.out.print("Enter  age: ");
int age = sc.nextInt();
System.out.print("Enter salary: ");
double salary = sc.nextDouble();
System.out.println("Details:");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Salary: " + salary);
    }
}