//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int price;
    char grade; // Y,N

    System.out.print("총 구매가격 : ");
    price = keyboard.nextInt();

    System.out.print("맴버쉽에 가입하셨습니까? (예Y,N) : ");
    grade = keyboard.next().charAt(0);


    String result = price < 0 ? "오류" :
            (price >= 50000 || (grade == 'Y' && price >= 30000)
                    ? "무료배송가능" : "무료배송불가능");

    System.out.println(result);
}