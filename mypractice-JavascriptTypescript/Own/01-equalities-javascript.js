'use strict';

let intNumber = 5;
let doubleNumber = 5.0;

//boolean equality = (normalNumber == stringNumber);
console.log(intNumber == doubleNumber); //true
console.log(intNumber === doubleNumber); //true
console.log(intNumber === 5); //true
console.log();

console.log(0 == '0'); //true
console.log(0 === '0'); //false
console.log();

console.log(0 == []); //true
console.log(0 === []); //false
console.log();

console.log('0' == []); //false
console.log('0' === []); //false
console.log();