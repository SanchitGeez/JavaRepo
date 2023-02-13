//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
public class minmaxArray {
    public static void main(String[] args) {
        int[] arr = {25,110,77,64,23,13,9,5};
        int arr_length= arr.length;
        
        int min = arr[0];
        int max = arr[0];
        if (arr_length==0) {
            System.out.println("null");
        }
        else if (arr_length==1) {
            System.out.println("Min = Max = "+ arr[0]);
        }
        else{
            for (int i = 1; i < arr_length; i++) {
                if (arr[i]>max) {
                    max = arr[i];
                }else if (arr[i]<min) {
                    min = arr[i];
                }
            }
    
            System.out.println("Minimum = "+ min);
            System.out.println("Maximum="+ max);
        }
        
    }
}
