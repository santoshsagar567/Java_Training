public class BasicsPrct_19_Student {

    // Create a Student class that automatically assigns a unique roll number to each new student (use a static variable).
    private static int nextRollNumber = 12501001; // Static variable to keep track of the next available roll number
    private int rollNumber;
    private String name;
    private int age;

    // Constructor
    public BasicsPrct_19_Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.rollNumber = nextRollNumber; // Assign the current nextRollNumber
        nextRollNumber++; // Increment for the next student
    }

    // Getter methods
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        BasicsPrct_19_Student student1 = new BasicsPrct_19_Student("Rahul", 16);
        BasicsPrct_19_Student student2 = new BasicsPrct_19_Student("Priya", 17);
        BasicsPrct_19_Student student3 = new BasicsPrct_19_Student("Mohan", 16);

        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}