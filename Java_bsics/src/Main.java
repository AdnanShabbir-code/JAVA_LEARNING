import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name= "Adnan";

        //name.length it gives the total length of character
        /*int value=name.length();
        System.out.println(value);*/

        //name.lowercase it makes all string value into lowercase
        /*String lowercase=name.toLowerCase();
        System.out.println(lowercase);*/

        //name.uppercase it makes all string value into uppercase
        /*String uppercase=name.toUpperCase();
        System.out.println(uppercase);*/

        //name.trim removes all blank space
        /*String removesblankspace=name.trim();
        System.out.println(removesblankspace);*/

        //name.substring(2) example Adnan index 0-1-2-3-4 then output is nan shows index 2,3,4
        //System.out.println(name.substring(2));

        //name.substring(1,3) it shows Adnan dn it shows index 1 and 2
        //System.out.println(name.substring(1,3));

        //name.replace('n','m') it replace that alphabet output Admam
        //System.out.println(name.replace('n','m'));

        //name.replace("nan","ram") output Adram
        //System.out.println(name.replace("nan","ram"));

        //it check does it starts with Adn then true otherwise false it gives boolean value
        //System.out.println(name.startsWith("Adn"));

        //it check ends with or not all java is case sensitive
        //System.out.println(name.endsWith("Adn"));

        //it shows the exact number of index alphabet
        //System.out.println(name.charAt(2));

        //it shows first alphabet index here dn shows d index which is 1 in Adnan
        //System.out.println(name.indexOf("dn"));

        //it shows from which index nan starts in Adnan it is 2
        //System.out.println(name.indexOf("nan",0));

        //it checks from right to left Adnan it checks from n which index is 0
        //System.out.println(name.lastIndexOf("an"));

        //System.out.println(name.equals("Adnan"));  //output True
        //System.out.println(name.equals("adnan"));  //output flase because case sensitive

        //it ignore case sensitivity
        //System.out.println(name.equalsIgnoreCase("AdNaN"));


        }
    }