class WordExample {
    private String strdata;

    // Parameterized constructor
    public WordExample(String str) {
        if (str.endsWith(".") || str.endsWith("?") || str.endsWith("!")) {
            this.strdata = str.trim();
        } else {
            throw new IllegalArgumentException("Sentence must end with '.', '?' or '!' only.");
        }
    }

    // Method to count words beginning and ending with a vowel
    public void countWord() {
        String[] words = strdata.split("\s+");
        int count = 0;
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i].replaceAll("[.?!]", ""); // Remove punctuation if any
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                count++;
            }
        }
        System.out.println("Number of words beginning and ending with a vowel: " + count);
    }

    // Method to rearrange words without using data structures
    public void placeWord() {
        String[] words = strdata.split("\s+");
        String newSentence = "";
        String remainingWords = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i].replaceAll("[.?!]", ""); // Remove punctuation
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                newSentence += word + " ";
            } else {
                remainingWords += word + " ";
            }
        }
        
        newSentence += remainingWords.trim() + strdata.charAt(strdata.length() - 1);
        System.out.println("Rearranged sentence: " + newSentence);
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        WordExample obj = new WordExample("APPLE IS AN ORANGE UMBRELLA ?");
        obj.countWord();
        obj.placeWord(); 
    }
}

