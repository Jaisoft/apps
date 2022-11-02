// Create a Set
const letters = new Set(["a","b","c"])

// List all Elements
let text = ""

letters.forEach (function(value) {
  text += value + "\n"
})

console.log(text)
