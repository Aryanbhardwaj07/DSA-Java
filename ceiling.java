public class ceiling {
    static int ceiling (int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target>arr.length-1){return -1;}
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;

            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,6,7,23,45,67,69};
        int target=24;
        System.out.println(ceiling(arr,target));
    }
}