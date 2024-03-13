package stringoperations;

public class OfferCheck {
    public static void main(String[] args) {
        String input="Hello";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<3;i++)
        {
        sb.append(input);
        sb.append(" ");
        }
        System.out.println(sb.toString());
    }
    
}
