/**
 * MatricTriangle
 */
public class MatricTriangle {

    public static void main(String[] args) {

        int [][]box = {
            {1,0,0,0},
            {0,2,0,0},
            {0,0,3,0},
            {0,0,0,4},
        };
        
        System.out.println(triangleChecker(box));
    }

    public static boolean triangleChecker(int[][] arr){

        boolean ans = true;
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==0) {
                    cnt++;
                }
            }
            if(cnt == arr[0].length-1){
                ans =true;
            }
            else{
                ans=false;
                break;
            }
        }
        return ans;
    }
}