
class Solution {
    public long numberOfWeeks(int[] nums) {
long sum = Arrays.stream(nums).asLongStream().sum();
long max=Arrays.stream(nums).max().getAsInt();
long rest=sum-max;
return Math.min(sum,2*rest+1);
    }
}