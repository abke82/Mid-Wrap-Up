import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String password ="";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            password += (char) (random.nextInt(26) + 'a');
        }
        return password;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {

        if(length<3)
        {
            throw new Exception();
        }

        String password ="";
        Random random = new Random();
        password += (char) (random.nextInt(26)+'a');
        password += (char) (random.nextInt(10)+'0');
        password += (char) (random.nextInt(15)+'!');

        for(int i =3 ; i< length ;i++)
        {
            int rand = random.nextInt(3);
            char c;
            if(rand == 0 ) c = (char) (random.nextInt(26) + 'a');
            else if (rand ==1) c = (char) (random.nextInt(10) + '0');
            else c= (char) (random.nextInt(15) + '!');

            password += c;
        }

        return password;
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int input) {

        long sum=0 , first=1 ,second=0;

        while(sum<=input)
        {
            sum = first+second;
            first = second;
            second = sum;
            if(sum + Long.bitCount(sum) == input)
                return true;
        }
        return false;
    }
}