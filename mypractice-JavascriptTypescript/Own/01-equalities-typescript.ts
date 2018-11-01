let intNumber = 5;
let doubleNumber = 5.0;

//boolean equality = (normalNumber == stringNumber);
console.log(intNumber == doubleNumber); //true
console.log(intNumber === doubleNumber); //true
console.log(intNumber === 5); //true
console.log();

console.log(NaN == undefined); //false
console.log(NaN == null); //false

// console.log(0 == '0');  //mindig false, mivel typescript típusos, JS-ben true
// console.log(0 == []);   //mindig false, mivel typescript típusos, JS-ben true
// console.log('0' == []); //mindig false, mivel typescript típusos, JS-ben false

//TL;DR: JS-ben, lehet szórakozni a 2 és 3 egyenlőségjellel, hogy egyes állítások true vagy false legyen,
//de TS teljesen típusos.