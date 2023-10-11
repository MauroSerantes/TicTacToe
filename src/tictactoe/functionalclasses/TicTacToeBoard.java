
package tictactoe.functionalclasses;

import tictactoe.datastructures.Intephases.Matrix;

public class TicTacToeBoard{
     
    Matrix<Byte> boardOfGame;
    
    private final char PLAYER_ONE_TOKEN = 'X';
    private final char PLAYER_TWO_TOKEN = 'O';
    private final char EMPTY_CELL = ' ';
    
    private final byte PLAYER_ONE_VALUE = 1;
    private final byte PLAYER_TWO_VALUE = 2;
    
    
    public TicTacToeBoard(){
        boardOfGame = new Matrix<>();
        
        for(int i=0;i<boardOfGame.amountOfRows();i++){
            
            for(int j=0;j<boardOfGame.amountOfColumns();j++){
                boardOfGame.insert((byte)0, i, j);
            }
            
        }
        
    }
    
    
    public boolean playerOneInsertToken(int rowIndex,int columnIndex){
        if(boardOfGame.getElement(rowIndex, columnIndex) == 0){
            
            boardOfGame.insert(PLAYER_ONE_VALUE, rowIndex, columnIndex);
            return true;
            
        }
        return  false;
    }
    
    public boolean playerTwoInsertToken(int rowIndex,int columnIndex){
       if(boardOfGame.getElement(rowIndex, columnIndex) == 0){
            
            boardOfGame.insert(PLAYER_TWO_VALUE, rowIndex, columnIndex);
            return true;
            
        }
        return  false;
    }
    
    public boolean checkEmptyCell(int rowIndex,int columnIndex){
        return (boardOfGame.getElement(rowIndex,columnIndex)==0);
    }
   
    public int checkThreeMarksInLine(){
       byte firstPlayerObjective = 1;
       byte secondPlayerObjective = 8;

       int i = 0;
       int j = 0;
       
       byte rows = 0;
       byte columns = 0;
       byte diagonalOne = 1;
       byte diagonalTwo = 1;
       
       while(i<boardOfGame.amountOfRows()){
           
            rows = 1;
            columns = 1;
            j = 0;
           
            while(j<boardOfGame.amountOfColumns()){
                rows *=  boardOfGame.getElement(i, j);
                columns *= boardOfGame.getElement(j, i);       
                j++;
            }
           
            if(rows == firstPlayerObjective || columns == firstPlayerObjective){
                return 1;
            }
            
            if(rows == secondPlayerObjective || columns == secondPlayerObjective){
                return 2;
            }
            
            diagonalOne *= (byte)boardOfGame.getElement(i, i);
            diagonalTwo *= (byte)boardOfGame.getElement(i, boardOfGame.amountOfColumns()-1-i);        
            
            i++;
       }
       
       if(diagonalOne == firstPlayerObjective || diagonalTwo == firstPlayerObjective){
           return 1;
       }
            
       if(diagonalTwo == secondPlayerObjective || diagonalTwo == secondPlayerObjective){
           return 2;
       }
       
       return 0;
    }
    
    //public Sting currentBoardStatus();
}// end of class
