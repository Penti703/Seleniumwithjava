package array.com;

public class RandomMathMultiDymention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[][]=new int[3][4];
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<4 ; j++) {
				
				num[i][j]=(int)(Math.random()*10);
				System.out.print(num[i][j]+" ");
				}System.out.println();
			}System.out.println();
		

	}

}
