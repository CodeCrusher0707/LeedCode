import java.util.HashMap;

class Solution {
    public String intToRoman(int num) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        String[] order = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        
        for (String symbol : order) {
            int value = map.get(symbol);
            while (num >= value) {
                result.append(symbol);
                num -= value;
            }
        }
        
        return result.toString();
    }
}