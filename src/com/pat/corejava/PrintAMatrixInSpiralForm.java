package com.pat.corejava;
public class PrintAMatrixInSpiralForm {
public static void main(String...args){
    int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int row_start=0;
    int col_start=0;
    int row_end=array.length-1;
    int col_end = array[0].length-1;
    while(row_start <= row_end && col_start <= col_end){
        //keep row_start index constant and move the column index from start to end
        goleft:for(int i=col_start;i<= col_end;i++){
            System.out.print(array[row_start][i]+"  ");

        }

        // keep the col_end index constant and move the  row index from start to end
        godown:for(int j=row_start+1;j<row_end;j++){
            System.out.print(array[j][col_end]+"  ");
        }

        //keep the row end index constant and move col index from end to start
        goright:for(int k= col_end;k > col_start; k--){
             System.out.print(array[row_end][k]+"   ");
        }


        // keep the col start index constant and move the row end index to start
        goup:for(int l=row_end;l > row_start;l--){
            System.out.print(array[l][col_start]+"  ");
        }

        row_start++;
        row_end--;
        col_start++;
        col_end--;
}
}
}





