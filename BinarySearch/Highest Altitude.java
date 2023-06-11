public class mountain {
    public static void main(String[] args) {
        int[]gain={-4,-3,-2,-1,4,3,2};
        System.out.println(largestValue(gain));

    }
     static public int largestValue(int[]gain){
        int max=0;
        int current=0;
        for(int i=0;i<gain.length;i++){
            current+=gain[i];
            max=Math.max(current,max);
        }
        return max;
     }

}
