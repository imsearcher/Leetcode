//#9 Palindrome Number
public class PalindromeNum {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        
        int length=String.valueOf(x).length();
        length=(int)Math.pow(10,length-1);
        
        while(length>=10){
            if(x/length!=x%10)
                return false;
            x%=length;
            x/=10;
            length/=100;
           
        }
        return true;
    }
}