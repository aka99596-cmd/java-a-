//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int HEIGHT = 300;
    final int UP = 30;
    final int DOWN = 13;

    int distance = 0;
    int day = 0;

    while (distance < HEIGHT) {
        day++;

        distance += UP;

        System.out.printf("%d일째 낮 : %dcm%n", day, distance);

        if (distance >= HEIGHT) {
            break;
        }

        distance -= DOWN;

        System.out.printf("%d일째 밤 : %dcm%n", day, distance);
    }

    if (day <= 7) {
        System.out.println("방울꽃이 시들기 전에 도착했습니다.");
    } else {
        System.out.println("방울꽃이 시들기 전에 도착하지 못했습니다.");
    }

    System.out.printf("걸린 날짜 : %d일", day);
    }

