import java.lang.Math;
import java.util.Random;
import java.util.random;


public class JavaMath{
    public static void main(String[] args) {
        // System.out.println(18/3);
        // System.out.println(18.0/3);

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Double.MAX_VALUE);
        // System.out.println(Long.MAX_VALUE);

        // // System.out.println("18"+5);
        // System.out.println(Math.pow(18, 5));


        // System.out.println((6*(2/1)/1));
        // System.out.println(Math.pow(2, 3)/(7/7/8));

        // System.out.println(255%256);


        int age=17;
        // double age=17;

        // double years=12.5;
        // Double year=12.5;

        // Integer ages=17;

        // age++;
        // age+=5;

        // age--;
        // age-=5;

        // age/=5;
        // age*=5;
        // System.out.println("age at the end: "+age);

        double randomness = Math.random();
        System.out.println(randomness);

        System.out.println(randomness*10);

        System.out.println((int) (randomness*10));

        System.out.println((int) (randomness*(56-42))+42);

        Random rand = new Random();
        
        int randomInt = rand.nextInt(10);
        System.out.println(randomInt);
        double randomDouble = rand.nextDouble();
        System.out.println(randomDouble);
    }
}