//print prime number as per users demand
import java.util.*; 

class prime{

	public static void main(String[] args) {
		
		
		System.out.println("enter no of prime numbers");

		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		
		int [] a=new int [10];

		a[0]=2;
		int i,j,k,flag;

		for (i=3,k=0; k<num ;i++ ) {
			
			flag=0;

			for (j=2; j<i ;j++ ) {
					
				if(i%j==0){

					flag=1;
					break;


				}


			}

			if(flag==0){
				a[++k]=i;
				System.out.println(a[k]);
			}
			
		}






		






	}
}