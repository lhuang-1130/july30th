public class Max {
    public static void MaxChar(String input) {

        char maxChar = input.charAt(0);

        char charArray[] = input.trim().replaceAll("\\s+", "").toCharArray();
        int[] freq = new int[charArray.length];

        int i;
        int j;

        for (i = 0; i < charArray.length; i++) {
            freq[i] = 1;
            for (j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && charArray[i] != ' ' && charArray[i] != '0') {
                    freq[i]++;
                    charArray[j] = '0';
                }
            }
        }

        int max = freq[0];
        for (i = 0; i < freq.length; i++) {
            if (max < freq[i]) {
                max = freq[i];
                maxChar = charArray[i];
            }
        }
        System.out.println("character: " + maxChar);
        System.out.println("count: " + max);
    }
}
