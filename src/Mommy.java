import java.util.Arrays;

public class Mommy {


    public String getResult(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        String characters[] = word.split("");
        for (String aChar : characters) {

            if (aChar.toUpperCase().equals("H")) {
            } else if (aChar.toUpperCase().equals("A")) {
                aChar = "mommy";
            } else if (aChar.toUpperCase().equals("E")){
                aChar = "mommy";
            }

            stringBuilder.append(aChar);
        }

        return stringBuilder.toString();
    }
}
