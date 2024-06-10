/**
 * 120907
 */
function solution(quiz) {
  var answer = [];
  var str = quiz.join(",").split(",").map(v =>
    eval(v.split("=")[0]) == v.split("=")[1].trim()
      ? answer.push("O")
      : answer.push("X")
  )
  return answer;
}

const quiz = ["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"];
const result = solution(quiz)
console.log("result: ", result)
