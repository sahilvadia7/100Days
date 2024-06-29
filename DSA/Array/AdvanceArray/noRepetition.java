package DSA.Array.AdvanceArray;

import java.util.Scanner;

public class noRepetition {

    public static void main(String[] args) {

        myFunctions obj = new myFunctions();
        obj.insert();
        obj.remove();
        obj.printArray();
    }
}

class myFunctions{
    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in);
    int removeElement;
    int arrayUse;
    int position;
    int inspector;
    boolean flag = false;
    noRepetition obj = new noRepetition();

    public noRepetition insert(){
        System.out.print("Enter size of the array: ");
        arrayUse = sc.nextInt();

        for(int i=0;i<arrayUse;i++){

//
//            for(int j=i+1;j<arrayUse;j++){
//                inspector = arr[i];
//                System.out.println("in "+inspector);
//                System.out.println("j >>>"+j);
//
//                if(inspector == arr[j]){
//                    flag = false;
//                }
//                else{
//                    flag = true;
//                }
//
//
//
//                if(flag){
//                    System.out.println("duplication value is not allowed");
//                }else {

                    System.out.print("Enter element: ");
                    arr[i] = sc.nextInt();

//                }
//            }

        }
        return obj;

    }

    public noRepetition remove(){

        System.out.print("Enter element to remove: ");
        removeElement = sc.nextInt();
        position = srachElement(removeElement,arr);
        if(position== -1){
            System.out.print("You Element not there");
            System.exit(0);
        }
        for(int i=position;i<arrayUse-1;i++){
            arr[i] = arr[i+1];
        }
        arrayUse-=1;
        return obj;
    }

    public int srachElement(int removeElement, int[] arr) {

        for(int i=0;i<arrayUse;i++){
            if(arr[i]==removeElement){
                return i;
            }
        }
        return -1;
    }

    public void printArray() {
        for(int i=0;i<arrayUse;i++){
            System.out.print(arr[i]+" ");
        }
    }
}