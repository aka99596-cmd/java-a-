void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("학교 : ");
    String school = keyboard.nextLine();
    System.out.print("이름 : ");
    String name = keyboard.nextLine();
    System.out.print("나이 : ");
    int age = keyboard.nextInt();
    System.out.print("성별 : ");
    String gender = keyboard.next();
    System.out.print("신장 : ");
    float height = keyboard.nextFloat();
    System.out.print("체중 : ");
    float weight = keyboard.nextFloat();

    System.out.printf("학교는 %s입니다.\n", school);
    System.out.printf("%s의 키는 %,.1fCm입니다.\n", name, height);
    System.out.printf("%s의 몸무게는 %,.1fkg입니다.\n", name, weight);
    System.out.printf("%s의 나이는 %d살 입니다.\n", name, age);
    System.out.printf("%s은 %s자 입니다.\n", name, gender);
}