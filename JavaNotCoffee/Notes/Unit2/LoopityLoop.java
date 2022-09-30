import java.util.Scanner;

public class LoopityLoop {
    public static void main(String[] args) {
            //while conditional statement
            //while (boolean expression == true)
            //while (true) {
            //    System.out.println("HI");
            //}
            //while loops are recursive conditional statments
                    //keeps happening UNTIL a condition is met
                // if(i==9){
                    //    System.out.println(i);
                // }
            //print out the number 1 through 10
            // int i=0;
            // while (i<10) {
            //     if (i==9){
            //         System.out.print(i);
            //     }
            //     else{
            //         System.out.println(i+",");
            //     }
            //     i++;
            // }
            

            // System.out.println();
            // //print 0-9
            // //for(some var;boolean expression;step)
            // for(int j=0;j<=9;j++){
            //     if (j==9){
            //         System.out.print(j);
            //     }
            //     else{
            //         System.out.println(j+",");
            //     }
            // }
            //for i in range(#):
            //for item in list:'
            minMaxChecker();
        }

        private static void minMaxChecker(){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            Scanner ui = new Scanner(System.in);
            System.out.println("Give me a numba ");
            int numba = ui.nextInt();

            while(numba!=-1){
                if(numba>max){
                    max=numba;
                }
                else if(numba<min){
                    min=numba;
                }

                System.out.println("Give me a numba ");
                numba = ui.nextInt(); 
            }
            System.out.println("min: "+min);
            System.out.println("max: "+max);
            System.out.printf("min: %d, max: %d",min,max);
            ui.close();
        }



    
}
