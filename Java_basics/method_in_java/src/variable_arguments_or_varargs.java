public class variable_arguments_or_varargs {
    /*from this varargs we should do multiple operations without making multiple overloaded functions
    which is method overloading */
 /* static int sum(int...arr){
        int result=0;
        for(int a:arr) {
            result+=a; }
        return result;
        }
        public static void main(String[]args){

            System.out.println(  +sum(3,4,5,6));  */

    //from method overloading
    //but from this we have to make multiple overloaded functions so varargs is best approach
 /*  static int sum(int a){
        return a;
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    } */
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public static void main(String[]args){
        System.out.println(+sum(3,4,5,6));
    }
    }
