//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
        Scanner keyboard = new Scanner(System.in);
        int score;

        System.out.print("java 성적 입력 : ");
        score = keyboard.nextInt();

        String grade =
                score >= 95 && score <= 100? "A+" :
                score >= 90 && score <= 94? "A0" :
                score >= 85 && score <= 89? "B+" :
                score >= 80 && score <= 84? "B0" :
                score >= 75 && score <= 79? "C+" :
                score >= 70 && score <= 74? "C0" :
                score >= 65 && score <= 69? "D+" :
                score >= 60 && score <= 64? "D0" : "F";

        System.out.printf("학점 : %s", grade);
    }
