package package2;

public class ForNested {

	public static void main(String[] args) {
		// 구구단 전체 출력 형식으로 출력
		// 2단 ~ 9단 : 2x1=2 3x1=3 .... 9x1=9
		for(int n=1; n<=9;n++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan + "x" + n + "=" + dan*n + '\t');
				}
			System.out.println();
		}
	}

}
