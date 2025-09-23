package days27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오전 7:05:15 
 * @subject   
 * @content 
 */ 
public class Ex01 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int N; // 막대기 갯수 6

		ArrayList<Integer> nlist=new ArrayList<Integer>(); // 5 4 4 2 2 8
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine()); // 막대기 수 6
		StringTokenizer st=new StringTokenizer(br.readLine()); // 5 4 4 2 2 8

		int cutOp=-1;

		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());  // 5 4 4 2 2 8
			nlist.add(n);

			if (cutOp==-1||cutOp>n) {
				cutOp = n;
			}

		}//리스트에 막대기 추가

		int count = nlist.size();//현재 총 막대기의 수  X  N

		while (count!=0) {
			
			System.out.println(count);//현재 막대기 수 출력   6
			
			for (int i = 0; i < nlist.size(); i++) {
				
				int nowNum=nlist.get(i); // 3 2 2 6
				
				if (nowNum-cutOp <= 0) {
					nlist.remove(i);
					i--;
					count--;
				}else {
					nlist.set(i, nowNum-cutOp);
				}
			}
		}//막대기 제거 작업


	} // main

} // class









