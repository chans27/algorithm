function solution(denum1, num1, denum2, num2) {
    let top = num1*denum2 + num2*denum1
    let bottom = num1*num2
    let devide = 1
    for(let i = 1 ; i <= top ; i ++) {
        if(top%i === 0 && bottom%i === 0) {
            devide = i
        }
    }
    return [top/devide, bottom/devide]
}

//const result = solution(1,2,3,4)
const result = solution(9,2,1,3)
console.log(result);