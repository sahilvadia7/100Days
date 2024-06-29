package DSA.Array.twoDimensional;

public class pyramidPattern {
    public static void main(String[] args) {
        leftsidePyramidWithStar();
        leftsidePyramidWithNumbers();
        UpsideDownleftsidePyramidWithNumbers();
        fullPyramidWithNumbers();

    }

    private static void fullPyramidWithNumbers() {
        System.out.println("\nFull Pyramid With Numbers");
        int range=5;
        int num =1;
        for (int i=1;i<=range;i++) {
            for (int j=1;j<= 2*(range-i);j++) {
                System.out.print(" ");
            }
            for (int k=1;k<2*i;k++) {
                System.out.print(num+" ");
            }
            System.out.println();
            num++;
        }
    }

    private static void UpsideDownleftsidePyramidWithNumbers() {
        System.out.println("\nUpside-Down left side Pyramid With Numbers");
        int num = 5;
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
            }
            System.out.println();
            num--;
        }
    }

    private static void leftsidePyramidWithNumbers() {
        int num=1;

        System.out.println("\nleft side Pyramid With Numbers");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num++;
        }
    }

    private static void leftsidePyramidWithStar() {

        System.out.println("\nleft side Pyramid With Star");
        String star="*";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
