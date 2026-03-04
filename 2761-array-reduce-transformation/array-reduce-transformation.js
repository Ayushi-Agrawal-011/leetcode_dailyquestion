/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(arr, fn, init) {
if(arr.length==0)
return init;
    let ans=0;
    arr.forEach((item,index)=>{
    if(index!=0){
       ans=fn(ans,item);
    }
    else
    ans=fn(init,item);
    })
    return ans;
};