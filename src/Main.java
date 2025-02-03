import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>() { };
        list.add("0:start:0");
        list.add("1:start:5");
        list.add("2:start:8");
        list.add("3:start:12");
        list.add("4:start:15");
        list.add("5:start:19");
        list.add("5:end:22");
        list.add("4:end:24");
        list.add("3:end:27");
        list.add("2:end:32");
        list.add("1:end:35");
        list.add("0:end:36");
        int[] result = Task3_ExclusiveTime.exclusiveFunctionsTime(list, 6);
        System.out.println(Arrays.toString(result));
    }

}