function myFunction(a, b) {
  return arguments.length;
}
console.log(myFunction(2,4))


function myFunction(a, b) {
  return a * b;
}

let text = myFunction.toString(); 

console.log(text) 
