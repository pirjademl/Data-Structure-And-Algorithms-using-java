import java.util.Scanner;

class InnerArrayTest {

    public static void insert(int[] arr, int pos) {
        // shifting the array to the left
        for (int i = pos - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = 0; // assigning 0 value for the last element after deleting

    }
}

public class DeleteElement {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array elements");
        for (int i = 0; i < size; i++) {
            int var = sc.nextInt();
            arr[i] = var;
        }
        System.out.println("Elements Before deleting Element ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\tth Element\t" + arr[i]);
        }

        System.out.println("Enter the position you want to insert the element ");
        int pos = sc.nextInt(); // 2
        InnerArrayTest.insert(arr, pos);
        System.out.println("Array after deleting element ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}