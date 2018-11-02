// -  Create (dynamically*) a two dimensional list
//    with the following matrix**. Use a loop!
//
//    0 0 0 1
//    0 0 1 0
//    0 1 0 0
//    1 0 0 0
//
// -  Print this two dimensional list to the console
//
// * size should depend on a variable
// ** Relax, a matrix is just like an array

let size: number = 4;
let matrix: any[] = [];

for(let i: number = 0; i < size; i++) {
    matrix[i] = [];
    for(let j: number = 0; j < size; j++) {
        if (size == (i + j + 1)) {  // azért +1, mert array-ek 0-tól indexelődnek
            matrix[i][j] = 1;
        } else {
            matrix[i][j] = 0;
        }
    }
}
console.log(matrix);

let matrix2 = [
    [0, 0, 0, 1],
    [0, 0, 1, 0],
    [0, 1, 0, 0],
    [1, 0, 0, 0]
]

console.log(matrix2);