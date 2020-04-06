package eli.practice.array;

public class ArrayLooping {

    public static void main(String[] args){

        int[] arrayOfIntegers = {1, 32, 23, 4, 15, 6, 17, 8, 9, 10, 3, 2, 1};

        printArray(arrayOfIntegers);

        System.out.println("The smallest number is " + getSmallestNumber(arrayOfIntegers));
        System.out.println("The largest number is " + getLargestNumber(arrayOfIntegers));
        System.out.println("The average number is " + getAverageValue(arrayOfIntegers));

    }




    /*
        TODO: Eli, write the actual code in the following 4 methods.
     */
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }
    }


    public static int getSmallestNumber(int[] array){
        int h = array[0];
        for(int i = 0; i < array.length; i ++ ){
            if(array[i] < h){h = array[i];}
        }

        return h;
    }


    public static int getLargestNumber(int[] array){
        int h = array[0];
        for(int i = 0; i < array.length; i ++ ){
            if(array[i] > h){h = array[i];}
        }
        return h;
    }


    public static double getAverageValue(int[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i ++){
            sum = sum + array[i];
        }



        return (sum / array.length);
    }


}
