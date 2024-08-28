package String;

public class Integer_to_Roman {
    public String intToRoman(int num) {
        String str_romans[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String result = "";

        for (int i = 0; i < 13; ++i) {
            while (num - values[i] >= 0) {
                result += str_romans[i];
                num -= values[i];
            }
        }

        return result;
    }
}
