package JavaAssignment5;
import java.util.*;
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinaryInteger("1010","1011"));
    }
    static String addBinaryInteger(String a,String b) {
           int carry = 0;
           StringBuilder str = new StringBuilder();
           int aSum = 0;
           int bSum = 0;
           int aTraverser = a.length()-1;
           int bTraverser = b.length()-1;
           while(aTraverser >= 0 && bTraverser >= 0){
               aSum = a.charAt(aTraverser--) - 48;
               bSum = b.charAt(bTraverser--) - 48;
               int sum = aSum + bSum + carry;
               carry = setBinary(sum,carry,str);

           }
        while(aTraverser >= 0){
            aSum = a.charAt(aTraverser--) - 48;
            int sum = aSum + carry;
            carry = setBinary(sum,carry,str);
        }
        while(bTraverser >= 0){
            bSum = b.charAt(bTraverser--) - 48;
            int sum = bSum + carry;
            carry = setBinary(sum,carry,str);

        }
    str.append(carry);
    str.reverse();
    String ans =str.toString();
        return ans;
    }
    static int setBinary(int sum,int carry,StringBuilder str){
        switch (sum){
            case 0 : {
                str = str.append("0");
                carry = 0;
            }break;
            case 1 :{
                str = str.append("1");
                carry = 0;
            }break;
            case 2 :{
                str = str.append("0");
                carry = 1;
            }break;
            case 3 :{
                str = str.append("1");
                carry = 1;
            }
        }
        return carry;
    }
}
