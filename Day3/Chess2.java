package Day3;

public class Chess2 {
    public static void main(String[] args) {
        String[][] board = {{ "", "K", "", "", "", "", "", "" },
                            { "", "", "", "", "", "E", "", "" },
                            { "", "H", "", "", "", "", "", "" },                          
                            { "", "", "", "", "H", "", "", "" },
                            { "", "E", "", "", "", "", "", "" },
                            { "", "", "", "", "", "", "Q", "" },
                            { "C", "", "", "", "", "", "", "" },
                            { "", "", "", "C", "", "", "", "" } };
        System.out.println(ifKingSafe(board));
    }

    public static boolean ifKingSafe(String[][] board) {
        int ai = -1;//Positions of king.
        int aj = -1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j].equals("K")) {
                    ai = i;
                    aj = j;
                }
            }
        }
        if (ai != -1) {
            if (!(checkCamel(ai, aj, board,"C") && checkHorse(ai, aj, board) && checkQueen(ai, aj, board)
                    && checkElephant(ai, aj, board,"E"))) {
                        return false;
            }
            return true;
        }
        return true;
    }

    private static boolean checkHorse(int i, int j, String[][] board) {
        if (((i-2>=0 && j+1<8)&&board[i - 2][j + 1].equals("H") || ((i-2>=0 && j-1<=0)&&board[i - 2][j - 1].equals("H"))
                        || ((i+2<8 && j+1<8)&&board[i + 2][j + 1].equals("H"))
                        || ((i+2<8 && j-1>=0)&&board[i + 2][j - 1].equals("H")) || ((i-2>=0 && j+2<8)&&board[i - 1][j + 2].equals("H"))
                        ||( (i-1>=0 && j-2>=0)&&board[i - 1][j - 2].equals("H"))
                        || ((i+1<8 && j+2<8)&&board[i + 1][j + 2].equals("H")) || ((i-1>=0 && j-2>=0)&&board[i + 1][j - 2].equals("H")))) {
            System.out.println("Horse Cuts");               
            return false;
        }
        return true;
    }

    private static boolean checkQueen(int i, int j, String[][] board) {
        if (!(checkCamel(i, j, board,"Q") && checkElephant(i, j, board,"Q"))){
            return false;
        }
        return true;
    }

    private static boolean checkElephant(int i, int j, String[][] board,String symbol) {
        String s1="";
        int jtemp1=j+1;
        while(jtemp1<8){
            s1=s1+board[i][jtemp1];
            if(s1.equals(symbol))
                { System.out.println(symbol+" cuts");
                    return false;}
                    jtemp1++;
        }
        String s2="";
        int jtemp2=j-1;
        while(jtemp2>=0){
            s2=s2+board[i][jtemp2];
            if(s1.equals(symbol))
                {
                    System.out.println(symbol+" cuts");
                    return false;
                }
                jtemp2--;
        }
        String s3="";
        int itemp3=i+1;
        while(itemp3<8){
            s3=s3+board[itemp3][j];
            if(s3.equals(symbol))
                {
                    System.out.println(symbol+" cuts");
                    return false;
                }
                itemp3++;
        }
        int itemp4=i-1;
        String s4="";
        while(itemp4>=0){
            s4=s4+board[itemp4][j];
            if(s1.equals(symbol))
               {
                System.out.println(symbol+" cuts");
                return false;
               }
               itemp4--;
        }
        return true;
    }

    private static boolean checkCamel(int i, int j, String[][] board,String symbol) {
        int itemp1 = i - 1;
        int jtemp1 = j + 1;
        String s1="";
        while (jtemp1 < 8 && itemp1 >= 0) {
            s1=s1+board[itemp1][jtemp1];
            if(s1.equals(symbol))
                {
                    System.out.println(symbol+" cuts");
                    return false;
                }
            jtemp1++;
            itemp1--;
        }

        String s2="";
        int itemp2 = i + 1;
        int jtemp2 = j - 1;
        while (itemp2 < 8 && jtemp2 >= 0) {
            s2=s2+board[itemp2][jtemp2];
            if(s2.equals(symbol))
                {
                    System.out.println(symbol+" cuts");
                    return false;
                }
            jtemp2--;
            itemp2++;
        }


        String s3="";
        int itemp3 = i + 1;
        int jtemp3 = j + 1;
        while (itemp3 < 8 && jtemp3 < 8) {
            s3=s3+board[itemp3][jtemp3];
            if(s3.equals(symbol))
            {
                System.out.println(symbol+" cuts");
                return false;
            }
            itemp3++;
            jtemp3++;
        }

        String s4="";
        int itemp4 = i - 1;
        int jtemp4 = j - 1;
        while (itemp4 >= 0 && jtemp4 >= 0) {
            s4=s4+board[itemp4][jtemp4];
            if(s4.equals(symbol))
            {
                System.out.println(symbol+" cuts");
                return false;
            }
            itemp4--;
            jtemp4--;
        }
        return true;
    }

}
