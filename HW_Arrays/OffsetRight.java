
import java.util.Arrays;
import java.util.Scanner;

public class OffsetRight {
    public static void main(String[] args) {

        int [] values = new int[6];

        System.out.println("Enter any 6 numbers:");
        Scanner scan = new Scanner(System.in);

        for (int i=0; i < values.length; i++) {
            if(scan.hasNextInt())
                values[i] = scan.nextInt();
            else
            {
                System.out.println("Incorrect input!");
                return;
            }
        }
        int temp=values[values.length-1];

        for(int i = values.length-1; i >0;--i) {
            values[i]=values[i-1];
        }

        values[0]=temp;

        System.out.println("Your array has been shifted: " + Arrays.toString(values));
    }
}
