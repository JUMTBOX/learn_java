package third;

public class Operator {
    public static void main(String[] args) {
        int num = 5;
        /**
         정수타입의 변수에 실수 타입인 1.2를 재할당하려면 타입적 제한 때문에 어려움
         그럴 때 정수 타입으로 형 변환을 시키는 방법
         */
        num = (int) 1.2;

        System.out.println(num);
    }
}

/** 
 정수와 실수로 연산을 하면 결과는 실수로 출력됨
*/