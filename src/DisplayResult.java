import java.util.Random;

public class DisplayResult {

    public static Random random = new Random();
    //public static final int randNumb = random.nextInt(10);



    public static void main (String[] args) {

        //TaskWithTwoArray.twoArray();
        //InputNumb.inputNub();
        //MinMaxValueArray.minmax();
        //RewriteArray.rewriteArray();

        int[][] twoDimArray = {{5, 7, 3, 17, 5}, {7, 0, 1, 12}, {8, 1, 2, 3, 2, 3}};//объявили массив и заполнили его элементами
        for (int i = 0; i < twoDimArray.length; i++) {  //идём по строкам
            for (int j = 0; j < twoDimArray[i].length; j++) {//идём по столбцам
                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        System.out.println();

        System.out.println(twoDimArray.length + " first length - количество строк в массиве");

        System.out.println();

        System.out.println(twoDimArray[0].length + " array length");
        System.out.println(twoDimArray[1].length + " array length");
        System.out.println(twoDimArray[2].length + " array length");
    }
}
