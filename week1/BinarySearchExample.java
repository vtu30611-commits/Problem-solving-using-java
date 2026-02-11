public class BinarySearchExample {
    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25, 30}; 
        int key = 20; 

        int low = 0;
        int high = arr.length - 1;
        int mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
