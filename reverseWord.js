let str = 'This is a sunny day';

let reverseSentence = str => {
   let arr = str.split(" ");
   let reversed = arr.map(el => {
      return el.split('').reverse().join("");
   });
   return reversed.join(" ");
};
console.log(reverseSentence(str));
