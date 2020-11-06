class Solution {
    public String reverseOnlyLetters(String S) {
        String out="";
        int j=0;
        for (int i=S.length()-1;i>=0;i--) {
            while (j<S.length() && !Character.isLetter(S.charAt(j))) {
                out+=S.charAt(j);
                j++;
            }
            if (Character.isLetter(S.charAt(i)) && j<S.length() && Character.isLetter(S.charAt(j))) {
                out+=S.charAt(i);
                j++;
            }
        }
        if (j<S.length()) {
            while (j<S.length() && !Character.isLetter(S.charAt(j))) {
                out+=S.charAt(j);
                j++;
            }
        }
        return out;
    }
}
