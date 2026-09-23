class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != s.length()) return false;

        char[] sh = s.toCharArray();
        char[] th = t.toCharArray();

        Arrays.sort(sh);
        Arrays.sort(th);

        return Arrays.equals(sh,th);





    }
}
