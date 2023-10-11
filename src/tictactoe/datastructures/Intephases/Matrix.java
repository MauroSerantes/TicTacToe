
package tictactoe.datastructures.Intephases;

import tictactoe.datastructures.*;
import tictactoe.datastructures.MatrixTraverseDo;


public class Matrix<T>{
    
    private Object[] arrayOfElements;
    private Integer rows;
    private Integer columns;
    private final Integer INIT_SIZE = 9;
    private final Integer INIT_SIZE_ROWS = 3;
    private final Integer INIT_SIZE_COLUMNS = 3;
    
    
    
    /**
     *  generates a matrix of size 3*3
     */
    public Matrix(){
        this.arrayOfElements = new Object[INIT_SIZE];
        rows = INIT_SIZE_ROWS;
        columns = INIT_SIZE_COLUMNS;
    }
   
    public Matrix(Integer rows, Integer columns){ 
        if(rows>0 && columns>0){
            this.rows = rows;
            this.columns = columns;
            Integer amountOfValues = rows*columns;
            this.arrayOfElements = new Object[amountOfValues];
        }
    }
    
    public Integer amountOfRows(){
        return rows;
    }
    
    public Integer amountOfColumns(){
        return columns;
    }
    
    public boolean insert(T element,Integer row,Integer column){
        boolean inserted = false;
        
        if((row>=0 && row<rows) && (column>=0 && column<columns)){
            
            Integer index = row * columns + column;
            arrayOfElements[index] = element;
            inserted = true;
        }
        
        return inserted;
    }
    
    public T getElement(Integer row,Integer column){
        T elementToReturn = null;
        
        if((row>=0 && row<rows) && (column>=0 && column<columns)){
             
            Integer index = row * columns + column;
            elementToReturn = (T) arrayOfElements[index];
            
        }
        
        return elementToReturn;
    }
    
    
    public void addRow(){
        rows += 1;
        Integer arrayNewSize = rows * columns;
        Object[] array = new Object[arrayNewSize];
        System.arraycopy(arrayOfElements, 0, array, 0, arrayNewSize-columns);
        arrayOfElements = array;
    }
    
    public void addColumn(){
        columns += 1;
        Integer arrayNewSize = rows * columns;
        Object[] array = new Object[arrayNewSize];
        System.arraycopy(arrayOfElements, 0, array, 0, arrayNewSize-rows);
        arrayOfElements = array;
        
        for(int i= rows-1;i>=0;i--){
            
            int index = columns * (i+1) - 1;
            
            for(int j=index-1;j>index-columns;j--){
                arrayOfElements[j] = arrayOfElements[j - i];
            }
            
        }
    }
    
    public boolean deleteRow(Integer rowIndex){
        boolean rowWasDeleted = false;
        
        if(rowIndex<0 || rowIndex>=rows) return rowWasDeleted;
            
        int initialIndex = columns * (rowIndex + 1);
        int totalCapacity = rows * columns;
            
        for(int i=initialIndex;i<totalCapacity;i++){
            arrayOfElements[i - columns] = arrayOfElements[i];
        }
            
        rows -= 1;
        Object[] array = new Object[totalCapacity - columns];
        System.arraycopy(arrayOfElements, 0, array, 0, totalCapacity - columns);
        arrayOfElements = array;
        rowWasDeleted = true;
            
        return rowWasDeleted;
    }
    
    public boolean deleteColumn(Integer columnIndex){
        boolean columnWasDeleted = false;
        
        if(columnIndex<0 || columnIndex>=columns) return columnWasDeleted;
            
        for(int i=0;i<rows;i++){
            
            int index = i * (columns + columnIndex) + 1;
            
            while((index < index + columns)  && (index < rows*columns)){
                arrayOfElements[index - (i+1)] = arrayOfElements[index];
                index++;
            }
        }
        
        columns -= 1;
        int newSize = rows * columns;
        Object[] array = new Object[newSize];
        System.arraycopy(arrayOfElements, 0, array, 0, newSize);
        columnWasDeleted = true;
        
        return columnWasDeleted;
    }

    
    // the type of the first argument of MatrixTraverseDo must be the same that the Matrix type of data.
    // the type of the second argument of MatrixTraverseDo must be the same of the contextVariable.
    //this method is static because it requieres versatility in data types.
    public static <R> void traverse(Matrix mtrx,MatrixTraverseDo m_interphase,R contextVariable){
        for(int i=0;i<mtrx.rows;i++){
            
            for(int j=0;j<mtrx.columns;j++){
                
                m_interphase.matrixDo(mtrx.getElement(i, j), i, j,contextVariable);
                
            }
            
        }
    }
}//end of class;
