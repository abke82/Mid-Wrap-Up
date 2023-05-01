public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        if(n==0) return 1;
        long c=1;
        for(int i=1; i<=n; i++){
            c*=i;
        }
        return c;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        long sum=0 ,first=1,second=0;
        for (long i=0 ; i < n; i++){
            sum = first+second;
            first = second;
            second = sum;
        }
        return sum;
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        String out="";
        for(int i=word.length()-1; i>=0 ;i--){
            out+=word.charAt(i);
        }
        return out;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        String rev = "";
        boolean out = false;
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') newStr += str.charAt(i);
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') rev +=  str.charAt(i);
        }

        if (newStr.equals(rev)) {
            out = true;
        }
        return out;
    }

    /*
        implement a java function which computes the dot plot of 2 given
        string. dot plot of hello and ali is:
            h e l l o
        h   *
        e     *
        l       * *
        l       * *
        o           *
     *   lecture 4 page 26
     */
    char[][] makeEmptyArray(int dim1, int dim2) {
        char[][] arr = new char[dim1][dim2];
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                arr[i][j] = ' ';
            }
        }
        return arr;
    }
    public char[][] dotPlot(String str1, String str2) {
        char [][] out = makeEmptyArray(str1.length(),str2.length());

        for (int i =0;i<str1.length(); i++){
            for (int j =0;j<str2.length(); j++){
                if (str1.charAt(i)==str2.charAt(j)) out[i][j]= '*';
            }
        }
        return out;
    }
}
