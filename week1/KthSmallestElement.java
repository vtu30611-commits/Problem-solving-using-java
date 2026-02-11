import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;  
        if (k > 0 && k <= arr.length) {
            Arrays.sort(arr);  
            System.out.println("The " + k + "rd smallest element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of K");
        }
    }
}
