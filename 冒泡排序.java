package ����;

public class ð������ {

		 public static void main(String[] args) {
		  test1();
		  
		 }
		 static void test1() {
		  //ð������
		  int[] x = { 7, 3, 2, 4, 5, 6, 8, 9, 10 };// ��С����
		  int temp;
		  for (int i = 0; i < x.length - 1; i++) {
		   for (int j = 0; j < x.length - 1 - i; j++) {
		    if (x[j] > x[j + 1]) {
		     temp = x[j];
		     x[j] = x[j + 1];
		     x[j + 1] = temp;
		    }
		   }
		  }
		  for (int i = 0; i < x.length - 1; i++) {
		   System.out.println(x[i]);
		  }
		 }
		

}
