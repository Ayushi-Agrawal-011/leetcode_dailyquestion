/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    let ans=0;
 return   promise1.then((x)=>{
ans+=x;
return promise2;
    })
    .then((y)=>{
        ans+=y;
        return ans;
    })
    .catch((e)=>{
        return 0;
    })
    return ans;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */