void main() {
    Scanner keyboard = new Scanner(System.in);
    final int TOTAL = 37;
    final int CHICKEN_LEG = 2;
    final int DOG_LEG = 4;
    final int TOTAL_LEG = 102;

    int chicken, dog;
    char answer;

    System.out.print("for문으로 쓰면?\n");

    for (chicken = 0; chicken <= TOTAL; chicken++) {
        dog = TOTAL - chicken;

        if (chicken * CHICKEN_LEG + dog * DOG_LEG == TOTAL_LEG) {
            System.out.printf("닭 : %d마리, 개 : %d마리%n", chicken, dog);
        }
    }

    chicken = 0;
    System.out.print("while문으로 쓰면?\n");

    while (chicken <= TOTAL) {
        dog = TOTAL - chicken;

        if (chicken * CHICKEN_LEG + dog * DOG_LEG == TOTAL_LEG) {
            System.out.printf("닭 : %d마리, 개 : %d마리%n", chicken, dog);
        }

        chicken++;
    }

    chicken = 0;
    System.out.print("do문으로 쓰면?\n");

    do {
        dog = TOTAL - chicken;

        if (chicken * CHICKEN_LEG + dog * DOG_LEG == TOTAL_LEG) {
            System.out.printf("닭 : %d마리, 개 : %d마리%n", chicken, dog);
        }

        chicken++;

    } while (chicken <= TOTAL);

    System.out.print("다 구하셨습니까? (Y/N) : ");
    answer = keyboard.next().charAt(0);

    String result = answer == 'Y' || answer == 'y'
            ? "프로그램을 종료합니다."
            : "다시 확인해 보세요.";

    System.out.println(result);
}