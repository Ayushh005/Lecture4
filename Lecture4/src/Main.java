class Main{

    public static void twosum(int[] arr,int target){
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,3,2,7};
        int target = 9;

        twosum(arr,target);
    }
}
