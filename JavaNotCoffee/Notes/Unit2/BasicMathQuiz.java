import java.util.Scanner;


import java.util.Random;
import java.lang.Math;


public class BasicMathQuiz {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        Random rand = new Random();
        int points=0;

        double answer=0.0;
        double input=0.0;
        int l = 0;
        int questions = 0;
        double percentage = 0.0;
        int score = 0;

        while(percentage<80 || questions<10){
           
            int num1= (int)(Math.random()*100);
            int num2= rand.nextInt(100)+1;
            int signNumber=rand.nextInt(4);
                if (signNumber==0) {
                    System.out.printf("What is %d / %d? ",num1,num2);
                    answer = Math.round((double)num1/num2*100.0)/100.0;     
                }
                else if(signNumber==1){
                    System.out.printf("What is %d * %d? ",num1,num2);
                    answer = (int)num1*num2;
                }
                else if(signNumber==2){
                    System.out.printf("What is %d + %d? ",num1,num2);
                    answer = (int)num1+num2;
                }
                else{
                    System.out.printf("What is %d - %d? ",num1,num2);
                    answer = (int)num1-num2;
                }
                input = ui.nextDouble();
                if (input==answer){
                    System.out.println("GOOD JOB! Youre smarter then a middle schooler! " );
                    score++;
                }
                else{
                    System.out.printf("Be better, the answer was %f ",answer );
                }
                questions++;
                percentage = (int)((score/questions)*100);
                
                if (questions>=10){
                    System.out.println("You got "+percentage+" out of "+questions);
                }
                
        }
        
    }
}
