package fourth;

public class StringExample {
    public static void main(String[] args) {
        String str = "치킨은 살 안쪄요.";
        String me = "살은 내가 쪄요.";
        String example = "1996/06/13";
        String year = example.substring(0,4);  
        String month = example.substring(5,7);
        String day = example.substring(8, 10);
        String result = str + me;
        
        result = str + " " + me;
        result = result.replaceAll("살", "돈");


        System.out.println(result);
        System.out.println(result.length());
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
