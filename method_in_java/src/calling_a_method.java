public class calling_a_method {

    int logic(int x,int y){   //if we dont use static we should make an object of this
        int z;                //calling_a_method
        if(x>y) {
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[]args){

        int a=5;
        int b=7;
        int c;
        calling_a_method obj=new calling_a_method();
        c=obj.logic(a,b);
        System.out.println(c);


    }
}
