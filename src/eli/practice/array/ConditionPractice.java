package eli.practice.array;

public class ConditionPractice {

    public static void main(String[] args){

        //here is a different way to create arrays that you probably haven't seen yet
        //here we are saying, initialize a new array of length 10
        int[] numbers = new int[10];

        //and here we set the values
        numbers[0] = 3;
        numbers[1] = 4;
        numbers[2] = 5;
        numbers[3] = 15;
        numbers[6] = 0;
        numbers[7] = 20;
        numbers[8] = 36;
        numbers[9] = 40;


        System.out.println("The sum of all numbers divisible by 3 is " + addTogetherAllNumbersDivisibleBy3(numbers));
        System.out.println("The sum of all numbers divisible by 5 is " + addTogetherAllNumbersDivisibleBy5(numbers));
        printNumbers(numbers);


    }

    /*
        There is an operator called modulus. It gives you the remainder after dividing by a certain number.
        It is helpful to find out if a number is divisible by another number. It looks like this -> %.


        Examples:

            5 % 2 is 1
            3 % 1 is 0
            4 % 2 is 0
            16 % 3 is 1

        So if an number is divisible by another number, you can check like this...

        int someNumber = 5;

        if(someNumber % 2 == 0){
            //this code executes if the someNumber variable is divisible by 2
        }

     */



    public static int addTogetherAllNumbersDivisibleBy3(int[] array){

        return -1;
    }

    public static int addTogetherAllNumbersDivisibleBy5(int[] array){
        return -1;
    }


    /*
        For each number in the array, do only ONE of the following.

        If a number is divisible by 2, print out "This number is divisible by 2"
        If a number is divisible by 3 print out "This number is divisible by 3"
        If a number is divisible by both 2 and 3, print out "This number is divisible by 2 and 3.
     */
    public static void printNumbers(int[] array){

    }

}
