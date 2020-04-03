package 数组;

public class 水仙花数 {

		 public static void main(String[] args) {
		  flowers();
		 }
		
		 static void flowers() {
				
				for(int i=0;i<1000;i++) {
					int m=i/100;//取百位
					int n=i/10%10;//取十位
					int g=i%10;//取个位
					if(m*m*m+n*n*n+g*g*g==i) {
						System.out.println(i);
					}
				}
			}
}
