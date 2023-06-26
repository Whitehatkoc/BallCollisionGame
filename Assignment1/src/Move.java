public class Move {
    public static int newRow;  // newRow is the row location of where the ball is requested to go
    public static int newColumn;   // new Column is the column location of where the ball is requested to go
    public static void move(String m){  // in this method we investigate what is the move that gamer played and what
        String ball = null;            // will be the newRow and newColumn value as a result of this movement
        switch (m){
            case "R":
                if (Main.currentColumn == Main.matrix.get(0).size()-1){
                    ball = Main.matrix.get(Main.currentRow).get(0);
                    newRow=Main.currentRow;
                    newColumn=0;    }

                else {
                    ball = Main.matrix.get(Main.currentRow).get((Main.currentColumn + 1));
                    newRow=Main.currentRow;
                    newColumn=Main.currentColumn + 1;   }
                break;
            case "L":
                if (Main.currentColumn == 0){
                    ball = Main.matrix.get(Main.currentRow).get(Main.matrix.get(0).size()-1);
                    newRow=Main.currentRow;
                    newColumn=Main.matrix.get(0).size()-1;  }
                else {

                    ball = Main.matrix.get(Main.currentRow).get((Main.currentColumn - 1));
                    newRow=Main.currentRow;
                    newColumn=Main.currentColumn - 1;   }
                break;
            case "U":
                if (Main.currentRow == 0){
                    ball = Main.matrix.get(Main.matrix.size()-1).get(Main.currentColumn);
                    newRow=Main.matrix.size()-1;
                    newColumn=Main.currentColumn;   }
                else{
                    ball = Main.matrix.get(Main.currentRow - 1).get(Main.currentColumn);
                    newRow=Main.currentRow-1;
                    newColumn=Main.currentColumn;   }
                break;
            case "D":
                if (Main.currentRow == Main.matrix.size()-1){
                    ball = Main.matrix.get(0).get(Main.currentColumn);
                    newRow=0;
                    newColumn=Main.currentColumn;   }
                else{
                    ball = Main.matrix.get(Main.currentRow + 1).get(Main.currentColumn);
                    newRow=Main.currentRow + 1;
                    newColumn=Main.currentColumn;   }
                break;
        }
        Ball.ball(ball,m);  //  most of the work is done in this Ball class
    }
}

