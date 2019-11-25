

import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class RewriteArray {
    public static void rewriteArray() {
        int[] array = new int[10];
        for (int i=0; i < array.length; i++) {
            //array[i] = DisplayResult.random.nextInt(100) - 50;
            array[i] = i;
        }
        int[] newarray = new int[10];

        for (int k =0; k<newarray.length; k++) {
            newarray[k] = array[array.length - k-1];
        }

        for (int j =0; j<newarray.length; j++){
            System.out.println(newarray[j]);
        }

        }
    }

