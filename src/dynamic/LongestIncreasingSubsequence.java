package dynamic;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};

        int[] table = new int[arr.length];
        int maxSequenceLength = 1;
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                table[i] = 1;
            }else{
                int j = i - 1;
                int max = 1;
                while(j >= 0){
                    if(arr[j] < arr[i]){
                        max = Math.max(table[j] + 1, max);
                    }
                    j--;
                }
                table[i] = max;
                maxSequenceLength = Math.max(max, maxSequenceLength);
            }
        }

        System.out.println("Max length of increasing subsequence is " + maxSequenceLength);

    }

}
