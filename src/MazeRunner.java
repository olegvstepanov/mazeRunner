import java.util.*;

public class MazeRunner {
    static Maze myMap = new Maze();
    static Maze Solution = new Maze();

    public static void main(String[] args){
        intro();
        int moves = 0;
        while((moves<100)&&(!myMap.didIWin())){
            String move = userMove();
            userMover(move);
            moves++;
            movesMessage(moves);
        }
        if (myMap.didIWin()){
            System.out.println("Great, you have found your way through the maze in " + moves + " moves!");
        } else {
            System.out.println("Sorry, you did not make it through the maze");
        }

    }

    public static void intro(){
        Solution.printSolution();
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
        System.out.println("----------------------------------------");
    }

    public static String userMove(){
        Scanner moveInput = new Scanner(System.in);
        System.out.println("Where would you like to move? (R, L, U, D)");
        String move = moveInput.next().toUpperCase();
        if(move.equals("R") || move.equals("L") || move.equals("U") || move.equals("D")){
            return move;
        } else {
            return userMove();
        }
    }

    public static void userMover(String move){

        if(!myMap.isThereAPit(move)) {

            if (myMap.canIMoveRight() && move.equals("R")) {
                myMap.moveRight();
                myMap.printMap();
                System.out.println("----------------------------------------");
            }
            else if (myMap.canIMoveLeft() && move.equals("L")) {
                myMap.moveLeft();
                myMap.printMap();
                System.out.println("----------------------------------------");
            }
            else if (myMap.canIMoveUp() && move.equals("U")) {
                myMap.moveUp();
                myMap.printMap();
                System.out.println("----------------------------------------");
            }
            else if (myMap.canIMoveDown() && move.equals("D")) {
                myMap.moveDown();
                myMap.printMap();
                System.out.println("----------------------------------------");
            }
            else {
                myMap.printMap();
                System.out.println("Sorry you've hit the wall");
                System.out.println("----------------------------------------");
            }
        }
        else{
            navigatePit(move);
        }
    }

    public static void movesMessage(int moves){

        if(moves == 50){
            System.out.println("Warning, you have 50 moves to complete the maze");
        }
        if(moves == 75){
            System.out.println("Warning, you have made 75 moves, only 25 moves left");
        }
        if(moves == 90){
            System.out.println("Warning, you have made 90 moves, only 10 moves left");
        }
        if(moves == 100){
            System.out.println("Oh no !!! you have no more moves left and now the maze is closed");
        }

    }

    public static void navigatePit(String move){

        Scanner Input = new Scanner(System.in);
        System.out.println("Look, there is a pit ahead, dod you want to jump over it?");
        String choice = Input.next().toLowerCase();
        if (choice.charAt(0) == 'y'){
            myMap.jumpOverPit(move);
            myMap.printMap();
            System.out.println("----------------------------------------");
        } else {
            userMover(userMove());
        }

    }
}
