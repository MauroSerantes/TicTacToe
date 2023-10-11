
package tictactoe.game.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import tictactoe.functionalclasses.TicTacToeBoard;


public class TicTacToeGame extends JFrame {
    
    private TicTacToeBoard board;
    private int amountOfTurns;
    private int playerTurn;
    private boolean isAWinner;
    
    public TicTacToeGame() {
        initComponents();
        setFrameSpecifications();
        initEmptyCells();
             
        board = new TicTacToeBoard();
        amountOfTurns = 0;
        playerTurn = 1;
        isAWinner = false;
        gameStatus.setText("Player One Turn");

    }
     
    private void setFrameSpecifications(){
        this.setSize(290, 360);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    private void initEmptyCells(){
         ImageIcon icon = new ImageIcon(new ImageIcon("Images\\game\\empty.png").getImage().
                    getScaledInstance(cellOne.getWidth(), cellOne.getHeight(), 0));
         cellOne.setIcon(icon);
         cellTwo.setIcon(icon);
         cellThree.setIcon(icon);
         cellFour.setIcon(icon);
         cellFive.setIcon(icon);
         cellSix.setIcon(icon);
         cellSeven.setIcon(icon);
         cellEight.setIcon(icon);
         cellNine.setIcon(icon);
    }
    
    
    
    
    private String buttonPushAndUpdateStatus(int rowIndex,int columnIndex){       
        String filePath = null;
        boolean insertedValue = false;
        
        if(playerTurn == 1){
           insertedValue =  board.playerOneInsertToken(rowIndex, columnIndex);
           filePath = "Images\\game\\cross.png";
        }
        if(playerTurn == 2){
           insertedValue =  board.playerTwoInsertToken(rowIndex, columnIndex);
           filePath = "Images\\game\\circle.png";
        }
        
        if(insertedValue){
            amountOfTurns++;
            playerTurn = (playerTurn == 1)?2:1;
            checkWinnerStatus();;
            if(!isAWinner){
                
                if(playerTurn == 1){
                    gameStatus.setText("Player One Turn");    
                }
                    
                if(playerTurn == 2){
                    gameStatus.setText("Player Two Turn");
                }
                
                if(amountOfTurns == 9){
                    gameStatus.setText("Draw");
                }
            }
        }
           
        return filePath;
    }
    
    private void checkWinnerStatus(){
        int checkLineOfThree = board.checkThreeMarksInLine();
        if(amountOfTurns>=5 &&  checkLineOfThree != 0){       
            if(checkLineOfThree== 1){
                gameStatus.setText("Player One Wins");
            }
            if(checkLineOfThree== 2){
                gameStatus.setText("Player Two Wins");
            }
            isAWinner = true;
        }      
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        cellTwo = new javax.swing.JButton();
        cellThree = new javax.swing.JButton();
        cellFour = new javax.swing.JButton();
        cellOne = new javax.swing.JButton();
        cellSix = new javax.swing.JButton();
        cellSeven = new javax.swing.JButton();
        cellEight = new javax.swing.JButton();
        cellNine = new javax.swing.JButton();
        cellFive = new javax.swing.JButton();
        gameStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cellTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellTwoMouseClicked(evt);
            }
        });

        cellThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellThreeMouseClicked(evt);
            }
        });

        cellFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellFourMouseClicked(evt);
            }
        });

        cellOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellOneMouseClicked(evt);
            }
        });

        cellSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellSixMouseClicked(evt);
            }
        });

        cellSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellSevenMouseClicked(evt);
            }
        });

        cellEight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellEightMouseClicked(evt);
            }
        });

        cellNine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellNineMouseClicked(evt);
            }
        });

        cellFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellFiveMouseClicked(evt);
            }
        });

        gameStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(cellOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cellTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(cellFour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cellFive, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cellSix, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cellThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addComponent(cellSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cellEight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cellNine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gameStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellSix, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellFour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellFive, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellEight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellNine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(gameStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cellOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellOneMouseClicked
        if(board.checkEmptyCell(0, 0) && !isAWinner){
           String pathFile = buttonPushAndUpdateStatus(0, 0);
           ImageIcon icon = new ImageIcon(new ImageIcon(pathFile).getImage().
                    getScaledInstance(cellOne.getWidth(), cellOne.getHeight(), 0));
           cellOne.setIcon(icon);   
        }
    }//GEN-LAST:event_cellOneMouseClicked

    private void cellTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellTwoMouseClicked
        if(board.checkEmptyCell(0, 1) && !isAWinner){
           String pathFile = buttonPushAndUpdateStatus(0, 1);
           ImageIcon icon = new ImageIcon(new ImageIcon(pathFile).getImage().
                    getScaledInstance(cellTwo.getWidth(), cellTwo.getHeight(), 0));
           cellTwo.setIcon(icon);    
        }
    }//GEN-LAST:event_cellTwoMouseClicked

    private void cellThreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellThreeMouseClicked
      if(board.checkEmptyCell(0, 2) && !isAWinner){
          String pathFile = buttonPushAndUpdateStatus(0, 2);
          ImageIcon icon = new ImageIcon(new ImageIcon(pathFile).getImage().
                    getScaledInstance(cellThree.getWidth(), cellThree.getHeight(), 0));
          cellThree.setIcon(icon);
      }  
    }//GEN-LAST:event_cellThreeMouseClicked

    private void cellFourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellFourMouseClicked
        if(board.checkEmptyCell(1, 0) && !isAWinner){
           String pathFile = buttonPushAndUpdateStatus(1, 0);
           ImageIcon icon = new ImageIcon(new ImageIcon(pathFile).getImage().
                    getScaledInstance(cellFour.getWidth(), cellFour.getHeight(), 0));
           cellFour.setIcon(icon);    
        }
    }//GEN-LAST:event_cellFourMouseClicked

    private void cellFiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellFiveMouseClicked
        if(board.checkEmptyCell(1, 1) && !isAWinner){
           String pathFile = buttonPushAndUpdateStatus(1, 1);
           ImageIcon icon = new ImageIcon(new ImageIcon(pathFile).getImage().
                    getScaledInstance(cellFive.getWidth(), cellFive.getHeight(), 0));
           cellFive.setIcon(icon);  
        }
     
    }//GEN-LAST:event_cellFiveMouseClicked

    private void cellSixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellSixMouseClicked
        if(board.checkEmptyCell(1, 2) && !isAWinner){
            String pathFile = buttonPushAndUpdateStatus(1, 2);
            ImageIcon icon = new ImageIcon(new ImageIcon(pathFile).getImage().
                    getScaledInstance(cellSix.getWidth(), cellSix.getHeight(), 0));
            cellSix.setIcon(icon);
        }
    }//GEN-LAST:event_cellSixMouseClicked

    private void cellSevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellSevenMouseClicked
        if(board.checkEmptyCell(2, 0) && !isAWinner){
           String pathFile = buttonPushAndUpdateStatus(2, 0);
           ImageIcon icon = new ImageIcon(new ImageIcon(pathFile).getImage().
                    getScaledInstance(cellSeven.getWidth(), cellSeven.getHeight(), 0));
           cellSeven.setIcon(icon); 
        }
 
    }//GEN-LAST:event_cellSevenMouseClicked

    private void cellEightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellEightMouseClicked
        if(board.checkEmptyCell(2, 1) && !isAWinner){
            String pathFile = buttonPushAndUpdateStatus(2, 1);
            ImageIcon icon = new ImageIcon(new ImageIcon(pathFile).getImage().
                    getScaledInstance(cellEight.getWidth(), cellEight.getHeight(), 0));
            cellEight.setIcon(icon);
        }
       
    }//GEN-LAST:event_cellEightMouseClicked

    private void cellNineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellNineMouseClicked
         if(board.checkEmptyCell(2, 2) && !isAWinner){
             String pathFile = buttonPushAndUpdateStatus(2, 2);
             ImageIcon icon = new ImageIcon(new ImageIcon(pathFile).getImage().
                    getScaledInstance(cellNine.getWidth(), cellNine.getHeight(), 0));
             cellNine.setIcon(icon);
         }
    }//GEN-LAST:event_cellNineMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cellEight;
    private javax.swing.JButton cellFive;
    private javax.swing.JButton cellFour;
    private javax.swing.JButton cellNine;
    private javax.swing.JButton cellOne;
    private javax.swing.JButton cellSeven;
    private javax.swing.JButton cellSix;
    private javax.swing.JButton cellThree;
    private javax.swing.JButton cellTwo;
    private javax.swing.JTextField gameStatus;
    private javax.swing.JPanel principalPanel;
    // End of variables declaration//GEN-END:variables
}
