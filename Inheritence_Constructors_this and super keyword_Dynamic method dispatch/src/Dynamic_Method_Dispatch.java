



class Phone{

    public void playmusic(){
        System.out.println("music is playing hanszimmer......");
    }

    public void on(){
        System.out.println("Phone is turning on......");
    }
}

class Smartphone extends Phone{

    public void on(){
        System.out.println("SmartPhone is turning.....");
    }

    public void greet(){
        System.out.println("apka swagat hai.......");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        Phone obj= new Smartphone();

        obj.on();
        obj.playmusic();
    }
}




















































































































