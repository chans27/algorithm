const arr1 = [1,2,3,3,3,4]
const arr2 = [1,1,2,2]
const arr3 = [1]

const result = solution(arr1)
const result2 = solution(arr2)
const result3 = solution(arr3)

console.log(result)
console.log(result2)
console.log(result3)

function solution(array) {
  let answer = 0;
  let newArray = new Array(Math.max(...array)+1).fill(0);
  for(i=0; i<array.length;i++) {
    newArray[array[i]] += 1
  }

  if(newArray.indexOf(Math.max(...newArray)) !== newArray.lastIndexOf(Math.max(...newArray))) {
    return -1
  } else {
    return newArray.indexOf(Math.max(...newArray))
  }
}
