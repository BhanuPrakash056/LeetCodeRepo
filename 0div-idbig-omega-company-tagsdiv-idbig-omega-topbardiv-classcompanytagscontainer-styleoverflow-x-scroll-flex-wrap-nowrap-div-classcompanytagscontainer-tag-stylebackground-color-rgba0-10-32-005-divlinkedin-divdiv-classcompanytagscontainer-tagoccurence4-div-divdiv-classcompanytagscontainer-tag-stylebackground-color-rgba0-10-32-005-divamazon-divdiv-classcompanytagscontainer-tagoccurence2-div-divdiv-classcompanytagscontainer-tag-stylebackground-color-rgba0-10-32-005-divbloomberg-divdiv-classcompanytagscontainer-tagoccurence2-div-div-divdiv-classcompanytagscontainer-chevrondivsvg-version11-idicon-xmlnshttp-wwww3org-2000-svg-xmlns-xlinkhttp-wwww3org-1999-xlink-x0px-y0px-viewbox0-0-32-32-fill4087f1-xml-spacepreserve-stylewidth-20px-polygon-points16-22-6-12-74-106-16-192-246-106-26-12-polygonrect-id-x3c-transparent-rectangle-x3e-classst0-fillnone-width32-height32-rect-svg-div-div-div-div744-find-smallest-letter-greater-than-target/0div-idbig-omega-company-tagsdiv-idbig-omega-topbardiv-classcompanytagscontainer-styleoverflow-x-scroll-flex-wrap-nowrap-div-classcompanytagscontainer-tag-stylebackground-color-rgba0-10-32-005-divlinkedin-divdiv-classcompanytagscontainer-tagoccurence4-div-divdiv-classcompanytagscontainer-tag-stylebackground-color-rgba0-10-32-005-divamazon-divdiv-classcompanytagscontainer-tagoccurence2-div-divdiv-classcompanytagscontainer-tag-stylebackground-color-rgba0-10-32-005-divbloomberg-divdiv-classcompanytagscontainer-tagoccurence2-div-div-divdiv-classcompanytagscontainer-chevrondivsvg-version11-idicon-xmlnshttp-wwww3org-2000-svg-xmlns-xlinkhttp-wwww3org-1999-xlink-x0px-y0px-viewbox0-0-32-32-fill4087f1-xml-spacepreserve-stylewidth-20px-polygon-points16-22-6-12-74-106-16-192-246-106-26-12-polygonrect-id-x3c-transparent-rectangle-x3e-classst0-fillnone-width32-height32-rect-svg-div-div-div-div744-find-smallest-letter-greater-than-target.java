class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length-1;
        char res = ' ';
        while(low<=high){
            int mid = low + (high-low)/2;
            if(letters[mid]==target){
                low = low + 1;
            }
            else if(letters[mid]>target){
                res= letters[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res==' '?letters[0]:res;
    }
}