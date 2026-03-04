/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const newarr=[];
    arr.forEach((item,index)=>{
        newarr[index]=fn(item,index);
    })
    return newarr;
};