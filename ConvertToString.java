package stringoperations;

public class ConvertToString {
    static void convert(int num)
    {
        String newString="";
        newString+=num;
        System.out.println(newString);
        
        if(newString.matches("\\d+"))
        System.out.println("The result is a numeric string.");
        System.out.println(String.valueOf(newString));
        StringBuilder sb=new StringBuilder();
        sb.append(num);
       String str= sb.toString();
        System.out.println(str);

    }

    public static void main(String[] args) {
        convert(1234);
    }
}
