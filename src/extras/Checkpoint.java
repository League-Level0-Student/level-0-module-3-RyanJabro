package extras;

public class Checkpoint {
public static void main(String [] args) {
	int number = 0;
	for(number = 0; number < 500; number++) {
		if(number%2 == 1) {
			System.out.println(number);
		}
	}
	
	int potatoNumber = 1;
	
	for(potatoNumber = 1; potatoNumber < 8; potatoNumber++) {
		if(potatoNumber != 4) {
			System.out.print(potatoNumber + " potato ");
		}
		else {
			System.out.print("4 ");
		}
	}
	System.out.print("more");
}
}
