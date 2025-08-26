import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //basic else if
       /* int a=10;
        if(a==11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11"); */

        //student pass or fail calculator
       /* int java;
        System.out.println("enter java marks");
        java = sc.nextInt();

        int oops;
        System.out.println("enter oops marks");
        oops = sc.nextInt();

        int os;
        System.out.println("enter os marks");
        os = sc.nextInt();

        int sum = java + oops + os;
        double percentage = (sum / 300.0) * 100;
        System.out.println("The percentage of that student is");
        System.out.println(percentage + "%"); */

        //best approach for solving this

       /* if(percentage>=40 && java>=33 && oops>=33 && os>=33)
            System.out.println("you are pass");
        else
            System.out.println("you are fail"); */

        //or we can also do like this
       /* if(java>=33)
        if(oops>=33)
        if(os>=33)
            System.out.println("you passed in individual subjects");
        else
            System.out.println("you failed in Individual subjects");

        if(percentage>=40)
            System.out.println("you passed in overall percentage");
        else
            System.out.println("you failed in overall percentage"); */


        //income tax calculator
       /* System.out.println("enter your income");
        double tax=0;
        double income=sc.nextDouble();

        if(income>250000 && income<=500000){
            tax=tax+0.05*(income-250000);}
       else if(income>500000 && income<=1000000){
            tax=tax+0.05*(income-250000);
            tax=tax+0.2*(income-500000);
       }

       else if(income>1000000){
            tax=tax+0.05*(income-250000);
        tax=tax+0.2*(income-500000);
       tax=tax+0.3*(income-1000000);}

        else if(income<=250000){
            tax=tax+0;   }

        System.out.println("the total tax:"   +tax);  */


//Day calculator
       /* System.out.println("enter code of day");
        byte day=sc.nextByte();

        if(day==1)
            System.out.println("monday");
        if(day==2)
            System.out.println("tuesday");
        if(day==3)
            System.out.println("wednesday");
        if(day==4)
            System.out.println("thursay");
        if(day==5)
            System.out.println("friday");
        if(day==6)
            System.out.println("saturday");
        if(day==7)
            System.out.println("sunday"); */

        System.out.println("enter year");
        double year=sc.nextDouble();
        year=sc.nextDouble();


        System.out.println("it is a leap year");


        }

    }