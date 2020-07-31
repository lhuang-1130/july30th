public class Max {
    public static void MaxChar(String input) {
         
         char maxChar = input.charAt(0);
         char secChar = input.charAt(0);


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
        int secMax = freq[0];
        int k = 0;

        for (i = 0; i < freq.length; i++) {
            if (max < freq[i]) {
                max = freq[i];
                maxChar = charArray[i];
            }
            for ( k = 0; k < freq.length; k++) {
                if (freq[k] > max ) {
                    secMax = max;
                    secMax = freq[secMax];
                    secChar = charArray[secMax];
                } else if (freq[k] > freq[secMax] && freq[k] < max && freq[k] != max){
                    secMax = freq[k];
                    secChar = charArray[k];
                }
            }
        }

        System.out.println("max character: " + maxChar);
        System.out.println("max count: " + max);

        System.out.println("second max character: " + secChar);
        System.out.println("second max count: " + secMax);
    }
}
