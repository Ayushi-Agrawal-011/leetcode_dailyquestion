class Solution {
    public int buyChoco(int[] arr, int money) {
        Arrays.sort(arr);
        int a=arr[0];
        int b=arr[1];
        if(a+b<=money){
        return money-(a+b);
        }
        return money;
    }
}