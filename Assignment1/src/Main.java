import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<ArrayList<String>> matrix = new ArrayList<>() ;  // matrix is board of game
    public static int currentRow;   // row location of "*"
    public static int currentColumn;   // column location of "*"
    public static int score;   // score of gamer
    public static boolean game = true;   // game variable indicates whether the game is over or not
    public static ArrayList<String> moveList;  // gamer's moves are in the moveList
    public static void main(String[] args) {
    // firstly solve the board
        int count=0;
        for (String i:fileRW.readFromFile(args[0])){
        // find the "*"
            if (i.contains("*")) { // normally data type of * is char but in this method we are asked to use charSequence data type.
                Main.currentRow= count ;
                Main.currentColumn=i.indexOf("*")-(i.indexOf("*")) / 2; // indexOf gives us double amount of index of * because of it counts also space characters
            }
            count++;
            // solve the board
            ArrayList<String> tempArrayList =new ArrayList<>(Arrays.asList(i.split(" "))) ;
            Main.matrix.add(tempArrayList);
        }
        fileRW.finalOutput(1,Main.matrix,0); // number "1" is telling to the finalOutput method that you will print the first part of the output.
    //  then solve the moves
        moveList = new ArrayList<>(Arrays.asList((String.join(" ",fileRW.readFromFile(args[1]))).split(" ")));

        // this is where the game is played
        int indexOfMovement = 0;
        for(String m : moveList){
            if (game){
                Move.move(m);
            }
            else{
                break;
            }
        indexOfMovement +=1;
        }
        fileRW.finalOutput(2,Main.matrix,indexOfMovement); // number "2" is telling to the finalOutput method that you will print the second part of the output.
        }
    }
