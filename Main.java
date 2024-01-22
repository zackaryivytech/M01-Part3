import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {

                System.out.println("y: " +i + " x: " + j + " = ");
                m1[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {

                System.out.println("y: " +i + " x: " + j + " = ");
                m2[i][j] = scanner.nextInt();
            }
        }

        System.out.println(equals(m1, m2));

    }

    public static boolean equals(int[][] m1, int[][] m2){

        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                if(m1[i][j] != m2[i][j])
                    return false;
            }
        }
        return true;
    }
}