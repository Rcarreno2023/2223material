import java.util.Scanner;

public class GroceryListRev0 {

    public static void main(String[] args) {

        //String[] groceryList = {}; no no
        


        Scanner ui = new Scanner(System.in);
        int howMany=ui.nextInt();

        GroceryItemRev0[] groceryList = new GroceryItemRev0[howMany];


        
        for(int i=0;i<groceryList.length;i++){
            System.out.println("Name: ");
            String name=ui.nextLine();
            System.out.println("Cost: ");
            double cost=ui.nextDouble();
            groceryList[i]=new GroceryItemRev0(name, cost);
        }
        printArray(groceryList);
    }
    private static void printArray(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void printArray(GroceryItemRev0[] arr){
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
