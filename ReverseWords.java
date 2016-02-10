//151. Reverse Words in a String
//Should use charAt
public class ReverseWords {
    public String reverseWords(String s) {
        String[] sentence= s.split(" ");
        
        StringBuilder sb=new StringBuilder();
        for(int i=sentence.length-1;i>=0;i--){
            
            if(sentence[i].length()==0)
                continue;
            sb.append(sentence[i]);
            sb.append(" ");
            
        }
        return sb.toString().trim();   
    }
}