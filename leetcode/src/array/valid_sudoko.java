public class Solution {
    public boolean ValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            Set<Character> rows = new HashSet<Character>();
            Set<Character> columns = new HashSet<Character>();
            Set<Character> cube = new HashSet<Character>();
            for(int j = 0; j < 9; j++){
                                                                                 
                if(board[i][j] != '.' && !rows.add(board[i][j])){                  // Checking row elements
                    return false;
                }
                
               
                if(board[j][i] != '.' && !columns.add(board[j][i])){               //checking coulmn elements
                    return false;
                }
                
                //checking elements in a particular box
                int rowIndex = 3 * (i / 3);     // row index of current cube        
                int colIndex = 3 * (i % 3);     // col index of current cube
                if(board[rowIndex + j / 3][colIndex + j % 3] != '.' &&
                   !cube.add(board[rowIndex + j / 3][colIndex + j % 3])){
                       return false;
                }
            }
        }
        return true;
    }
}
