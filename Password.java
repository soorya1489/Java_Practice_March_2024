package stringoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Password {
    static void passwordCheck(String[] arr)
    {
        List<String> arrlist=new ArrayList<>();
        arrlist.addAll(Arrays.asList(arr));
        String password=arrlist.remove(0);
        arrlist.add(password);
        System.out.println(arrlist);
    }
    public static void main(String[] args) {
        String[] arr={"Dilligrout", "Baubles", "Caput Draconis", "Pig Snout", "Wattlebird", "Banana Fritters"};
        passwordCheck(arr);
        
    }
}
