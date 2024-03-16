package march;
public class StringReverse {
    static void reverse(String str)
    {
        
        String[] strArray=str.split("\\s");
        StringBuilder sb=new StringBuilder();
        //String newString="";
        
            for(String s:strArray)
            {
                for(int j=s.length()-1;j>=0;j--)
                   sb.append(s.charAt(j));
                sb.append(" ");
            }
            
         System.out.println(sb.toString());
    }
    public static void main(String[] args)
    {
        reverse("selenium automation");
    }
}
