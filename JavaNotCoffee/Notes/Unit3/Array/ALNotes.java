import java.util.ArrayList;
import java.util.Scanner;


public class ALNotes{
    public static void main(String[] args) {
    /*    
        // //ArrayList newList1 = new ArrayList<>();
        // ArrayList<String> names = new ArrayList<String>();
        // ArrayList<Integer> numbers = new ArrayList<Integer>();

        // //add
        // names.add("Adam");
        // names.add("Caden");
        // names.add("Nate");
        // names.add("Landon");
        
        // //insert

        // names.add(2, "Romen");


        // //remove

        // names.remove("Caden");

        // //clear
        
        // //size or length

        // //System.out.println(names.size());

        // //get
        // //System.out.println(names.get(2));
        

        // //System.out.println(names);




        // names.clear();
        // //System.out.println(names);
        */ 
        additionCalculator();

    }

    public static void additionCalculator(){
        Scanner ui = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();

        double newNumber = ui.nextDouble();
        while(newNumber!=0){
            numbers.add(newNumber);
            newNumber=ui.nextDouble();

        }

        double total= 0.00;
        for(int i =0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
            total+=(numbers.get(i));
        }
        System.out.printf("Your total is: %f\n",total);
        ui.close();
    }



}