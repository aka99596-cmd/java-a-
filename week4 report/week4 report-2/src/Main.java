//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int price;
    int amount;
    int tax;

    System.out.print("판매금액 : ");
    price = keyboard.nextInt();

    amount = (int)(price / 1.1);
    tax = price - amount;

    System.out.printf("금액 : %,d원\n", amount);
    System.out.printf("세금 : %,d원\n", tax);
}

