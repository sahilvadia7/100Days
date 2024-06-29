package DSA.ArraySorted;

public class sort1 {
    static int[] arr = {3, 4, 5, 1, 2, 6, 9, 10, 7, 8};
    static int temp ;

    public static void main(String[] args) {

        for (int i = 1; i < arr.length; i++) {

        for (int j = i + 1; j <arr.length; j++) {
            if (arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
            System.out.println(arr[i]);
        }


        int findElement = 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findElement) {
                System.out.println("Found at index of: "+(i-1));
            }
        }


    }
}
