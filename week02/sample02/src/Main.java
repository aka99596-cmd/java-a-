/*
이 프로그램은 처음 실습 내용입니다.
*/ //설명문

void main() {
    String name = "이순신"; // 문자열 데이터를 선언하는 선언문(대입문)


    System.out.printf("이름 : %s\n",name);
    /*
    형식을 적용하여 문자열이나 특수 문자, 서식 문자 등을 출력함
    C언어의 printf( ) 함수와 거의 동일한 방법으로 사용
    마지막에 위치한 Data Type은 출력하고자 하는 Data 구
    분에 따라 다른 형태로 표현
    일반적으로 정수 %d, 실수 %f, 문자열 %s, boolean %b가 이용됨
    */
    System.out.print("대한민국\n"); //Data를 출력한 후 줄 바꿈을 하지 않음 뒤에 \n을 붙이면 됨
    System.out.println("경복대학교"); //println은 Data를 출력한 후 자동으로 다음 줄로 넘어감 “개행 문자(줄 바꿈 문자)”가 붙어있음
    System.out.println("김영재");


}
