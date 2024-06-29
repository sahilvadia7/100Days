package DSA.Array;

public class averageAge {
    public static void main(String[] args) {
        int[] ages = {22,12,42,35,64};
        int sum = 0;

        for(int age: ages){
            sum += age;
        }
        System.out.print("Ages :");
        for(int age: ages){
            System.out.print(age+" ");
        }
        System.out.println("\nAverage sum of ages : "+sum/ages.length);
    }
}
