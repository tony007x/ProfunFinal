/**
 * MatricTriangle
 */
public class MatricTriangle {

    public static void main(String[] args) {

        int[][] box = {
                { 1, 0, 0, 0 },
                { 2, 3, 0, 0 },
                { 4, 5, 6, 0 },
                { 7, 8, 9, 9 },
        };

        int[][] box2 = {
                { 1, 2, 3, 4 },
                { 0, 5, 6, 7 },
                { 0, 0, 8, 9 },
                { 0, 0, 0, 9 },
        };

        System.out.println(triangleChecker(box2));
    }

    public static boolean triangleChecker(int[][] arr) {

        int lineChecker = 0;
        // CASE 1
        for (int i = 0; i < arr.length; i++) {

            int cnt = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][i] != 0) {
                    System.out.print(arr[i][j] + " ");
                    if (arr[i][j] != 0) {
                        cnt++;
                    }
                } else {
                    return false;
                }
            }
            System.out.println();
            if(cnt == arr[0].length-i || cnt == i+1){
                lineChecker++;
                System.out.println("Line: "+lineChecker);
            }

        }
        if (lineChecker == arr[0].length) {
            return true;
        } else {
            return false;
        }
    }
}