class Main {
    public static String find(int n) {
        if (n == 1){
            return "1";
        }
        String say = find(n-1);

        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (int i=0;i<say.length();i++){
            count++;
            if (i == say.length()-1 || say.charAt(i) != say.charAt(i+1)){
                ans.append(count).append(say.charAt(i));
                count = 0;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(find(n));
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
