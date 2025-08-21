class Solution {
    /*
        Technique: Two Pointers
    
        1. Initialize twop pointers at the start of each string.
        2. Move ptr in haystack while checking if it matches character in needle staring.
        3. If matches record the start of position and move both the pointers while checking for      
        equality. If entire string matches stop the loop anbd return start position.
        4. If there is mismatch move back needle pointer to beginning position and move haystack ptr 
        forward.
    
        TC: O(N)    SC: O(1)
    */

    public int strStr(String haystack, String needle) {
        int haystack_length = haystack.length(), needle_length = needle.length();
        int haystack_ptr = 0, needle_ptr = 0, start = -1;

        while (haystack_ptr < haystack_length) {
            // Check if the current character matches in both staring
            if (haystack.charAt(haystack_ptr) == needle.charAt(needle_ptr)) {
                start = haystack_ptr;
                int temp = haystack_ptr;
                while (temp < haystack_length && needle_ptr < needle_length) {
                    if (haystack.charAt(temp) == needle.charAt(needle_ptr)) {
                        temp++;
                        needle_ptr++;
                    } else {
                        needle_ptr = 0;
                        break;
                    }
                }
                if (needle_ptr == needle_length) {
                    break;
                } else {
                    start = -1;
                    needle_ptr = 0;
                }

            }
            haystack_ptr++;
        }

        return start;
    }
}