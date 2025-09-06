

class Circle{
    Circle(){
        System.out.println("The perimeter of circle is 2*pi*r");
    }
}

class Cylinder extends Circle{
    Cylinder(){
        System.out.println("The area of cylinder is 2*pi*r*h");
    }
}


public class Practice_set_10 {
    public static void main(String[] args) {

        Circle c=new Circle();

        Cylinder h= new Cylinder();
    }
}








/*
class Rectangle{
    Rectangle(){
        System.out.println("A rectangle is a 2 dimensional");
    }
}

class Cuboid extends Rectangle{
    Cuboid(){
        System.out.println("A cuboid is a 3 dimensional");
    }
}

public class Practice_set_10 {
    public static void main(String[] args) {

        Rectangle r=new Rectangle();
        Cuboid c= new Cuboid();
            }
        }  */








/*
class Circle{
    int radius;

    Circle(int r){
        radius=r;
    }

    public float area(){
        return  (float)Math.PI*radius*radius;
    }
}

class Cylinder extends Circle {
    int height;

    Cylinder(int r, int h){
        super(r);
        height=h;
    }

    public float volume(){
        return  area()*height;
    }
}

public class Practice_set_10 {
    public static void main(String[] args) {

        Circle c=new Circle(5);

        Cylinder v=new Cylinder(5,3);

        System.out.println("the area of circle is :" +c.area());
        System.out.println("the volume of cylinder is :" +v.volume());
    }
}  */








/*
class Circle{
    int radius;

    public float area(){
        return  (float)Math.PI*radius*radius;
    }
}

class Cylinder extends Circle {
    int height;

    public float volume(){
        return  area()*height;
    }
}

public class Practice_set_10 {
    public static void main(String[] args) {

        Circle c=new Circle();
        c.radius=3;

        Cylinder v=new Cylinder();
        v.height=7;
        v.radius=4;

        System.out.println("the area of circle is :" +c.area());
        System.out.println("the volume of cylinder is :" +v.volume());
    }
}  */





/*
class Rectangle{
   private int length;
   private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public float area(){
        return length*breadth;
    }
}

class Cuboid extends Rectangle{

  private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float volume(){
        return area()*height;

    }
}

public class Practice_set_10 {
    public static void main(String[] args) {

        Rectangle r= new Rectangle();
        r.setLength(4);
        r.setBreadth(5);

        Cuboid c=new Cuboid();
        c.setLength(1);
        c.setBreadth(2);
        c.setHeight(3);

        System.out.println("The area of rectangle is :" +r.area());
        System.out.println("The volume of Cuboid is :" +c.volume());
    }
} */





















































































































































































































