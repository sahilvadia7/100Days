package DSA.Array;

public class reverseArray {
    static int[] array = new int[100];

    public static void main(String[] args) {
    array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("normal array");
    for (int i=0; i<array.length; i++) {
        System.out.print(array[i] + " ");
    }

    System.out.println("\nreversed array");
    for (int i = array.length - 1; i >= 0; i--) {
        System.out.print(array[i] + " ");
    }
    }
}
