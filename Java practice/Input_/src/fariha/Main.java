package fariha;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String name;
        int id;
        int age;
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter id: ");
        id = input.nextInt();
        System.out.print("Enter age: ");
        age= input.nextInt();
        System.out.println("Name: "+name+"\nId:"+id+"\nAge:"+age);
    }
}
