public class Main{
	public static void main(String[] args){
		
		// varible
		int n = 5;
		
		// increasing triangle
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		// decreasing triangle
		for(int i = 1; i<=n; i++){
			for(int j = i; j<=n; j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		// right triangle
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=i; j++){
				System.out.print("  ");
			}
			for(int j = i; j<=n; j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		for(int i = 1; i<=n; i++){
			for(int j = i; j<=n; j++){
				System.out.print("  ");
			}
			for(int j = 1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		
		// Hill triangle
		for(int i = 1; i<=n; i++){
			for(int j = i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<i; j++) {
				System.out.print("* ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		
		}
		
		System.out.println();
		
		// reverse Hill triangle
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++ ) {
				System.out.print("  ");
			}
			for(int j = i; j<n; j++) {
				System.out.print("* ");	
			}
			for(int j = i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Diamond triangle
		for(int i = 1; i<n; i++){
			for(int j = i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<i; j++) {
				System.out.print("* ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++ ) {
				System.out.print("  ");
			}
			for(int j = i; j<n; j++) {
				System.out.print("* ");	
			}
			for(int j = i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
}
