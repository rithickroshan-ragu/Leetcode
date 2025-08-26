class Solution {
    /*
        Technique: Math - Length Of Diagonal d = sqrt(l^^2 + w^^2)
        
        1. Calculate diagonal length for all rectangles in the array and retunr the area of the 
        rectangle with longest diagonal.
    
        TC: O(N) SC: O(1)
    */

    public int areaOfMaxDiagonal(int[][] dimensions) {
        int rectangleArea = Integer.MIN_VALUE;
        double diagonalLength = Double.MIN_VALUE;

        for (int[] dimension : dimensions) {
            int l = dimension[0];
            int w = dimension[1];
            double length = Math.sqrt((l * l) + (w * w));
            int area = l * w;

            if (length > diagonalLength) {
                diagonalLength = length;
                rectangleArea = area;
            } else if (length == diagonalLength && area > rectangleArea) {
                diagonalLength = length;
                rectangleArea = area;
            }
        }

        return rectangleArea;
    }
}