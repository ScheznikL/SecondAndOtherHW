package HW_Arrays;

import java.util.Arrays;

public class ArrayUn {
    public static void main(String[] args) {

        int [] arr1= {4, -100, 6};
        int [] arr2 ={233,122,455,667,-3};

        int [] arrUn = Arrays.copyOfRange(arr1,0,arr1.length+arr2.length);

        for(int i = arr1.length,j=0;i<arrUn.length;i++,j++){
            arrUn[i]=arr2[j];
        }

        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array:" + Arrays.toString(arr2));
        System.out.println("United array: " + Arrays.toString(arrUn));
    }
}
