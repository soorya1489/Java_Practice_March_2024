package march;

import java.util.ArrayList;
import java.util.List;

public class Isogram {
    static void isogram(String str)
    {
        List<Character> alist=new ArrayList<>();
        int k=0;
        for(int i=0;i<str.length();i++)
        {
            if(alist.contains(str.charAt(i)))
            {
                System.out.println("Not an isogram");
                k=1;
                 break;
            }
            else
                alist.add(str.charAt(i));
        }
        if(k==0)
        System.out.println("Isogram");
    }
    public static void main(String[] args)
    {
        String str="How are you?";
        isogram(str);
        isogram("sorya");
    }
    
}
