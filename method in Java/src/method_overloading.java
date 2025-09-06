public class method_overloading {
    //case 1 changing the integer
   /* static void change(int a) {
        a=98;
} */
    //case 2 changing the array
  /*  static void change2 (int[]array){
        array[0]=98;
    } */
    public static void main (String[]args){
       /* int x=45;
        change(x);
        System.out.println("The value of x after running change is: " +x); */
        //it does not change because the copy of x goes to the int a

      /*  int[] marks={52,73,77,89,97,94};
        change2(marks);
        System.out.println("value of x after running change is: " +marks[0]); */
        /* it will change because here the reference of marks goes means the adress of thet elements
        where these elements stored in the memory */

    }
}
