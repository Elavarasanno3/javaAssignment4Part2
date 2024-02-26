package JavaAssignment5;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(findPalindrome(str));
    }
    static boolean  findPalindrome(String str){
        String ans = "";
        for(int i = 0;i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))){
                ans = ans + str.charAt(i);
            }
        }
        ans = ans.toLowerCase();
        int first = 0;
        int last = ans.length()-1;

        for(int i = 0;i<ans.length()/2;i++){
            if(ans.charAt(first++) != ans.charAt(last--)){
                return false;
            }
        }
        return true;
    }


}
