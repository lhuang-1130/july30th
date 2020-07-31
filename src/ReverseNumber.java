public class ReverseNumber {

    public int reverse(int x){
        //int reverse = 0 (some inputs are too large for int)
        long reverse = 0;
        //flag
        boolean negative = false;

        if(x<0) {
            negative = true;
            x *= -1;
        }

        while(x>0){
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }

        //if the output is larger than the max int value or less than the min int value
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
            // out of bound
        }
        //casting
        if(negative == true) {
            return (int)reverse*-1;
        }
        return (int)reverse;
    }
}
