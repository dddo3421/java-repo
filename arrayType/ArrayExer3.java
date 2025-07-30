package arrayType;

public class ArrayExer3 {

	public static void main(String[] args) {
		int num[] = new int[6]; // 길이 6인 배열
        int count = 0; // 뽑기 카운트 
        
        System.out.println("**1~45 랜덤숫자 6개 출력**");
        while (count < 6) {
            int random = (int)(Math.random() * 45) + 1; //랜덤숫자 1~45
            boolean check = false; // 중복 체크

            for (int i = 0; i < count; i++) { // 배열의 숫자들과 비교하여 중복체크 실행
                if (num[i] == random) { 
                    check = true;
                    break; // 중복이면 반복문 종료
                }
            }

            if (!check) { //중복이면 다음뽑기
                num[count] = random;
                count++;
            }
        }

        for (int i = 0; i < 6; i++) { //숫자 출력
            System.out.print(num[i] +" ");
        }
    }
}
