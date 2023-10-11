
package tictactoe.datastructures;

@FunctionalInterface
public interface MatrixTraverseDo<T,R>{
    
    public void matrixDo(T element,Integer rowIndex,Integer columnIndex,R contextVariable);

}
