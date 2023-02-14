//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
/**
 * reverseArray
 */
public class reverseArray {

    public static void main(String[] args) {
        int[] arr = {5,1};
        int arrLen = arr.length;


        for (int i = 0; i < arrLen/2; i++) {

            int temp = arr[i];
            arr[i] = arr[arrLen-i-1];
            arr[arrLen-1-i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}