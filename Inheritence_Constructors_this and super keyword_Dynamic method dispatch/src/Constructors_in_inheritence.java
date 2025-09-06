/* Here the output will be
I am a Constructor
I am a Constructor
I am a Derived child subclass Constructor
because first run Base1 class then Parent Base1 class then child Derived1 class */

/*class Base1{
    Base1(){
        System.out.println("I am a Constructor");
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a Derived child subclass constructor");
    }
}

public class Constructors_in_inheritence {
    public static void main(String[] args) {

        Base1 b= new Base1();
        Derived1 d= new Derived1();
    }
} */







/*super keyword is used when there are multiple Constructors in parent class or
 child class so we want to call particular Constructor from a single class or
 multiple class so super keyword will
 run that Constructor which will take that value as an input which we put in
 super(3) like here int value */

/*class Base2{
    Base2(){
        System.out.println("I am a Constructor");
    }
    Base2(int a){
        System.out.println("I am a Constructor with value of a as :" +a);
    }
}
class Derived2 extends Base2{
    Derived2(){
        super(3); //super keyword will only run that method which take 3 as a input as int
        System.out.println("I am a Derived Constructor");
    }
}

public class Constructors_in_inheritence {
    public static void main(String[] args) {

        Base2 b= new Base2();
        Derived2 d= new Derived2();
    }
}  */







/*here we put 3 as value of x so it will also jhalkega Base2 me even Base2 is a parent class
but it will make a as 3 means super keyword invoke parent class constructors,methods,variable */

/*class Base2{
    Base2(){
        System.out.println("I am a Constructor");
    }
    Base2(int a){
        System.out.println("I am a Constructor with value of a as :" +a);
    }
}

class Derived2 extends Base2{
    Derived2(){
       //  super(3); // here super keyword will only run that method which take 3 as a input as int
        System.out.println("I am a Derived Constructor");
    }

    Derived2(int x){
        super(x); //here super will invoke superclass as well as subclass x either in parent or child
        System.out.println("I am a Derived Constructor with value as x :" +x);
    }
}

public class Constructors_in_inheritence {
    public static void main(String[] args) {

        Base2 b= new Base2();
        Derived2 d= new Derived2(3);
 }
} */








/*here base is parent and independent it will run independently and derived is child of base
and childderived is child of derived and grandchild of base
 */

/*
class Base3{
    Base3(){
        System.out.println("I am a Base Constructor");
    }
    Base3(int a){
        System.out.println("I am a Base Constructor with value of a :" +a);
    }
}

class Derived3 extends Base3{
    Derived3(){
        //  super(3); // here super keyword will only run that method which take 3 as a input as int
        System.out.println("I am a Derived Constructor");
    }

    Derived3(int x){
        super(x); //here super will invoke superclass as well as subclass x either in parent or child
        System.out.println("I am a Derived Constructor with value x :" +x);
    }
}

class ChildDerived3 extends Derived3{
    ChildDerived3(){
       // super(4);
        System.out.println("I am a ChildDerived3 Constructor");
    }
    ChildDerived3(int y){
        super(y);
        System.out.println("I am a ChildDerived3 Constructor with value of y :"+y );
    }
}

public class Constructors_in_inheritence {
    public static void main(String[] args) {

        Base3 b= new Base3();
        Derived3 d= new Derived3(3);
        ChildDerived3 c= new ChildDerived3(4);
    }
} */




















