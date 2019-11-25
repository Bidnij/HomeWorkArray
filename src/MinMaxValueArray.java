public class MinMaxValueArray {
    public static void minmax() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = DisplayResult.random.nextInt(100) - 50;
        }
        int min = array[0];
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > array[j - 1]) {
                max = array[j];
            }
            if (array[j] < array[j - 1]) {
                min = array[j];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}