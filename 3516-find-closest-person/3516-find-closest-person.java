class Solution {
    public int findClosest(int x, int y, int z) {
        int xMove = Math.abs(z - x);
        int yMove = Math.abs(z - y);

        return (xMove) == (yMove) ? 0 : (xMove) < (yMove) ? 1 : 2;
    }
}
