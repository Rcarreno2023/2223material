import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

public class BufferWriter{

    private static final String DATA_FILE = "mymedia.txt";
    private static Scanner in;
    private static BufferedWriter out;

    public static void writeString(String s) {


        if(out==null){
            try{
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            catch(Exception e){
                System.err.println("NO cant open file");
                e.printStackTrace();
            }
        }
            try{
                out.write(s);
                out.newLine();
            }
            catch(Exception e){
                System.err.println("NO cant write file");
                e.printStackTrace();
            }
            
        

    }

    public static void saveAndClose(){
        if(in!=null){
            try{
                in.close();
                in=null;
            }
            catch(Exception e){
                System.err.println("Cant close input file!!!!");
                e.printStackTrace();
            }
        }
        if(out!=null){
            try{
                out.close();
                out=null;
            }
            catch(Exception e){
                System.err.println("Cant close output file!!!!");
                e.printStackTrace();
            }
        }
    }

    public static String readString(){
        if(in==null){
            try {
                in = new Scanner(new File(DATA_FILE));
            } catch (Exception e) {
                System.err.println("Cant open file for input!!!!");
                e.printStackTrace();
            }
        }
        try {
            if(in.hasNext()){
                String s = in.nextLine();
                return s;
            }
            else{
                return null;
            }
        } catch (Exception e) {
            System.err.println("Cant read the file!!!!");
            e.printStackTrace();
        }


        return null;
    }

}