class Solution {
    public String reverseOnlyLetters(String S) {
        String out="";
        int j=0;
        int count=0;
        for (int i=S.length()-1;i>=0;i--) {
            if (j<=S.length()-1-i) j=S.length()-1-i;
            //else j+=count;
            while (!Character.isLetter(S.charAt(j))) {
                System.out.println("i="+i);
                System.out.println("j="+j+"; "+S.charAt(j));
                out+=S.charAt(j);
                System.out.println("j="+j+"; "+out);
                j++;
            }
            //System.out.println("j="+j+"; "+S.charAt(j));
            if (Character.isLetter(S.charAt(i))) {
                out+=S.charAt(i);
                count++;
            }
        }
        return out;
    }
}
