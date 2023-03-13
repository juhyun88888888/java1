//public class Main {
// public static void main(String[] args) {
// 프로그램의 시작점
// System.out.println("Hello world!");
//System.out.println("안녕하세요\n안녕하세요");
// 프로그램의 끝점
// println은 자바스크립트의 console과 같은것으로 출력의미를 가진다.
// 자바는 컴파일 언어 자바스크립트는 인터프리터 언어
// 자바는 컴파일이라는 것을 해야 언어가 출력됨.
//.은 ~의 라는 뜻을 가짐.
//ex) System 의 out 의 prinln()을 출력해달라.
//\n은 문자열을 구분해서 출력하고 싶은 문자를 원하는 수만큼 입력해서 여러번 출력하게 해줌.
//코드를 다 작성한 후에는 ctrl+shift+f 눌러서 코드 행 정리해주기.
//}
//}

//public class Main {
//public static void main(String[] args){
//변수
//int a = 5;
//int b = 10;
//int temp = a;
//b = temp;
//a = 10;
//System.out.println(a);
//System.out.println(b);
// 자료형만 받을 수 있다.
//}
//}

//public class Main {
// public static void main(String[] args) {
//  int x = 2;

//System.out.println( x + 2);
//System.out.println( x - 2);
//System.out.println( x * 2);
//System.out.println( x / 2);
//System.out.println( x + 6 + x % 2);
// }
//}

//정리
// 주어.동사() 의 형태로 작성
//세미콜론(;)은 마침표와 같은 의미
//var > int 변수를 반드시 자료형으로 선언

public class Main {
    public static void main(String[] args) {

        int age = 20;
///ver1
        if (age <= 19) {
            if (age >= 60) {
                System.out.println("할인대상입니다.");
            }
        }
////ver2
        if (age <= 19) {
            System.out.println("할인대상입니다.");
        } else if (age >= 30) {
            System.out.println("할인대상이 아닙니다.");
        }
////ver3
        if (age <= 19 && age >= 60) {
            System.out.println("할인대상입니다.");
        }
////ver4
        if (age <= 19 || age >= 30) {
            System.out.println("할인대상이 아닙니다.");
        }
    }
}

//// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
//// 조건 : 출력예시 처럼 출력되어야 합니다.
//// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
//// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
//// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.}