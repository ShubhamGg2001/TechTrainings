package Day3;

import java.util.ArrayList;
import java.util.List;

public class Sudoku {
    public static void main(String[] args) {
        String[][]board={{"5","3",".",".",".",".",".",".","."}
                        ,{"1",".",".",".","9","7",".",".","."}
                        ,{".","9","8",".",".",".",".","6","."}
                        ,{"8",".",".",".","6",".",".",".","3"}
                        ,{"4",".",".","8",".","3",".",".","1"}
                        ,{"7",".",".",".","2",".",".",".","6"}
                        ,{".","6",".",".",".",".","2","8","."}
                        ,{".",".",".","4","1","9",".",".","5"}
                        ,{".",".",".",".","8",".",".","7","9"}};
        System.out.println(isValidSudoku(board));
    }
    public static  boolean isValidSudoku(String[][]sudoku){
        List<String>tester=new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String s=sudoku[i][j];
                if(!s.equals("."))
                {
                    if(tester.contains(s+"_R_"+i)||tester.contains(s+"_C_"+j)||tester.contains(s+"_B_"+ i/3 +"_" +j/3))
                        return false;
                    else
                    {
                        tester.add((s+"_R_"+i));
                        tester.add((s+"_C_"+j));
                        tester.add((s+"_B_"+i/3+"_"+j/3));
                    }
                }
            }
        }
        return true;
    }

}
