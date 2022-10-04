public class ArrayNotes {

    public static void main(String[] args) {
        
        //Array -> list... A sequence of data that is not mutable -> doesnt change
        

        //datatype[] nameOfArray = {the data};
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        double[] decimalNumbers = {0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9};

        System.out.println(numbers);
        System.out.println(numbers[0]);
        System.out.print(numbers[1]+4);
        numbers[1]=numbers[1]+4;
        //System.out.println(numbers)
        printArray(numbers);
        int[] numberslonger = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(numberslonger);
    }
        private static void printArray(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }


        private static void printHorizontalArray(int[] arr){
            String out = ";";
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




        private static void printArray(double[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }


}