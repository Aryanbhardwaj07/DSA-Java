static void swap(int[] arr, int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,5,6,7,8,9};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
        }
}
*******************Reverse the Array Using swap function above***********
public class question {
    static void swap(int[] arr, int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        }
        
}
