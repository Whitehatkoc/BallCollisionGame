import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class fileRW {
    public static String[] readFromFile(String path) {
        try {
            int i = 0;
            int length = Files.readAllLines(Paths.get(path)).size();
            String[] results = new String[length];
            for (String line : Files.readAllLines(Paths.get(path))) {
                results[i++] = line;
            }
            return results;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void writeToFile(String path, String content, boolean append, boolean newLine) {
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream(path, append));
            ps.print(content + (newLine ? "\n" : ""));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) { //Flushes all the content and closes the stream if it has been successfully created.
                ps.flush();
                ps.close();
            }
        }
    }
    public static void finalOutput(int i, ArrayList<ArrayList<String>> matrix,int index){
        if ( i == 1 ){
            writeToFile("output.txt","Game board :",true,true );
            for(ArrayList<String> x:matrix){
                for(String y:x){
                    writeToFile("output.txt",y+" ",true,false);
                }
                writeToFile("output.txt"," ",true,true);
            }
        }
        else{
            writeToFile("output.txt"," ",true,true);
            writeToFile("output.txt","Your movement is :",true,true);
            List<String> moveList2= Main.moveList.subList(0,index);
            for(String z : moveList2){
                writeToFile("output.txt",z+" ",true,false);
            }
            writeToFile("output.txt"," ",true,true);
            writeToFile("output.txt"," ",true,true);
            writeToFile("output.txt","Your output is :",true,true);
            for(ArrayList<String> x:matrix){
                for(String y:x){
                    writeToFile("output.txt",y+" ",true,false);
                }
                writeToFile("output.txt"," ",true,true);
            }
            writeToFile("output.txt"," ",true,true);
            writeToFile("output.txt","Game Over !",true,true);
            writeToFile("output.txt","Score: "+ Main.score,true,true);
        }
    }
}
