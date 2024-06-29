package DSA.Array;

public class insertArray {
    static int n =4;
    static int capacity = 10;
    static String newData = "Audi";
    static String[] cars = new String[10];


    public static void main(String[] args) {


        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Mazda";

        System.out.println("Before new data");
        for(int j=0; j<n; j++){
            System.out.println(cars[j]);
        }


        n = insertToEnd(cars,n,capacity,newData);

        System.out.println("After new data");

        for(int j=0; j<n; j++){
            System.out.println(cars[j]);
        }




      }

    private static int insertToEnd(String[] cars, int n, int capacity, String newData) {

        if (n>capacity){
            return n;
        }
        cars[n] = newData;
        return (n+1);


    }



}
