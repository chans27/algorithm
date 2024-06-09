/**
 * 120869
 */
function solution(spell, dic) {
    let answer = 0;
    dic.map((v,i) => {
        v.split("").sort().join("") == spell.sort().join("") ? answer += 1 : answer
    })
    return answer > 0 ? 1 : 2;
}

let spell = ["p", "o", "s"];
let dic = ["sod", "eocd", "qixm", "adio", "soo"];
const result = solution(spell, dic);
console.log(result)