static List<Integer> currLess(int[] nums){
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i] && j!=i){
                    count++;

                }
            }
            ans.add(count);

        }
        return (ans);
    }
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        System.out.println(currLess(nums));
    }
    }


