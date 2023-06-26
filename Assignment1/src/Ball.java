
public class Ball {
    public static void ball(String ball, String m){ // in this method we investigate what ball will be on the newRow and
                                                    // newColumn locations, then according to the type of ball, we call
        switch (ball){                             //the function of that ball
            case "W" :
                wall(m);
                break;
            case "R":
                red();
                break;
            case "Y":
                yellow();
                break;
            case "B":
                black();
                break;
            case "H":
                hole();
                break;
            default:
                other(ball);
                break;
        }
    }
    // all the following methods are ball methods
    public static void wall(String m){
        switch (m){
            case "R":
                Move.newColumn-=2;
                if (Move.newColumn<0){
                    Move.newColumn+=Main.matrix.get(0).size();
                }
                // Move.newRow sabit
                // currentColumn da zaten * 'ın yeri o aynı.
                m="L";
                break;
            case "L":
                Move.newColumn=(Move.newColumn + 2) % Main.matrix.get(0).size();
                m="R";
            case "U":
                Move.newRow=(Move.newRow + 2) % Main.matrix.size();
                m="D";
            case "D":
                Move.newRow-=2;
                if (Move.newRow<0){
                    Move.newRow+=Main.matrix.size();
                }
                m="U";

        }
        ball(Main.matrix.get(Move.newRow).get(Move.newColumn),m);
    }
    public static void red(){
        Main.score+=10;
        Main.matrix.get(Main.currentRow).set(Main.currentColumn,"X");
        fixMethod();
    }
    public static void yellow(){
        Main.score+=5;
        Main.matrix.get(Main.currentRow).set(Main.currentColumn,"X");
        fixMethod();
    }
    public static void black(){
        Main.score-=5;
        Main.matrix.get(Main.currentRow).set(Main.currentColumn,"X");
        fixMethod();
    }
    public static void hole(){
        Main.game=false;
        Main.matrix.get(Main.currentRow).set(Main.currentColumn," ");
    }
    public static void other(String ball){
        Main.matrix.get(Main.currentRow).set(Main.currentColumn,ball);
        fixMethod();
    }
    public static void fixMethod(){   // this method is fix for all ball except "hole"
        Main.matrix.get(Move.newRow).set(Move.newColumn,"*");
        Main.currentRow = Move.newRow;
        Main.currentColumn = Move.newColumn;
    }


}

