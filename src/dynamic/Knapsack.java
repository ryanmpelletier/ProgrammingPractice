package dynamic;

public class Knapsack {


    /**
     * This is pretty crazy! Rather than trying every possible combination
     * in a brute force method, this does things in O(w * n) which is super fast!
     * It also requires O(w * n) space.
     *
     * The stacks question is just like this except that there are multiple "itemValues" arrays and each item weighs 1.
     * @param args
     */
    public static void main(String[] args){

        int weight = 7;

        int[] itemValues = {1, 4, 5, 7};
        int[] itemWeights = {1, 3, 4, 5};

        int[][] knapsacker = new int[itemValues.length][weight + 1];

        for(int i = 0; i < itemValues.length; i++){
            for(int j = 1; j <= weight; j++){
                if(itemWeights[i] > j){
                    knapsacker[i][j] = i > 0 ? knapsacker[i - 1][j] : 0;
                }else{
                    knapsacker[i][j] = i > 0 ? Math.max(itemValues[i] + knapsacker[i - 1][j - itemWeights[i]], knapsacker[i - 1][j]) : itemValues[i];
                }
            }
        }

        System.out.println("Max Value: " + knapsacker[knapsacker.length - 1][weight]);

        knapsacker = new int[itemValues.length][weight + 1];





    }

}
