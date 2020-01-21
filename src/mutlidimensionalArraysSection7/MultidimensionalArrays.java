package mutlidimensionalArraysSection7;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
 
            // -------------------------------------
            // |   [0][0]  |   [0][1]  |   [0][2]  |   
            // -------------------------------------
            // -------------------------------------
            // |   [1][0]  |   [1][1]  |   [1][2]  |
            // -------------------------------------
            // -------------------------------------
            // |   [2][0]  |   [2][1]  |   [2][2]  |
            // -------------------------------------
            // -------------------------------------
            // |   [3][0]  |   [3][1]  |   [3][2]  |
            // -------------------------------------
            // -------------------------------------


        int[][] multiTab = new int[4][3];
        multiTab[0][0] = 25;

        System.out.println(Arrays.toString(multiTab));
        System.out.println("multiTab [0][0] = " + multiTab[0][0]);

        multiTab[3][2] = 70;
        System.out.println("multiTab [3][2] = " + multiTab[3][2]);


        int[][] mutliTab2 = {
            {4, 15, 17},
            {5, 12, 125},
            {651, 78, 55},
            {98, 25, 44444}
        };
        
        System.out.println("mutliTab2[1][1] = " + mutliTab2[1][1]);
        System.out.println("mutliTab2[1][1] = " + mutliTab2[2][2]);
        System.out.println("mutliTab2[1][1] = " + mutliTab2[3][0]);

    }
}