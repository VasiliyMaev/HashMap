import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {

    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod" +
            " tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud" +
            " exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor " +
            "in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
            "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        char[] characterArray = TEXT.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "").toCharArray();

        Map<Character, Integer> mapChar = new HashMap<>();

        for (Character map : characterArray) {
            if (mapChar.containsKey(map)) {
                int value = mapChar.get(map);
                mapChar.put(map, value + 1);
            } else {
                int count = 1;
                mapChar.put(map, count);
            }
        }
        int maxValue = -1;
        int minValue = Integer.MAX_VALUE;

        Map.Entry<Character, Integer> maxResult = null;
        Map.Entry<Character, Integer> minResult = null;

        for (Map.Entry<Character, Integer> max : mapChar.entrySet()) {
            if (max.getValue() > maxValue) {
                maxResult = max;
                maxValue = max.getValue();
            }
        }
        for (Map.Entry<Character, Integer> min : mapChar.entrySet()) {
            if (min.getValue() < minValue) {
                minResult = min;
                minValue = min.getValue();
            }
        }


        System.out.println("×אשו גסודמ גסענוקאועסÿ: " + maxResult + "\nÐוזו גסודמ גסענוקאועסÿ: " + minResult);

    }
}

