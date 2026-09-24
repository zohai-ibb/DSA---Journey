class Solution {
    public int minimumLength(String str) {
        int i = 0;
        int j = str.length() - 1;

        while(i <= j){

            if(i == j){
                return 1;
            }
            
            if(str.charAt(i) != str.charAt(j)){
                return j - i + 1;
            }

            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                i++;
            }
            while(j > 0 && str.charAt(j) == str.charAt(j - 1)){
                j--;
            }
            i++;
            j--;
        }
        return 0;
    }
}