//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboad = new Scanner(System.in);
    String name;
    int age;

    System.out.print("당신의 이름은 ? "); //promp 문장
    name = keyboad.nextLine();
    System.out.printf("%s님의 나이는 ? ", name); //promp 문장
    age = keyboad.nextInt();

    System.out.printf("이름 : %s, 나이 : %d\n", name, age);
}
