package dynamic;

public class LongestCommonSubstring {

    public static void main(String[] args) {

        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int[][] mem = new int[s1.length()][s2.length()];

        System.out.println(longestCommonSubstring(s1, s2, s1.length() - 1, s2.length() - 1, mem));

    }

    //so this is a naive approach which uses recursion to solve the problem, however it doesn't take advantage of the fact that it can reuse computations
    public static int longestCommonSubstring(String a, String b, int m, int n, int mem[][]){
        if(m == -1 || n == -1){
            return 0;
        }
        if(a.charAt(m) == b.charAt(n)){
            //if not in memory (or it was already calculated and is 0, then make the calculation
            if(mem[m][n] == 0){
                mem[m][n] = longestCommonSubstring(a, b, m - 1, n - 1, mem);
            }

            return 1 + mem[m][n];
        }

        if(n - 1 == -1 || m - 1 == -1){
            return 0;
        }

        if(mem[m][n-1] == 0){
            mem[m][n - 1] = longestCommonSubstring(a, b, m, n - 1, mem);
        }

        if(mem[m-1][n] == 0){
            mem[m-1][n] = longestCommonSubstring(a, b, m - 1, n, mem);
        }

        return Math.max(mem[m][n-1],mem[m-1][n]);
    }
}
