package firstclass;

public class StringExample {
    public static void main(String[] args) {
        System.out.println("나는 문자열");
        //홑 따옴표에는 여러 문자가 들어갈 수 없다.
        System.out.println('나'); 

        //문자열 안에 특별한 문자를 넣을때 -- 백슬래시 사용
        System.out.println("안녕 나는 \"자바\"야.");
        //여러줄의 문자열 출력
        System.out.println("치킨은 살안쪄요 \n살은 내가 쪄요");
    }
}

/**여러줄 주석*/