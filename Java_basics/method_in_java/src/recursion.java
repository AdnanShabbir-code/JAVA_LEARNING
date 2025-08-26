public class recursion {

    static int factorial(int n){

        if(n==0 || n==1) {
            //factorial of 1 and 0 both are 1
            return 1;
        }
        else {
            return n*factorial(n-1);
            //factorial logic
        }
    }

    public static void main(String []args){

        int x=4;
        System.out.println(+ factorial(x));
    }
    }