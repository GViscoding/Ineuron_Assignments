
public class Ineuronprnt {

	public static void main(String[] args) {	
		int n=11;
			for (int j=0;j<n;j++){
				
				//For I.
				for(int i=0;i<n;i++){
					if(j==0 && i<=(n-1)/2 || i==n/4|| j==n-1 && i<=(n-1)/2){ 
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.print(" ");
				
				//For N.
				for(int i=0;i<n;i++) {
					if(i==0 || i==n-1 || i==j) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}		
				}
				System.out.print(" ");
				
//				For E.
				for (int i=0;i<n;i++) {
					if(i==0 ||
							j==0 ||
							j==(n-1)/2 ||
							j==n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				
				//For U.
				for(int i=0;i<n;i++) {
					if(i==0 && j<n-1 || j==n-1 && i!=0 && i<n-1 || i==n-1 && j<n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				
				//For R.
				for (int i=0;i<n;i++) {
					if(i==0 || 
						j==0 && i<=(n-1)/2|| 
						i==(n-1)/2 && j<=(n-1)/2 || 
						j==(n-1)/2 && i<=(n-1)/2 ||
						j-i==(n-1)/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("");
				
				//For O.
				for (int i=0;i<n;i++) {
					if(i==0 && j!=0 && j!=n-1 || 
							i==(n-1) && j!=0 && j!=(n-1) ||
							j==0 && i>0 && i<(n-1) || j==(n-1) && i!=0 && i<(n-1) ) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				
				//For N.
				for (int i=0;i<n;i++) {
					if(i==0 || i==n-1 || i==j) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("                 ");
				
//				For writing My name i.e for Letter 'G'.
				for (int i=0;i<n;i++) {
					if(i>0 && j==0 || 
							i==0 && j!=0 && j!=n-1 || 
							j==n-1 && i>0 && i<(n-1)/2 ||
							i==(n-1)/2 && j>(n-1)/2 ||
							j==(n-1)/2 && i>=(n-1)/2 ||
							i==(n-1) && j>=(n-1)/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("   ");
				
//				For A.
				for (int i=0;i<n;i++) {
					if(i==0 && j!=0 || 
							j==0 && i!=0 && i!=(n-1) ||
							i==n-1 && j!=0 ||
							j==(n-1)/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				
//				For U.
				for (int i=0;i<n;i++) {
					if(i==0 && j<n-1 || j==n-1 && i!=0 && i<n-1 || i==n-1 && j<n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				
//				For T.
				for (int i=0;i<n;i++) {
					if(j==0 || i==(n-1)/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				
//				For A.
				for (int i=0;i<n;i++) {
					if(i==0 && j!=0 || 
							j==0 && i!=0 && i!=(n-1) ||
							i==n-1 && j!=0 ||
							j==(n-1)/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				
//				For M.
				for (int i=0;i<n;i++) {
					if(i==0 && j!=0 || 
							i==n-1 && j!=0 ||
							i==j && i<(n-1)/2 && j<(n-1)/2 ||
							i+j==n-1 && j<=(n-1)/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
			
			System.out.println();	
			
			}
		}
	}
