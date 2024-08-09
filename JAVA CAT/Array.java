import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int[] array = new int[15];
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            array[i] = scan.nextInt();
        }

        
        System.out.println("Array elements:");
        System.out.println(Arrays.toString(array));

        System.out.println("Enter a number to search:");
        int searchNumber = scan.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < 15; i++) {
            if (array[i] == searchNumber) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        
        Arrays.sort(array);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));

        
        int[] reversedArray = new int[15];
        for (int i = 0; i < 15; i++) {
            reversedArray[i] = array[14 - i];
        }
        System.out.println("Reversed array:");
        System.out.println(Arrays.toString(reversedArray));

        
        int sum = 0;
        long product = 1;
        for (int num : array) {
            sum += num;
            product *= num;
        }
        System.out.println("Sum of elements: " + sum);
        System.out.println("Product of elements: " + product);

        scan.close();
    }
}


