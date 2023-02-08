/* 컬렉션 프레임워크(Collection Framework) 
	     *
	     * 1. List 인터페이스
	     *  - 순서가 있는 데이터의 집합으로 데이터의 중복 저장을 허용한다.
	     *  - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
	     * 2. Set 인터페이스
	     *  - 순서가 없는 데이터의 집합으로 데이터 중복을 허용하지 않는다.
	     *  - HashSet, TreeSet 등이 있다.
	     * 3. Map 인터페이스
	     *  
	     */
		
		/* ArrayList
		 * JDK 1.2부터 제공되는 가장 많이 사용되는 컬렉션 클래스이다.
		 * 내부적으로 배열을 이용하여 요소를 관리하며 인덱스를 이용해 배열의 요소에 접근한다.
		 * ArrayList는 객체 배열의 단점을 보완하기 위해 만들어졌다.
		 * 배열의 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등의 복잡하다는 단점을 가지고 있다.
		 * ArrayList는 크기 변경, 요소의 추가, 삭제, 정렬 기능에 따라 구현해놓고 제공해주고 있다.
		 * */
		
		/* ArrayList는 인스턴스를 생성하게 되면 내부적으로 10칸짜리 배열을 생성해서 관리한다. */
		ArrayList alist = new ArrayList();
		
		/* 다형성을 적용하여 상위 타입으로 ArrayList 객체를 만든다.
		 * List 인터페이스 하위의 ㄷ양한 구현체들로 타입변경이 가능하기 때문에
		 * 레퍼런스 타입은 List로 해두는 것이 더 유연하게 코드를 작성하는 것이다.
		 * */
		List list = new ArrayList();
//		list = new LinkedList(list);
		
		list.add("apple");
		list.add(123);
		list.add(45.67);
		list.add(new java.util.Date());
		
		System.out.println(list.get(0));
		
		System.out.println("list : " + list);
		
		System.out.println("list의 size() : " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
			
		}
		list.add("apple");
		System.out.println("list : " + list);
		
		list.add(1, "banana");
		System.out.println("list : " + list);
		
		list.remove(2);
		System.out.println("list : " + list);
		
		list.set(1, true);
		System.out.println("list : " + list);
	}

}
