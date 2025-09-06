//here Base is superclass and Derived extends Base is subclass so we can
//inherit Base through Derived class but we cannot inherit Derived class through Base class
//so we can access x and y both through Derived class but only access x through Base class

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritence {
    public static void main(String[] args) {

        Base b= new Base();
        b.setX(4);
        System.out.println(b.getX());

        //in Derived class we can use both Y and X because Derived is subclass of
        // Base superclass
        Derived d= new Derived();
        d.setX(43);
        System.out.println(d.getX());

        d.setY(22);
        System.out.println(d.getY());

    }
}



























