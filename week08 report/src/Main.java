//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    double height;
    double distance = 0;

    System.out.print("초기 높이 X(m)를 입력하세요: ");
    height = keyboard.nextDouble();

    for (int i = 1; i <= 10; i++) {
        System.out.printf("공의 %d번째 낙하 높이: %.4f m%n", i, height);

        distance += height;

        height = height * 2 / 3;

        if (i < 10) {
            distance += height;
        }
    }

    System.out.printf("총 이동 거리: %.4f m%n", distance);
}
