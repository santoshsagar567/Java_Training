import java.util.Scanner;

public class BasicsPrct_08_Person {

    // Define a class Person with a constructor to initialize name and age, and a method displayInfo(). //

    String name;
    int age;

    BasicsPrct_08_Person(){
        name = "Virat Kohli";
        age = 36;

    }

    void displayInfo(){

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main (String[] args) {

     BasicsPrct_08_Person P1 = new BasicsPrct_08_Person();
     P1.displayInfo();


    }

}
