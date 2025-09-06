import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //  0 for Rock
        //  1 for Paper
        //  2 for Scissor
        Scanner sc= new Scanner(System.in);
        System.out.println("(enter 0 for Rock)...(1 for paper)...(2 for scissor)");

        int userinput=sc.nextInt();
        Random random=new Random();

        int computerinput= random.nextInt(3);

        if(userinput==computerinput){
            System.out.println("Draw");
        } else if ( userinput==0 && computerinput==2 || userinput==1 && computerinput==0
                   || userinput==2 && computerinput== 1) {
            System.out.println("Adnan wins");
        }
        else {
            System.out.println("computer wins");
        }
        if(computerinput==0){
            System.out.println("computer choose Rock");
        } else if (computerinput==1) {
            System.out.println("computer choose Paper");
        }
        else if( computerinput==2){
            System.out.println("computer choose scissoor");
        }
    }
}