import java.util.Scanner;

class InnerArrayTest {
   
    public static void insert(int[] arr, int pos, int val) {
        // traversing the arry to shift to the right hand side
        for (int i = arr.length - 1; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = val;

    }

}

public class ArrayTest {
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
        System.out.println("Elements Before Adding Element ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\tth Element\t" + arr[i]);
        }

        System.out.println("Enter the position you want to insert the element ");
        int pos = sc.nextInt();
        System.out.println("Enter element you want to insert");
        int val = sc.nextInt();
        InnerArrayTest.insert(arr, pos, val);
        System.out.println("\n\n Elements after adding the element");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}