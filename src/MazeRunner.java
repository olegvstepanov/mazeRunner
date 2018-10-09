import java.util.*;

public class MazeRunner {
    static Maze myMap = new Maze();

    public static void main(String[] args){
        intro();
    }

    public static void intro(){
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

    public static String userMover(String move){

        if (myMap.canIMoveRight()&&move.equals("R")){
            myMap.moveRight();
        }

        if (myMap.canIMoveLeft()&&move.equals("L")){
            myMap.moveRight();
        }

        if (myMap.canIMoveUp()&&move.equals("U")){
            myMap.moveRight();
        }

        if (myMap.canIMoveDown()&&move.equals("D")){
            myMap.moveRight();
        }
        return "";
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

    public static void navigatePit(String direction){

    }
}
