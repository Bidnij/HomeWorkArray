import java.util.Scanner;

public class InputNumb {
    public static void inputNub(){
        int [] array = new int[10];
        Scanner s  = new Scanner(System.in);
        for (int i=0; i<10; i++)
        {
            array[i] =  s.nextInt();
        }
        s.close();
        for (int i=0; i<array.length; i++){
            System.out.println(i+"й элемент массива = " + array[i]);
        }
    }
}
