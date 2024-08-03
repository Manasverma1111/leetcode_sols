/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
const sortBy = function(arr, fn) {
    return arr.sort((a, b) => fn(a) - fn(b));
};

// Example usage:
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// RUN THE CODE:
//Open a terminal and navigate to the directory where the file is saved.
//Run the script using Node.js by typing node sortArray.js

rl.question('Enter the array: ', (inputArr) => {
    rl.question('Enter the function (as a string): ', (inputFn) => {
        // Parse the input array
        const arr = JSON.parse(inputArr);
        // Create a new function from the input string
        const fn = new Function('return ' + inputFn)();
        // Sort the array using the function
        const sortedArr = sortBy(arr, fn);
        // Display the sorted array
        console.log('Sorted Array:', sortedArr);
        rl.close();
    });
});

//$ node sortArray.js
// Enter the array: [5, 4, 1, 2, 3]
// Enter the function (as a string): (x) => x
// Sorted Array: [ 1, 2, 3, 4, 5 ]

