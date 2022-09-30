import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;


public class StringLoops{
    public static void main(String[] args) {
        
        howMany("Pneumonoultramicroscopicsilicovolcanoconiosis","o");


        spaceReplacer("THis sentence.  has.  double spaces.  !");

        removeVowels("bananay");

        passwordCrack("123456")
    
    }

    private static void howMany(String s,String v){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.toUpperCase().substring(i,i+1).equals(v.toUpperCase())){
                count++;
            }
        }

        System.out.println(count);
    }

    private static void spaceReplacer(String s){
        System.out.println(s.replace("  ", " "));
    }

    private static void removeVowels(String s){
        //aeiou and sometimes y
        //make sure that sometimes or 50% of the time, it removes y
        String one = s.replace("a","");
        one = one.replace("e","");
        one = one.replace("i","");
        one = one.replace("o","");
        one = one.replace("u","");
        double test = Math.random();
        if(test<=.5){
            one = one.replace("y","");
        }
        System.out.println(one);
    }

    private static void passwordCrack(String p){
        String guess="";
        int count=0
        while(!guess.equals(p)){
            count++;
            guess+=String.valueOf(count);
        }
        
        System.out.println("Found it!");
        System.out.println(count);
    
    }






}