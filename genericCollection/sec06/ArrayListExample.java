package genericCollection.sec06;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<4; i++) {
		System.out.print("단어를 입력하세요 >>");
		String input = sc.nextLine();
			list.add(input);
		}
		
		
		String maxInput = list.get(0);
        for (String input : list) { // list 안의 모든 문자열을 하나씩 input이라는 변수에 담아 순
            if (input.length() > maxInput.length()) {
                maxInput = input;
            }
        }
		
        
		System.out.println("----------------------");
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n가장 긴 단어는 : " + maxInput);
		System.out.println("가장 긴 단어의 길이는 : " + maxInput.length());
		 sc.close();
		
	}

}
