class Main {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        int s = 0;
        int e = n-1;
        while (s < e){
            if (str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;e--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}





//   for(int i=0;i<n;i++){               // for reversing
//        int left = 0;
//        int right = matrix.length-1;
//
//        while(left < right){
//        int temp = matrix[i][left];
//        matrix[i][left] = matrix[i][right];
//        matrix[i][right]= temp;
//        left++;
//        right--;
//        }
//        }
