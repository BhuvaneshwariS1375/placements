package placement;

public class snake_pattern {
	public static void main(String[] args) {
		int [][] arr = {
				{1,2,3},
				{6,5,4},
				{7,8,9}			
		};
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int j=arr[i].length-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}

}
