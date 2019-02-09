// -  Create variable named `name` and assign the value `Greenfox` to it
// -  Create a function called `greet` that greets it's input parameter
//     -  Greeting is printing e.g. `Greetings, dear Greenfox`
//     -  Prepare for the special case when no parameters are given
// -  Greet `name`

'use strict'

let yourName: String = "Greenfox";
console.log(greet(), yourName + "!");

function greet() {
    let greetings: String = "Greetings, dear";
    return greetings;
}