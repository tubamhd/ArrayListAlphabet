public class ArrayListAlphabet {
    public static void main(String[] args) {
        String [][] letter = new String[7][4];
        String [][] firstline


        for (int i = 0; i < letter.length; i++){
            for (int j = 0; j < letter[i].length; j++){
                //Expecting from "i" fill to 0-3-6 colum(Logic)
                if ( i == 0 || i == 3 || i == 6){
                    //print star to 0-3-6 colum
                    letter[i][j] = " * ";
                //Expecting from "j" fill 0-3 colum(Logic)
                } else if (j == 0 || j == 3){
                    //print star 0-3 colum
                    letter[i][j] = " * ";
                }else{
                    //print gap for other colum
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
                //   i  j   i  j   i  j   i  j
                //  [0][0] [0][1] [0][2]
                //  [1][0]               [1][3]
                //  [2][0]               [2][3]
                //  [3][0] [3][1] [3][2]
                //  [4][0]               [4][3]
                //  [5][0]               [5][3]
                //  [6][0] [6][1] [6][2]

