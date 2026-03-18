class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int idx =0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        while(idx < first.length() && idx < last.length()) {
            if(first.charAt(idx) != last.charAt(idx))
                break;
            idx++;
        }
        return first.substring(0,idx);
    }
}