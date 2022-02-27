public class temp{
	public static void main(String[] args) {
		int[] arr={6,8,3,9,2,7,1,0};

		int[] ans = mergeSort(arr,0,arr.length-1);

		for(int i:ans){
			System.out.print(i+",");
		}
	}

	static int[] mergeSort(int[] arr,int st,int ed){

		if(st==ed){
			int[] a1 = new int[1];
			a1[0] = arr[st];
			return a1;
		}

		int mid = (st+ed)/2;

		int[] ans1 = mergeSort(arr, st, mid);
		int[] ans2 = mergeSort(arr, mid+1,ed);

		int[] ans = merge(ans1,ans2);
		return ans;
	}

	static int[] merge(int[] ans1,int[] ans2){
		int i=0;
		int j=0;
		int k=0;
		int[] fans =new int[ans1.length + ans2.length];
		
		while(i<ans1.length && j<ans2.length){
			if(ans1[i]<ans2[j]){
				fans[k] = ans1[i];
				i++;
				k++;
			}else{
				fans[k++] = ans2[j++];
			}
			
		}

		while(i<ans1.length){
			fans[k++] = ans1[i++];
		}
		while(j<ans2.length){
			fans[k++] = ans2[j++];
		}

		return fans;

	}

}