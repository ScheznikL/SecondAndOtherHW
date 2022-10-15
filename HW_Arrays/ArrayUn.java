import java.util.Arrays;

public class ArrayUn {
    public static void main(String[] args) {

        int [] arr1= {4, 5, 6};
        int [] arr2 ={1,2,3,4,5};

        int [] arrUn = Arrays.copyOfRange(arr1,0,arr1.length+arr2.length);

        for(int i = arr1.length,j=0;i<arrUn.length;i++,j++){
            arrUn[i]=arr2[j];
        }

       // arrUn = Arrays.copyOfRange(arr2,arr1.length,arr2.length);
        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array:" + Arrays.toString(arr2));
        System.out.println("United array: " + Arrays.toString(arrUn));
    }
}
