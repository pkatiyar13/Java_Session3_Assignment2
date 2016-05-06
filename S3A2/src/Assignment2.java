import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		int p=0;
		System.out.println("Please Enter Number: ");
		num = scan.nextInt();
		for(int i=2;i<num;i++){
			if(num%i==0){
				System.out.println(num+" is not Prime Number");
				p=0;
				break;
			}
			p=1;
		}
		if(p==1)
			System.out.println(num+" is Prime Number");
			
	}

}
