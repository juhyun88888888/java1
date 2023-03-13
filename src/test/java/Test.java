public class Test {

    // 문제 : 할인 대상인지 아닌지 출력해주세요.
    public static void test(String[] args) {
        int age = 20;
//ver1
        if (age <= 19) {
            if (age >= 60) {
                System.out.println("할인대상입니다.");
            }
        }
//ver2
        if (age <= 19) {
            System.out.println("할인대상입니다.");
        } else if (age >= 30) {
            System.out.println("할인대상이 아닙니다.");
        }
//ver3
        if (age <= 19 && age >= 60) {
            System.out.println("할인대상입니다.");
        }
//ver4
        if (age <= 19 || age >= 30) {
            System.out.println("할인대상이 아닙니다.");
        }
    }
}
//ver2


// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.


