import java.util.Scanner;

public class BasicsPrct_12_Employee {

    // Create two classes Address and Employee. Each Employee should have an Address object. Display employee details with address. //

    String employeeName;

    void displayName(){

        System.out.println("Name of the Employee: " + employeeName);

    }


    public static void main (String[] args) {

     BasicsPrct_12_Employee emp = new BasicsPrct_12_Employee();
     BasicsPrct_12_Address addr = new BasicsPrct_12_Address();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Employee details");
     System.out.println("Name : ");
     emp.employeeName = sc.nextLine();
     System.out.println("Address : ");
     addr.employeeAddress = sc.nextLine();
     emp.displayName();
     addr.displayAddress();


    }

}
