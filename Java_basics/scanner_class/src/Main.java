import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter number 1");
        int a= Sc.nextInt();
        System.out.println("enter number 2");
        int b=Sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
        }
    }