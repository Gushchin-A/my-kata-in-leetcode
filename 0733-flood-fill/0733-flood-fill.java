class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target = image[sr][sc];

        if (target == color) {
            return image;
        }

        boolean[][] visited = new boolean[image.length][image[0].length];
        walkAndFill(sr, sc, target, color, visited, image);

        return image;
    }

    public void walkAndFill(int sr,
                             int sc,
                             int target,
                             int color,
                             boolean[][] visited,
                             int[][] image) {

        if (sr < 0 || sr >= visited.length || sc < 0 || sc >= visited[0].length) {
            return;
        }

        if (visited[sr][sc]) {
            return;
        }

        if (image[sr][sc] != target) {
            return;
        }

        image[sr][sc] = color;
        visited[sr][sc] = true;
        walkAndFill(sr - 1, sc, target, color, visited, image);
        walkAndFill(sr, sc + 1, target, color, visited, image);
        walkAndFill(sr + 1, sc, target, color, visited, image);
        walkAndFill(sr, sc - 1, target, color, visited, image);
    }
}