
public class BasicsPrct_04_Employee {

    // Create a class Employee with attributes empId, name, and salary. Write methods to set and get employee details. //

    int empId;
    String name;
    int salary;

    void setEmployeeDetails(int empID,String empName,int empSal) {

        empId =  empID;
        name = empName;
        salary = empSal;

    }

    void getEmployeeDetails(){
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
    }


    public static void main (String[] args) {

     BasicsPrct_04_Employee emp1 = new BasicsPrct_04_Employee();
     emp1.setEmployeeDetails(1001,"Rahul", 25000);
     emp1.getEmployeeDetails();

     BasicsPrct_04_Employee emp2 = new BasicsPrct_04_Employee();
     emp2.setEmployeeDetails(1002,"Ajay", 23700);
     emp2.getEmployeeDetails();

    }

}
