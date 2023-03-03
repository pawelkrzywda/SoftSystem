import java.util.HashSet;
import java.util.Set;

class Task3 {
    Set blocks = new HashSet<>();

    public boolean checkSudoku(int[][] board) {
        if(board.length > 9){return false;}
        for (int i=0; i < board.length; i++){
            if(board[i].length > 9){
                return false;
            }
        }

        Set rows = new HashSet<>();
        Set columns = new HashSet<>();

        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(columns.contains(board[i][j])){
                    return false;}
                if(rows.contains(board[j][i])){
                    return false;}

                if(board[i][j] != '.'){ columns.add(board[i][j]);}
                if(board[j][i] != '.'){ rows.add(board[j][i]);}
            }
            rows.clear();
            columns.clear();
        }

        int i = 0, j = 0;
        while(i < 9 && j < 9) {
            while(i < 9) {
                if(!checkSection(board, i, j)){
                    return false;}
                i += 3;
                blocks.clear();
            }
            i = 0;
            j += 3;
        }
        return true;
    }

    private boolean checkSection(int[][] board, int i, int j) {
        for(int x = i; x < i+3; x++) {
            for(int y = j; y < j+3; y++) {
                if(blocks.contains(board[x][y])){
                    return false;}
                if(board[x][y] != '.'){
                    blocks.add(board[x][y]);}
            }
        }
        return true;
    }
}