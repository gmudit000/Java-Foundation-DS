package recursion_ques;

public class TowerOfHanoi {
	
	public static void towerofhanoi(int disks, char source, char aux, char destination) {
		
		// base case
		if(disks == 1) {
			System.out.println("Move 1 disks from " + source + " to " + destination);
			return;
		}
		
		towerofhanoi(disks-1, source, destination,aux);
		System.out.println("Move " + disks + " disks from " + source + " to " + destination);
		towerofhanoi(disks-1, aux, source,destination);
		
	}
	
	public static void main(String[] args) {
		towerofhanoi(4,'A','B','C');
	}

}
