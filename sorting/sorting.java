import java.util.*;

public class sorting {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        display(arr);
    }
    static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int p1=i-1;
            int temp=arr[i];
            while(p1>=0 && temp<arr[p1]){
                arr[p1+1]=arr[p1];
                p1--;
            }
            arr[p1+1]=temp;
        }
        
        display(arr);
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            int pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<temp){
                    temp=arr[j];
                    pos=j;
                }
                swap(arr,i,pos);
            }
        }
        display(arr);
    }
    static int[] mergeSort(int[] arr,int str,int last){
        
        if(str==last){
            int[] ans=new int[1];
            ans[0]=arr[str];
            return ans;
        }
        int mid = (str+last)/2;
        int[] fs=mergeSort(arr,str,mid);
        int[] ss=mergeSort(arr, mid+1, last);
        int[] fsa = mergeTwoSortedArray(fs,ss);
        return fsa;                
    }
    static int[] mergeTwoSortedArray(int[] fs,int[] ss){
        int fsl=fs.length;
        int ssl=ss.length;
        // System.out.println(fsl);
        // System.out.println(ssl);
        int[] fsa=new int[fsl+ssl];
        int i=0; int j=0; int k=0;
        while(i<fsl && j<ssl){
            if(fs[i]>=ss[j]){
                fsa[k]=ss[j];
                j++; k++;
            }else{
                fsa[k]=fs[i];
                k++; i++;
            }
        }
        // System.out.println(Arrays.toString(fsa));
        while(i<fsl){
            fsa[k]=fs[i];
            k++; i++;
        }
        while(j<ssl){
            fsa[k]=ss[j];
            j++; k++;
        }
        
        return fsa;
        
    }
    // static int[] heapSort(int[] arr){
        //     int[] ans=new int[arr.length];
        //     heapify(arr);
        //     int 
        // }
    static int[] countSort(int[] arr){
            int max=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
        int[] count_arr=new int[max+1];
        int[] pos=new int[max+1];
        int[] ans=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            count_arr[arr[i]]++;
        }
        int prevCount=0;
        for(int i=0;i<=max;i++){
            pos[i]=prevCount+count_arr[i];
            prevCount=pos[i];
        }
        
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            pos[temp]--;
            ans[pos[temp]]=temp;
        }
        
        return ans;
    }

    static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    
    public static void main(String[] args){
        System.out.print("Enter no of Element want to sort : ");
        Scanner sc=new Scanner(System.in);
        
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     System.out.print("Enter element "+ (i+1)+" to sort : ");
        //     arr[i]=sc.nextInt();
        // }
        int[] arr={1,4,1,2,7,5,2};
        System.out.print("Bubble sort ");
        bubbleSort(arr);
        System.out.print("\nInsertion sort ");
        insertionSort(arr);
        System.out.print("\nSelection sort ");
        selectionSort(arr);
        System.out.print("\nMerge sort ");
        int[] ans=mergeSort(arr, 0, arr.length-1);
        
        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.print("\ncount sort ");
        int[] ans1=countSort(arr);
        for(int i:ans1){
            System.out.print(i+" ");
        }
        // System.out.println(Arrays.toString(mergeTwoSortedArray(arr, brr)));
       
    }
}
