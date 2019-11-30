package dynamic;


/**
 * A child is walking up n steps and can take either 1, 2, or 3 steps.
 * How mahy ways can the child walk up the steps.
 */
public class NumberOfWaysToWalkUpSteps {
    public static void main(String[] args){

        System.out.println(numberOfWays(10));

    }


    public static int numberOfWays(int n){
        int[] numberOfWays = new int[n];

        if(n < 3){
            return n;
        }
        numberOfWays[0] = 1;
        numberOfWays[1] = 2;
        numberOfWays[2] = 4;

        for(int i = 3; i < n; i++){
            numberOfWays[i] = numberOfWays[i - 1] + numberOfWays[i - 2] + numberOfWays[i - 3];
        }
        return numberOfWays[n - 1];
    }

}


