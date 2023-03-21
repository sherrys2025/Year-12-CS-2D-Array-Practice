public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int[][] arr){
        int sum = 0;
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // 2. sumRowN
    public static int sumRowN(int[][] arr, int row){
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[row][i];
        }
        return sum;
    }

    // 3. sumColN
    public static int sumColN(int[][] arr, int col){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum;
    }

    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] arr, int startCol, int startRow, int endCol, int endRow){
        // method 1 - works
//        int sum = 0;
//        for (int i = 0; i<arr.length; i++){
//            for(int j = 0; j<arr[0].length; j++){
//                if(i*arr[0].length+j+1 >= startY * arr[0].length + startX + 1 && i*arr[0].length+j+1 <= endY * arr[0].length + endX + 1) {
//                    sum += arr[i][j];
//                }
//            }
//        }
//        System.out.println("done");
//        return sum;


        // method 2 - works
//        int sum = 0;
//        for (int col = 0; col < arr.length; col++){
//            for(int row = 0; row < arr[col].length; row++){
//                if(col*arr[0].length + row >= startCol * arr[0].length + startRow && col*arr[0].length + row <= endCol*arr[0].length + endRow)
//                    sum += arr[col][row];
//            }
//        }
//        return sum;

        // method 3 - works
        int sum = 0;
        boolean collect = false;
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr[col].length; row++) {
                if(col == startCol && row == startRow) collect = true;
                else if (col == endCol && row == endRow){
                    sum += arr[col][row];
                    collect = false;
                }

                if(collect) sum += arr[col][row];
            }
        }
        return sum;



    }

}
