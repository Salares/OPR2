package pred2;

import java.util.Scanner;

public class Game implements GameController{
    private Board board;
    private Player[] players;
    private Player playerOnMove;
    private boolean isRunning;


    @Override
    public void init() {
        playerOnMove = players[0];
        start();
        run();
    }

    @Override
    public void start() {
        this.isRunning = true;
    }

    @Override
    public void run() {
        while(isRunning) {
            playMove();
        }
    }

//    private void checkWinner() {
//
//        for (int a = 0; a < 8; a++) {
//            String line = null;
//            switch (a) {
//                case 0:
//                    line = board[0] + board[1] + board[2];
//                    break;
//                case 1:
//                    line = board[3] + board[4] + board[5];
//                    break;
//                case 2:
//                    line = board[6] + board[7] + board[8];
//                    break;
//                case 3:
//                    line = board[0] + board[3] + board[6];
//                    break;
//                case 4:
//                    line = board[1] + board[4] + board[7];
//                    break;
//                case 5:
//                    line = board[2] + board[5] + board[8];
//                    break;
//                case 6:
//                    line = board[0] + board[4] + board[8];
//                    break;
//                case 7:
//                    line = board[2] + board[4] + board[6];
//                    break;
//            }
//        }
//    }

    private void playMove() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" X: ");
        int moveX = sc.nextInt();
        System.out.print(" Y: ");
        int moveY = sc.nextInt();

        if(board.validateInsertPoint(moveX, moveY)) {
            board.updateBoard(moveX, moveY, playerOnMove.getSymbol());
        }

        System.out.println("Played move");

//        setOtherPlayer();


    }

    @Override
    public void stop() {
        this.isRunning = false;
    }

    private Player getPlayerOnMove() {
        return playerOnMove;
    }

//    private Player setOtherPlayer() {
//        if(getPlayerOnMove() == players[0]) {
//            this.playerOnMove = players[1];
//        } else {
//            this.playerOnMove = players[0];
//        }
//        System.out.println("Current Player: " + playerOnMove.getSymbol());
//    }
}
