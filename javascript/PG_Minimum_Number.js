function solution(arr) {
  var min = Math.min(...arr)
  var answer = arr.filter(v => v !== min)
  if(answer.length === 0) return [-1]
  return answer;
}

//const arr = [10];
const arr = [4,3,2,1];
console.log(solution(arr));
