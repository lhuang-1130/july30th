public class ReverseString {
    public String reverseWords(String s) {

        String noSpace = s;
        /*remove leading/ending spaces
        replace extra spaces with one space*/
        noSpace = s.trim().replaceAll(" +", " ");
        //split the string and store in array
        String[] array = noSpace.split(" ");

        for (int i = 0; i < array.length / 2; i++) {
            //store string in temp
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            //swap
            array[array.length - 1 - i] = temp;
        }

        //add to String reversed
        String reversed = "";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) //if have not reached to the end, append to reversed with a space
                reversed = reversed + array[i] + " ";
            else //if reached, append with no space
                reversed = reversed + array[i];
        }
        return reversed;
    }
}
