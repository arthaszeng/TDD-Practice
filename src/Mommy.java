import java.util.ArrayList;

class Mommy {
    private static final ArrayList ARRAY_LIST = new ArrayList<String>() {
        {
            add("A");
            add("E");
            add("I");
            add("O");
            add("U");
        }
    };
    private static final String MOMMY = "mommy";

    String getResult(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        String characters[] = word.split("");
        Boolean lastCharIsVowel = false;
        Boolean thisCharIsVowel;

        for (String aChar : characters) {
            thisCharIsVowel = isVowel(aChar);
            Boolean lastCharIsVowelBuffer = lastCharIsVowel;
            lastCharIsVowel = thisCharIsVowel;

            if (lastCharIsVowelBuffer && thisCharIsVowel) {
                continue;
            } else if (thisCharIsVowel){
                stringBuilder.append(MOMMY);
            } else {
                stringBuilder.append(aChar);
            }

        }
        return stringBuilder.toString();
    }

    private boolean isVowel(String aChar) {
        return ARRAY_LIST.contains(aChar.toUpperCase());
    }

}
