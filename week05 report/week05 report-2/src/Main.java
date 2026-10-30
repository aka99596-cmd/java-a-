//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
  Scanner keyboard = new Scanner(System.in);
    int second; //입력하는 초
    int hour; //시간
    int minute; //분
    int result; //계산되는 초

    System.out.print("초 입력 : ");
    second = keyboard.nextInt();

    hour = second / 3600;
    result = second % 3600;
    minute = result / 60;
    result = result % 60;

    System.out.printf("%d초는 %d시간 %d분 %d초 입니다.",second,hour,minute,result);
}
