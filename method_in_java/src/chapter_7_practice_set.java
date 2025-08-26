  //import java.util.Scanner; //for convert celcius into fahrenheit
public class chapter_7_practice_set {

      // question 1 = multiplication table using Java method
   /* static void multiplication(int a){
        for(int b=1; b<11; b++){
            System.out.format("%d X %d=%d\n",a,b ,a*b);
        }
    }

    public static void main(String[] args) {
       multiplication(7); */

      // question 2= star pattern print using functions
   /* static void pattern(int a) {
        for (int b = 0; b < a; b++) {
            for (int c = 0; c < b +1; c++) {
                System.out.print("*"); }
                    System.out.println();
                }
            }
        public static void main (String[]args){
            {
            pattern(4); }
        } */

      // question 3= sum of n natural numbers by recursion
 /* static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
        return n + sum(n - 1); }
    }

    public static void main(String[] args) {
           int a = sum(3);
        System.out.println(a);
    } */

      //question 4= star print in decreasing order
  /*  static void pattern(int a) {
        for (int b =a ; b > 0; b--) { //how many rows loop
            for (int c = 0; c <b; c++) { //how star print in a row
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        {
            pattern(4); }
        } */

      //print nth term of fibonacci series
      // 0,1,1,2,3,5,8,13,21,34
      //  static int fibonacci(int n) {
     /*   if (n == 1) {
            return 0;
        }
        else if (n == 2) {
            return 1;
        } */
   /*     if(n==1 || n==2) {
            return n-1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
        public static void main(String[]args){

        int result=fibonacci(7);
            System.out.println(+result);
}*/

      //repeat 4 using recursion
 /*   static void repeat(int times){
        if(times==0){
            return;
        }
        repeat(times-1);
        System.out.println(4);
    }
    public static void main(String[]args){
        repeat(5);
    } */

      //find average using variable arguments (varargs)
  /*   static float avg(int... arr) {
        float average=0;
        float sum = 0;
        for (int a : arr) {
            sum += a;  }
        average=sum/arr.length;{
        return average ; }
    }
    public static void main(String[] args) {

        System.out.println( "average= " +avg(3, 4, 5, 6,12));
    } */

      //celsius to fahrenheit converter
 /*   static double tempconvert(double celsius) {
        return (celsius*1.8)+32;
    }
    public static void main (String[]args){
        double celsius=37;
        double fahrenheit=tempconvert(celsius);
        System.out.println(celsius+ "℃="+fahrenheit+"℉");
    } */

      //another way to convert celcius into fahrenheit
  /*  static float tempconvert(float celsius){
        float fahrenheit=0;
        return (celsius*1.8f)+32;
    }
    public static void main(String[]args){
        System.out.println(tempconvert(37));
    } */

      //another way to convert celsius into fahrenheit with taking input
  /*  static float tempconverter(float celsius){
        return (celsius*1.8f)+32;
    }
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature in celsius");
        float celsius=sc.nextFloat();
        float fahrenheit=tempconverter(celsius);
        System.out.println(celsius+"℃=" + fahrenheit +"℉");
        sc.close();
    } */

      //repeat 3 using iterative approach
  /* static void repeat() {
        for (int a = 1; a <= 5; a++) {
            System.out.println(3);
        }
    }
    public static void main(String []args){
        repeat();
    } */

      //pattern print using recursive approach
  /*  static void pattern_rec(int n){
        if( n > 0)
            pattern_rec(n-1);
        for(int i=0; i < n; i++) {
            System.out.print("*"); }
        System.out.println();
    }
    public static void main (String []args){
        pattern_rec(3);
    }  */


  }























