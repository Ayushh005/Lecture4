package RecursionOnString;

public class SubSequences {
    public static String[] subSequence(String str){
        if (str.length() == 0) {
            String[] ans = {""};
            return ans;
        }
        String[] smallans = subSequence(str.substring(1));
        String ans[] = new String[2* smallans.length];

        for (int i=0;i< smallans.length;i++){
            ans[i] = smallans[i];
        }
        for (int i=0;i< smallans.length;i++){
            ans[i+ smallans.length] = str.charAt(0)+smallans[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "xyz";
        String[] ans = subSequence(str);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
