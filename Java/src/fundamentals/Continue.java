package fundamentals;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		while(i < 5) {
//		    if(i == 3) {
//		        continue;
//		    }
//		    System.out.print(i + " ");
//		    i++;
//		}

//		int i = 1;
//		while(i < 3) {
//		    int j = 1;
//		    while(j < 5) {
//		        if(j == 3) {
//		            break;
//		        }
//		        System.out.print(j + " ");
//		        j++;
//		    }
//		    i++;
//		}
		
		int i = 1;
		while(i < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            continue;
		        }
		        System.out.print(j + " ");
		    }
		    i++;
		}
	}

}
