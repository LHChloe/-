package ����;

public class ˮ�ɻ��� {

		 public static void main(String[] args) {
		  flowers();
		 }
		
		 static void flowers() {
				
				for(int i=0;i<1000;i++) {
					int m=i/100;//ȡ��λ
					int n=i/10%10;//ȡʮλ
					int g=i%10;//ȡ��λ
					if(m*m*m+n*n*n+g*g*g==i) {
						System.out.println(i);
					}
				}
			}
}
