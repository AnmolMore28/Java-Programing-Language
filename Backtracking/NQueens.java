public class NQueens {
 public static boolean Safezone(char Board[][] , int row ,int col){
    // vertically up
 for (int i = row-1; i>=0; i--){
  if(Board[i][col] =='Q'){
    return false;
  }
 }
    // dyanamically left
  for (int i = row-1,j=col-1; i>=0 && j>=0;i--,j--){
   if(Board[i][j] == 'Q'){
return false;
   }
  }
    // dynamically right
   for(int i = row-1,j=col+1; i>=0 && j<Board.length;i--,j++){
   if(Board[i][j] =='Q'){
   return false;
   }
   }
    return true;
 }
 

    public static void nQueens(char Board[][] ,int row ){
    if (row == Board.length) {
    // printQueen(Board);
    count++;
    return;
    }
 for (int j = 0; j < Board.length; j++) {
    if(Safezone(Board, row, j)){
        Board[row][j] ='Q';
        nQueens(Board,row+1);//function call
        Board[row][j] ='X'; // Backtracking   
}     
}} static int count =0;
public static void printQueen(char Board[][] ){
System.out.println("-----Chess board-----");    
for (int i = 0; i < Board.length; i++) {
        for (int j = 0; j < Board.length; j++) {
            System.out.print(Board[i][j]+" ");
        
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
int n=4;
char Board[][] = new char[n][n];    
for (int i = 0; i <n; i++) {
        for(int j =0; j<n;j++ ){
Board[i][j] = 'X';
        }
}
nQueens(Board,0);
System.out.println(" the no ways are = "+count);
}
}
