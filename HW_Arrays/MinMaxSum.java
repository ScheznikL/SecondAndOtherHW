
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {

        int [] numArr = new int[10];
        int indexMin=-1,indexMax=-1,vMin,vMax,Sum=0;

        System.out.println("Enter any 10 numbers:");
        Scanner scan = new Scanner(System.in);

        for (int i=0; i < numArr.length; i++) {
            if(scan.hasNextInt())
                numArr[i] = scan.nextInt();
            else {
                System.out.println("Incorrect input!");
                return;
            }
        }


        vMin=numArr[0];
        for (int i=0; i < numArr.length; i++){
            if(numArr[i] < vMin){
                vMin=numArr[i];
                indexMin = i;
            }
        }
        vMax=numArr[0];
        for (int i=0; i < numArr.length; i++){
            if(numArr[i] > vMax){
                vMax=numArr[i];
                indexMax = i;
            }
        }

        if(indexMax<0||indexMin<0) {
            System.out.println("It seems you entered too many numbers..");
            return;
        }

        for(int i = indexMin+1; i<indexMax;i++) {
            Sum += numArr[i];
        }

        System.out.print("max index: " + indexMax + '\n' + "min index: " + indexMin + '\n' + "Sum:" + Sum);

    }
}