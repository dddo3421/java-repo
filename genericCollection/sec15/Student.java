package genericCollection.sec15;

import java.util.*;

import genericCollection.sec12.Member2;

public class Student {
	// Map 콜렉션에 저장될 데이터의 key로 사용할 클래스
		private int stdNo;
		private String stdName;
			
		public Student(int stdNo, String stdName) {
			this.stdNo = stdNo;
			this.stdName = stdName;
		}

		public int getStdNo() {
			return stdNo;
		}

		public void setStdNo(int stdNo) {
			this.stdNo = stdNo;
		}

		public String getStdName() {
			return stdName;
		}

		public void setStdName(String stdName) {
			this.stdName = stdName;
		}
		
		@Override
		public int hashCode() {
			int stdNoHash = Integer.hashCode(stdNo);
			int stdNameHash = stdName.hashCode();

		    System.out.println("stdNo 해시값: " + stdNoHash + ", stdName 해시값: " + stdNameHash);
		    return Objects.hash(stdNo, stdName);
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student std = (Student)obj;
				return (std.stdNo==stdNo)&&std.stdName.equals(stdName);
			}else {
				return false;
			}
			
	}
}




