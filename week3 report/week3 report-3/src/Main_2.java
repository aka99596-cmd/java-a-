void main() {
    String school = "경복대학교";
    String name = "김영재";
    int age = 27;
    String gender = "남";
    float height = 172.1f;
    float weight = 120.4f;

    System.out.printf("학교 : %s\n", school);
    System.out.printf("이름 : %s\n", name);
    System.out.printf("나이 : %d\n", age);
    System.out.printf("성별 : %s\n", gender);
    System.out.printf("신장 : %,.1f Cm\n", height);
    System.out.printf("체중 : %,.1f Kg\n", weight);
}