
public class Prntnumpattern {

	public static void main(String[] args) {
		int n=11;
		for (int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				if(i>0 && i<5 && j<4){ 
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			}
		}

	}


