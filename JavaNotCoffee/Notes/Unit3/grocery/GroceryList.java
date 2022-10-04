import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {

        //String[] groceryList = {}; no no
        


        Scanner ui = new Scanner(System.in);
        int howMany=ui.nextInt();

        String[] groceryList = new String[howMany];


        printArray(groceryList);
        for(int i=0;i<groceryList.length;i++){
            System.out.println("Add an item: ");
            groceryList[i]=ui.next();
        }
        printArray(groceryList);
    }
    private static void printArray(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void printHorizontalArray(int[] arr){
        String out = "";
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
            out+=arr[1];
            out+=",";
        }
    
        else{
            out+="";
            

        }
        System.out.println(out);
    }
}


}
