public class TaskWithTwoArray {
    public static void twoArray() {


        int[] array = new int[10];
        int[] array2 = new int[10];
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = DisplayResult.random.nextInt(11);
            sum = sum + array[i];
        }
        int mean = sum / array.length;

        for (int i = 0; i < array2.length; i++) {
            array2[i] = DisplayResult.random.nextInt(11);
            sum2 = sum2 + array2[i];
        }
        int mean2 = sum2 / array2.length;

        if (mean > mean2) {
            System.out.println("Больше среднее значение первого масива " + mean);
        }
        else if (mean < mean2) {
            System.out.println("Больше среднее значение второго масива " + mean2);
        }
        else
            System.out.println("Средние значения равны " + mean);
    }
}