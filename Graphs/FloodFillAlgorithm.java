public class FloodFillAlgorithm { //implemented using implicit graph

    private void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length
        || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        vis[sr][sc] = true; // Mark the cell as visited
        image[sr][sc] = color; // Update the color of the current cell

        // left
        helper(image, sr, sc - 1, color, vis, orgCol);
        // right
        helper(image, sr, sc + 1, color, vis, orgCol);
        // up
        helper(image, sr - 1, sc, color, vis, orgCol);
        // down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    public int[][] floodFill(int [][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        FloodFillAlgorithm obj = new FloodFillAlgorithm();
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, newColor = 2;
        int[][] result = obj.floodFill(image, sr, sc, newColor);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
