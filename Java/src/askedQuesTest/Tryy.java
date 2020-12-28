package askedQuesTest;

public class Tryy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status = true;
		int arr[] = {100,69,50,8,5,33,22,11,4,3,1};
		for(int i =0,j=i+1; i<arr.length && j<arr.length; i++,j++) {
			if(!(arr[i] > arr[j] || arr[i] < arr[j])) {
			status = false;
			}
		}
		System.out.println(status);
	}
}