// Step 1: Take input for the number of functions
const numberOfFunctions = parseInt(prompt("Enter the number of functions you want to compose:"), 10);

// Step 2: Define an array to hold the functions
const functions = [];

// Step 3: Take input for each function
for (let i = 0; i < numberOfFunctions; i++) {
    const functionInput = prompt(`Enter function ${i + 1} as a string. Use 'x' as the placeholder for the argument. Example: 'x * 2'`);
    const fn = new Function('x', `return ${functionInput};`);
    functions.push(fn);
}

// Provided compose function
const compose = function(functions) {
    if (functions.length === 0) {
        return function(x) {
            return x;
        };
    }
    return functions.reduceRight(function(prevFn, nextFn) {
        return function(x) {
            return nextFn(prevFn(x));
        };
    });
};

// Step 4: Take input for the initial value
const initialValue = parseFloat(prompt("Enter the initial value:"));

// Step 5: Compose the functions and apply the composed function to the initial value
const composedFunction = compose(functions);
const result = composedFunction(initialValue);

console.log("Composed Function Result:", result);
