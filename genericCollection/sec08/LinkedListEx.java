package genericCollection.sec08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// 성능비교
		// List = ArrayList
		// List = LinkedList
		// ArrayList = ArrayList
		// LinkedList = LinkedList

		List<String> listArrList = new ArrayList<String>();
		List<String> listLinkedList = new LinkedList<String>();
		
		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		//////////////////////////////////////////////////
		long startTime = System.nanoTime();
		
		//작업
		for(int i=0; i<10000; i++) {
			listArrList.add(0,String.valueOf(i)); // 리스트의 맨 앞에 계속 추가하고 뒤의 인덱스들은 전부 밀려나는게 반복됨
		}
		
		long endTime = System.nanoTime();
		System.out.println("listArrList 소요시간 : " + (endTime - startTime) + " ns");
		
		//////////////////////////////////////////////////
		startTime = System.nanoTime();
		
		//작업
		for(int i=0; i<10000; i++) {
			listLinkedList.add(0,String.valueOf(i)); 
		}
		
		endTime = System.nanoTime();
		System.out.println("listLinkedList 소요시간 : " + (endTime - startTime) + " ns");
		
		//////////////////////////////////////////////////
		startTime = System.nanoTime();
		
		//작업
		for(int i=0; i<10000; i++) {
			arrayList.add(0,String.valueOf(i)); 
		}
		
		endTime = System.nanoTime();
		System.out.println("arrayList 소요시간 : " + (endTime - startTime) + " ns");
		
		//////////////////////////////////////////////////
		startTime = System.nanoTime();
		
		//작업
		for(int i=0; i<10000; i++) {
			linkedList.add(0,String.valueOf(i)); 
		}
		
		endTime = System.nanoTime();
		System.out.println("linkedList 소요시간 : " + (endTime - startTime) + " ns");
		

	}

}
