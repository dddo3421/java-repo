package arrayType;
import java.util.Scanner;
public class Array2DEx2 {

	public static void main(String[] args) {
		// 2차원배열 생성 및 활용 연습
		String[][] words = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은? :",i+1,words[i][0]);
			String tmp = scanner.nextLine(); // 스페이스 문자 포함한 한 행을 읽어옴
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			}else {
				System.out.printf("틀렸습니다.정답은 %s입니다. %n%n", words[i][1]);
			}
		}

	}

}
