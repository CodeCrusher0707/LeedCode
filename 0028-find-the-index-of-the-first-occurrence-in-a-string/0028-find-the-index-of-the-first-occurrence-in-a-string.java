class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();

        if (n2 == 0) return 0; 
        
        char c = needle.charAt(0);

        for (int i = 0; i <= n1 - n2; i++) {
            if (haystack.charAt(i) == c) {
                int j = 0;
                int a = i;

                while (j < n2) {
                    if (haystack.charAt(a) != needle.charAt(j)) {
                        break;
                    }
                    a++;
                    j++;
                }
                
                if (j == n2) {
                    return i;
                }
            }
        }
        
        return -1;
    }
}
