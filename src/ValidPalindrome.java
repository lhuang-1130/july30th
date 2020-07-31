public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String addChar = "";
        //covert to character array
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                addChar += c;
            }
        }

        //covert all character to the same case
        addChar = addChar.toLowerCase();

        int indexLeft = 0;
        int indexRight = addChar.length() - 1;

        //if indexLeft does not pass indexRight
        while (indexLeft <= indexRight) {
            //check if two chars are the same from both sides
            if (addChar.charAt(indexLeft) != addChar.charAt(indexRight)) {
                return false;
            } else {
                //continue matching in the loop
                indexLeft++;
                indexRight--;
            }
        }
        return true;
    }
}
