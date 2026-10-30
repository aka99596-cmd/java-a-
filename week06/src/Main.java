//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final int WON500 = 500;
    final int WON100 = 100;
    final int WON50 = 50;
    int money;
    int coin500,coin100,coin50;
    String result;

    System.out.print("거스름돈 입력 : ");
    money = keyboard.nextInt();

    coin50 = money;
    coin500 = coin50 / WON500;
    coin50 %= WON500;
    coin100 = coin50 / WON100;
    coin50 %= WON100;
    coin50 = coin50 / WON50;

    System.out.printf("\n거스름 돈 : %,d원",money);
    result =(money % WON50 == 0)?
            String.format("\n%d원 동전 : %,3d개 (%,10d원)", WON500,coin500, coin500* WON500) +
            String.format("\n%d원 동전 : %,3d개 (%,10d원)", WON100,coin100, coin100 * WON100)+
            String.format("\n%d원 동전 : %,3d개 (%,10d원)", WON50,coin50, coin50 * WON50):
            String.format("\n거스롬 돈을 지불할 수 없음");
    System.out.println(result);
}
