function map(arr, fn) { //creating a custom map function
    const result = [];
    for (let i = 0; i < arr.length; i++) {
        result.push(fn(arr[i], i));
    }
    return result;
}

// Prompt the user for input
const arrInput = prompt("Enter an array of numbers, separated by commas:");
const fnInput = prompt("Enter the transformation function as a string, e.g., 'function(n, i) { return n + 1; }':");

// Convert the array input to an array of numbers
const arr = arrInput.split(',').map(Number);

// Create a new function from the input string
const fn = new Function('return ' + fnInput)();

// Use the custom map function
const result = map(arr, fn);

// Output the result
console.log(result);
alert("Transformed array: " + result.join(', '));