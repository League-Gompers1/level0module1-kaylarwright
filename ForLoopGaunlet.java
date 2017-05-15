
public class ForLoopGaunlet {
public static void main(String[] args) {
	for(int k = 0; k <= 10; k = k + 1){
		System.out.print(k + " ");
		if(k % 2 == 0){
			System.out.println("even");
		}else{
			System.out.println("odd");
		}
	}
}
}

