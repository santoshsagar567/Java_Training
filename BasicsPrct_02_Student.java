public class BasicsPrct_02_Student {

    /* Create a class Student with fields name, age, and grade. Write a method displayDetails() to print them. */

    String name = "Abhishek";
    int age = 18;
    char grade = 'B';

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {

        BasicsPrct_02_Student student = new BasicsPrct_02_Student();
        student.displayDetails();  //calling the method in main

    }


}
