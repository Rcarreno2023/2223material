public class Condish {
    public static void main(String[] args) {
        //Conditioal statements - booleans
        //boolean = T or F
        //boolean operatorsm = and , or
        //python: True False => true false Capital letters typically mean a class
        /*
            if (boolean expression){
                do statement
            }
            else if (boolean espression){
                do statemrn
            }
         */



        int a = 4;
        int b = 4;
        int c =4;
         if(a==b){
            System.out.println("They're the same");
         }
         else if(a == b && b == c){
            System.out.println("a is equal to c");
         }
         else if(a==b || b==c){
            System.out.println("Either a is equal to b or b is equal to c");
         }
         else if(a!=b){
            System.out.println("a is NOT = to b");
         }
         else{
            System.out.println("nothing is = to each other");
         }

         String name = "bob";
         String name1 = "bob";

         if(name=name1){
            System.out.println("They're the same ");
         }
         else{
            System.out.println("They're not the same");
         }
    }
}
