//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //2-d array another name multidimensional array
      /*  int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        } */




        //create 5 float and calculate their sum
      /*  float[]student={90.05f,91.03f,92.04f,99.1f,87.05f};

      //float[]student=new float[5];
      //student[0]=90.05f;
      //student[1]=91.03f; and so on like this but this is lengthy so we use the first one
      //for(float element:student) we can also use this to acess element
      // System.out.println(student[1]); //which we want to access just for demo
       float sum=0;
       for(int a=0; a<student.length; a++) {
        sum=sum+student[a]; }
        System.out.println(+sum); */



        //integer is present in an array or not
      /*  int[] marks = {90, 91, 94, 95, 90, 99, 87};
        int find = 94;
        boolean found = false;
        for (int element:marks) //we should use this if when all elements should be accessed
     //   otherwise for(int a=0; a<marks.length; a++)
            if(find==element){
                found=true;{
                    break;
                }
            }
                      if(found)
                          System.out.println("the value is present");
                      else
                      { System.out.println("the value is not present"); } */

        //average marks calculator
      /*  int[] marks={90,87,86,80,84};
        float sum=0;
        for(int element:marks)
            sum=sum+element;
        System.out.println(sum/marks.length); */

            /*l=array length  i=index number loop  l-1=because 0,1,2,3,4,=5 is length
            but we want only till last index 0 is excluded  tempbox=temporary box
            for swapping the array math.floor is for greatest integer like 5/2=2 and
            4/2=2 and 3/2=1 and 6/2=3*/
        //reversing of array
       /* int[] array={90,56,76,78,89};
        int a=Math.floorDiv(array.length,2);
        int l=array.length;
        int tempbox;
        for(int i=0; i<a; i++) {
            tempbox=array[i];
        array[i]=array[l-1-i];
        array[l-1-i]=tempbox; }

        for(int element: array) {

            System.out.print(" " +element); } */

        //whole code written by Adnan alone
      /* int [] array={10,20,30,40,50,60,70,80,90,100,110};
        int a=Math.floorDiv(array.length,2);
        int l=array.length;
        int temp;
        for(int i=0; i<a; i++) {
            temp = array[i];
            array[i]=array[l-i-1];
            array[l-i-1]=temp; }

        for(int element: array)
            System.out.print(" " +element);  */

// find maximum element of array but this will not work if the number is in (minus) like -20,-100
 /*  int[]array={-10,-20,-30,-40,-50,-60,-700,-70,-80,-90};
    int max=0;
    for(int e:array )
        if(e>max)
            max=e; {
        System.out.println("the maximum element is \n" +max); } */

        //this code gives both highest and lowest element by just changing +max and +min
      /*  int[]array={10,30,60,40,90,200,1,4,70};
        int max=array[0];
        int min=array[0];
        for(int e:array) {
            if (e > max) {
                max = e;
            }
            if (e < min) {
                  min = e;
              }
          }
        System.out.println(+min); */

//this will find minimum only if i know the highest element of the array
      /*  int[]array={10,20,40,80,60,55,-1,2,3};
        int min=80;
        for(int eleme: array)
            if(eleme<min)
                min=eleme;
        System.out.println("  " +min); */

        //check array is sorted or not
   /*     int[]array={10,20,30,40,50,70,60,80,100};
        boolean issorted=true;
        for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    issorted = false;
                break;
            }
        }
            if(issorted) {
                System.out.println("sorted"); }
            else {
                System.out.println("not sorted"); } */



    }
}































































