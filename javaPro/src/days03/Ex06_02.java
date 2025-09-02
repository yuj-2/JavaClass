package days03;

public class Ex06_02 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
        // 
        //double a = 0.14; 
		double a = 0.1;
        double b = -1;
        int cnt = 0;
        while( a != 1 && ++cnt <=100 ) {
            b = a * 2;
            System.out.printf("%f->%d\n", b, (int)b );
            sb.append((int)b);
            a = b>1? b-1: b;
        }
        System.out.println(sb.toString());
        System.out.println("end");

	}

}
