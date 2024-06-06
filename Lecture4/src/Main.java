class Main{
    public static int check(int[] arr,int x){
        return check(arr,0, arr.length-1, x);
    }
    public static int check(int[] arr,int s,int e,int x){
        if (s > e){
            return -1;
        }
        int mid = (s+e)/2;
        if (arr[mid] == x){
            return mid;
        } else if (arr[mid] < x) {
            return check(arr,mid+1, arr.length-1,x );
        }
        else {
            return check(arr,s,mid-1,x);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8};
        int x = 3;
        System.out.println(check(arr,x));
    }
}