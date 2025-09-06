class employee{
    int id;
    int age;
    String name;
    public void printdetails(){
        System.out.println("my name is" +name);
        System.out.println("my age is" + age);
        System.out.println("my id is " +id);
    }
}
public class introduction {
    public static void main(String[] args) {

        System.out.println("This is our custom class");
        employee adnan=new employee();
        employee daniyal=new employee();

        adnan.name=" Adnan ";
        adnan. age= 22;
        adnan.id= 22;

        daniyal.name=" Daniyal ";
        daniyal. age= 29;
        daniyal.id= 17;

        adnan.printdetails();
        System.out.println();
        daniyal.printdetails();

    }
}