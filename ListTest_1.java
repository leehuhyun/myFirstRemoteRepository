package collection1;

import java.util.ArrayList;

public class ListTest_1 {

	public static void main(String[] args) {
		
		//자료의 갯수를 고정하지 않은 상태에서 저장하는 자료구조는 List(인터페이스)
		
		//List 인터페이스를 구현한 ArrayList가 있다.
		//ArrayList 객체를 만들어보겠습니다.
		
		
		// generic 포괄적인 <>쓰시고, 기본형을 객체로 감싼 타입인 wrapper 클래스인 Integer, Double 를 클래스 뒤에 붙여줘라
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println(arrayList);

		arrayList.add(30);
		
		System.out.println(arrayList);
		
		arrayList.add(40);
		
		System.out.println(arrayList);
		
		arrayList.add(50);
		
		System.out.println(arrayList);

		arrayList.add(60);
		
		System.out.println(arrayList);

		arrayList.add(70);
		
		System.out.println(arrayList);

		
		
		int tot=0;
		
		//1) 직접 인덱싱 돌리는 방법
//		for(int i = 0; i < arrayList.size(); i++) {
//			tot += arrayList.get(i);
//			
//		}
		
		//2) 향상된 for사용
		
		for(int t : arrayList) {
			tot += t;
		}
		
		System.out.println(tot);
	}
}
