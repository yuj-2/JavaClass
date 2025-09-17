package days23;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 4:44:26 
 * @subject   C
 * @content     ㄴ L
 *                  ㄴ ArrayList
 *                  ㄴ Vector
 *                  ㄴ LinkedList 컬렉션 클래스 
 */ 
public class Ex11 {

	public static void main(String[] args) {
		// LinkedList - 순서 유지 O, 중복 허용 O
		/*
		 * [ 배열 구조 단점 ]
		 * [][][][삽입][삭제][][][][][][]
		 * 단점) 데이터를 삽입, 삭제할 때 성능이 무지 떨어진다. -> LinkedList 컬렉션 클래스 
		 * 장점) 읽기 성능이 가장 빠르다.  
		 * 
		 * - (특징) 비연속적이다. 
		 * */
		
		Node node1 = new Node();
		node1.value = 100;
		node1.next = null;
		
		Node node2 = new Node();
		node2.value = 200;
		node1.next = node2;
		node2.next = null;
		
		/*
		Node node3 = new Node();
		node3.value = 300;
		node2.next = node3;
		node3.next = null;
		*/
		
		Node node4 = new Node();
		node4.value = 400;
		node2.next = node4;
		node4.next = null;
		
		// node3 제거
		
		// 모든 노드의 value 값을 출력
		Node node = node1;
		while( node != null) {
			System.out.println(node.value);
			node = node.next;
		}
		

	}

}

// [ 단방향 링크드 리스트 ]
// 양방향(이중)     "
// 환형
class Node{
	
	// Node prev = null; //  앞의 노드의 참조변수
	int value ;
	Node next = null; // 뒤에 노드의 참조변수
	
}


