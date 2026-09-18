//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int radius;
    int 정사각형면적;
    double 원의면적;
    double 구하는면적;

    System.out.print("원의 반지름 입력(정수형) ? ");
    radius = keyboard.nextInt();

    원의면적 = 3.141592 * radius * radius;
    정사각형면적 = (radius * 2) * (radius * 2);
    구하는면적 = 정사각형면적 - 원의면적;

    System.out.printf("정사각형 면적 : %,d Cm2%n", 정사각형면적);
    System.out.printf("원의 면적 : %,.2f Cm2%n", 원의면적);
    System.out.printf("구하는 면적 : %,.2f Cm2%n", 구하는면적);
}
