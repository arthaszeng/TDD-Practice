import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        for (String aChar : characters) {
            aChar = isVowel(aChar) ? MOMMY : aChar;
            stringBuilder.append(aChar);
        }

        return stringBuilder.toString();
    }

    private boolean isVowel(String aChar) {
        return ARRAY_LIST.contains(aChar);
    }
}
