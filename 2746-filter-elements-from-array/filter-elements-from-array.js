/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let newarr=[];
    let j=0;
    arr.forEach((item,index)=>{
    if(fn(item,index)){
        newarr[j]=item;
        j++;
    }
    })
    return newarr;
};