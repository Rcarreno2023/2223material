/* 
    Main Class that you are using
        public = public so the JVM can access the file
        class = define that the following code is in a class
        ClassName = MUST FOLLOW: First letter capitalized
                            AND  Same name as the file name
                            AND  Number are at the end of the file
*/

public class HelloWorld {
    //If this is where the program starts, you need the following method
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.print("this is a lie");

        System.out.println(12345.6789);
        System.out.printf("%2.2f%n",12345.6789);
        System.out.printf("%5.2f%n",12345.6789);
        System.out.printf("%10.2f%n",12345.6789);

    }
}

/*
 Delete entire line -> shift+del
 Delete entire word -> ctrl+del
 Highlight word -> ctrl+shift+arrowkey

 */