package week3;

public class Duplicates {
	public static void main(String args[]) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,17};
		int len=arr.length;
		for(int i =0;i<arr.length;i++) {
			int count =0;
        for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
        }
			if(count>0) {
				count =count+1;
				System.out.println(arr[i]+  "arrives" + count   +"times" );
				
			}
			}
		}
		
		
	}


