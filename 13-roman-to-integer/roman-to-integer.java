class Solution {
    public int romanToInt(String s) {
        int previous = 0;
        int current = 0;
         int result =0;
         Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

         for(int i = s.length()-1; i>=0; i--) {
            current = map.get(s.charAt(i));
            if(current < previous) result -= current;
            else result += current;
            previous = current;
         }
         return result;
    }
}