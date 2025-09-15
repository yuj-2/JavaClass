package days21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.IntStream;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오후 12:36:14 
 * @subject   
 * @content 
 */ 
public class Ex08_02 {
	
	public static void main(String[] args) {
		// 상대 경로
		String fileName = ".\\src\\days21\\Ex01.java";
 
		// 0 'A'(65)  25 'Z'(90)
		int [] countsUpper = new int[26]; // 대문자 갯수 저장 배열
		// 0 'a'(97)  25 'z'(122)
		int [] countsLower = new int[26]; // 소문자 갯수 저장 배열	
		// 0  '0'(48)  9  '9'(57)
		int [] countsDigit = new int[10]; // 숫자 갯수 저장 배열	
		
		int one = 0;
		try ( FileReader fr = new FileReader(fileName);) {

			while (  (one = fr.read())  != -1 ) {
				if ( Character.isUpperCase(one) ) { // 대문자
					int index = one - 'A';
					countsUpper[index]++;
				} else if ( Character.isLowerCase(one) ) { // 소문자
					int index = one - 'a';
					countsLower[index]++;
				} else if ( Character.isDigit(one) ) { // 숫자
					int index = one - '0';
					countsDigit[index]++;
				}
			}
			// System.out.println( Arrays.toString(counts) );
			for (int i = 0; i < countsUpper.length; i++) { 
				System.out.printf("%c(%d) : %s\n", i + 'A',  countsUpper[i]
						, "#".repeat( countsUpper[i]));				
			}
			for (int i = 0; i < countsLower.length; i++) { 
				System.out.printf("%c(%d) : %s\n", i + 'a',  countsLower[i]
						, "#".repeat( countsLower[i]));				
			}
			for (int i = 0; i < countsDigit.length; i++) { 
				System.out.printf("%c(%d) : %s\n", i + '0',  countsDigit[i]
						, "#".repeat( countsDigit[i]));				
			}
		 
//			        ==대문자:19==
//					==소문자:486==
//					==숫자:55==
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}  

		System.out.println( " end ");



	} // main

} // class




/*
==대문자:19==
A(0) 
B(4) ####
C(0) 
D(0) 
E(1) #
F(0) 
G(0) 
H(0) 
I(0) 
J(0) 
K(0) 
L(0) 
M(0) 
N(0) 
O(0) 
P(0) 
Q(0) 
R(0) 
S(14) ##############
T(0) 
U(0) 
V(0) 
W(0) 
X(0) 
Y(0) 
Z(0) 
==소문자:486==
a(19) ###################
b(13) #############
c(14) ##############
d(10) ##########
e(31) ###############################
f(7) #######
g(13) #############
h(3) ###
i(59) ###########################################################
j(1) #
k(3) ###
l(30) ##############################
m(5) #####
n(63) ###############################################################
o(25) #########################
p(15) ###############
q(0) 
r(41) #########################################
s(35) ###################################
t(58) ##########################################################
u(33) #################################
v(1) #
w(2) ##
x(1) #
y(4) ####
z(0) 
==숫자:55==
0(14) ##############
1(15) ###############
2(8) ########
3(4) ####
4(5) #####
5(5) #####
6(1) #
7(1) #
8(0) 
9(2) ##

 * */
















