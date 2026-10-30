//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int integer1;
    int integer2;
    int integer3;

    System.out.print("첫번째 정수 입력 : ");
    integer1 = keyboard.nextInt();
    System.out.print("두번째 정수 입력 : ");
    integer2 = keyboard.nextInt();
    System.out.print("세번째 정수 입력 : ");
    integer3 = keyboard.nextInt();

    String result = (integer1 > 0 && integer2 > 0 && integer3 > 0) ? "모두 양수" :
                    (integer1 == 0 && integer2 == 0 && integer3 == 0)? "모두 0" : "음수 포함";
    System.out.println(result);
}
