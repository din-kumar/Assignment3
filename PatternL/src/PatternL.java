public class PatternL {

	public static void main(String[] args) {
		
		for(int i = 0; i< 5; i++) {
			System.out.println();
			for(int j= 0;j<5;j++) {
				System.out.print("*");
				if(i<4) {
					break;
				}
				
			}
		}
		
		
	}

}