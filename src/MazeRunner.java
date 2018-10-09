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

    }

    public static void navigatePit(String direction){

    }
}
