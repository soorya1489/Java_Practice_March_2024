package stringoperations;

public class StringReplace {
   static int k;
    static void capitalize(int[] arr,String str)
    {
        StringBuilder sb=new StringBuilder();
        
        for(int j=0;j<str.length();j++)
        {
        for(int i=0;i<arr.length;i++)
        {
            k=0;
            if(arr[i]==j)
            {
            sb.append(Character.toUpperCase(str.charAt(j)));
            k=1;
            break;
            }
            
        }
        if(k==0)
            sb.append(str.charAt(j));
    }
        System.out.println(sb);
    }
    static void firstLetter(String name)
    {
        String s1=name.toUpperCase();
        if(s1.startsWith("T"))
        System.out.println("name starts with T");
        else
        System.out.println("name does not start with T");

    }
    static void replaceString(String str)
    {
      String s1=str.replace("a","d");
      String s2=s1.replace("b","a");
      String s3=s2.replace("d","b");
      System.out.println(s3);
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)=='a')
        {
            sb.append("b");
        }
        else if(str.charAt(i)=='b')
        sb.append("a");
        else
        sb.append(str.charAt(i));
      }
      System.out.println(sb.toString());
    }

    public static void main(String[] args) {
       // replaceString("abcaab");
       // firstLetter("taylor");
       // firstLetter("soorya");
       int[] arr={2,5,100};
        capitalize(arr,"i am soorya");
    }
}
