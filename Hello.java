import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter your Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "  +name+"!");
    }
}
