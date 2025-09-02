package days07;

public class Ex02 {

	public static void main(String[] args) {
		
		int index = 5;
		int [] lottos = { 6, 19, 29, 45, 1, 0};
		int n = 29;
		
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if( lottos[i] == n ) {
				flag = true;
				break;
			}
		}
		
		/*
		if (index == 1 ) {
			if( lottos[0] == n ) 체크
		}else if(index == 2) {
			if( lottos[0] == n || lottos[1] == n )
		}else if(index ==3 ) {
			if( lottos[0] == n || lottos[1] == n || lottos[2] == n )
		}
		*/
		//if( lottos[0] == n || lottos[1] == n || lottos[2] == n ) 중복된다.
		//if( lottos[0] == n || lottos[1] == n || lottos[2] == n || lottos[3] == n || lottos[4] == n) 중복된다.

	}

}
