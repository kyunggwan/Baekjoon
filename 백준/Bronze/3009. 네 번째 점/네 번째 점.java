import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");
        String[] arr3 = br.readLine().split(" ");

        String x;
        String y;

        if (arr1[0].equals(arr2[0]) ) {
            x = arr3[0];
        } else if (arr1[0].equals(arr3[0])) {
            x = arr2[0];
        } else {
            x = arr1[0];
        }

        if (arr1[1].equals(arr2[1]) ) {
            y = arr3[1];
        } else if (arr1[1].equals(arr3[1])) {
            y = arr2[1];
        } else {
            y = arr1[1];
        }

        System.out.println(x + " " + y);
    }
}
