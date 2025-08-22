class Solution {
    public int minOperations(int[] arr, int k) {
       
        PriorityQueue<Integer> pq=new  PriorityQueue<>();
    for(int i=0;i<arr.length;i++) {
	pq.add(arr[i]);
}
int c=0;
while(pq.peek()<k){
int a=pq.poll();
if(a>=k){
pq.add(a);
}
else
c++;
}
return c;
    }
}