void main() {
    final String SCHOOL = "경복대학교";
    final String NAME = "김영재";
    final int AGE = 27;
    final char GENDER = '남';
    final float HEIGHT = 172.1f;
    final float WEIGHT = 120.4f;

    System.out.printf("학교 : %s\n", SCHOOL);
    System.out.printf("이름 : %s\n", NAME);
    System.out.printf("나이 : %d\n", AGE);
    System.out.printf("성별 : %c\n", GENDER);
    System.out.printf("신장 : %,.1f Cm\n", HEIGHT);
    System.out.printf("체중 : %,.1f Kg\n", WEIGHT);
}