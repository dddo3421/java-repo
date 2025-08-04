package genericCollection;

import java.util.*;

public class SortCollection {

	static void printList(ArrayList<String> list) {
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String ele = iter.next();
			String sep;
			if(iter.hasNext()) 
				sep = "->";
			else
				sep = "\n";
			System.out.print(ele + sep);
		}
	}
	
	public static void main(String[] args) {
		// 콜렉션 객체에 사용 가능한 sort, reverse 메소드
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add("터미네이터");
		myList.add("아바타");

		System.out.print("리스트 순서 : ");
		for(String m : myList) {
			System.out.print(m + "|");
		}
		
		System.out.print("\n\n오름차순 정렬 : "); //Collection 객체에 대한 정렬 static 메소드 sort(콜렉션)
		Collections.sort(myList);
		printList(myList);
		
		System.out.print("\n내림차순 정렬 : "); //Collection 객체에 대한 정렬 static 메소드 sort(콜렉션)
		Collections.reverse(myList); //실제 콜렉션 객체의 원소들을 재배치함
		printList(myList);
		
		System.out.println("\n"+myList.get(1));
		
	}
		
		
}
