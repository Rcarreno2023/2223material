import java.util.ArrayList;
import java.util.Scanner;

public class Inventory{
    public static void main(String[] args) {
        ArrayList<String> iceCreamList = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String input="";
        while(!input.equals("q")){
            System.out.println(iceCreamList);
            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear or (q)uit?");
            input = in.nextLine();

            int pos=0;
            if(input.equals("a")){
                System.out.println("What Flavor? ");
                input = in.nextLine();
                iceCreamList.add(input);
            }
            else if(input.equals("i")){
                System.out.println("What Flavor? ");
                input = in.nextLine();
                System.out.println("Where? ");
                pos = in.nextLine();
                if(pos>0 && pos<iceCreamList.size()){
                    iceCreamList.add(pos-1, input);
                }
            }
            else if(input.equals("r")){
                System.out.println("Where? ");
                numinput = in.nextLine();
                iceCreamList.remove(numinput);
            }
            else if(input.equals("p")){
                System.out.println("What Flavor? ");
                input = in.nextLine();
                System.out.println("Where? ");
                pos = in.nextLine();
                if(pos>0 && pos<iceCreamList.size()){
                    iceCreamList.set(pos-1, input);
                }
            }
            else if(input.equals("c")){
                System.out.println("Are you sure? ");
                input = in.nextLine();
                if (input.equals("yes")){
                    iceCreamList.clear();
                }
            }


        }
    }
}