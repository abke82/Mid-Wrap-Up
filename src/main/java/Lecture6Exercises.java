import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {

        long sum = 0;

        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {

        int[] out = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            out[j] = arr[i];
            j++;
        }
        return out;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {

        int m = m1.length, n = m1[0].length, k = m2.length, p = m2[0].length;

        if (n != k) throw new RuntimeException();

        double[][] m3 = new double[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                double sum = 0;
                for (int l = 0; l < n; l++) {
                    sum += m1[i][l] * m2[l][j];
                }
                m3[i][j] = sum;
            }
        }

        return m3;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {

        List out = new ArrayList();
        for (int i = 0; i < names.length; i++) {
            List temp = new ArrayList();
            for (int j = 0; j < names[i].length; j++) {
                temp.add(names[i][j]);
            }
            out.add(temp);
        }

        return out;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {

        List out = new ArrayList();
        for (int i = 2; n > 1; i++) {
            if (n % i == 0) {
                out.add(i);
                while (n % i == 0) n /= i;
            }
        }

        return out;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {

        List out = new ArrayList();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) out.add(matcher.group());

        return out;
    }
}