// return how many paths avalable from left up corner to right low corner.
// only move to right or down
// the grid can not be reach if it is -1

public class GetPathChessBoard {

    public static void main(String[] args) {
        int[][] m = {{1,1, 1, 1, 1,1}, {1,1,-1,-1,1,1}, {1,1,-1, 1,-1,1}};

        int path = getPath(m,2,5);

        System.out.println(path);
    }

    public static int getPath(int[][] m, int i, int j) {

        if (m[i][j] == -1) {
            return 0;
        }

        if (i>0 && j>0) {
            return getPath(m, i-1, j) + getPath(m, i, j-1);
        } else if (i==0 && j>0) {
            return getPath(m, i, j-1);
        } else if (i>0 && j==0) {
            return getPath(m, i-1, j);
        } else {
            return 1;
        }

    }

}
