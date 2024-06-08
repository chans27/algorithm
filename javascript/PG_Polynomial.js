/**
 * 120863
 * @param polynomial
 * @returns {string}
 */
function solution(polynomial) {
  let arr = polynomial.replace(/ /g,"").split("+");
  let x = 0;
  let num = 0;
  arr.map((v,i) => {
    arr[i].includes("x")
      ?  v === "x"
        ? x += 1
        : x += parseInt(arr[i].split("x")[0])
      : num += parseInt(v)
  })
  if(x===0) return String(num);
  if(x===1 && num === 0) return 'x'
  if(x===1 && num > 0) return 'x ' + '+ ' + num;
  if(x>1 && num === 0) return x + 'x';
  if(x>1 && num >0) return x + 'x ' + '+ ' + String(num);
}
