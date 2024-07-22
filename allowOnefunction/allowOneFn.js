var once = function(fn) {
    let called = false;
    let result;

    return function(...args) {
        if (!called) {
            result = fn(...args);
            called = true;
            return result;
        } else {
            return undefined;
        }
    };
};

// Example functions that can be passed to once
function add(a, b) {
    return a + b;
}

function multiply(a, b) {
    return a * b;
}

// Prompt user for function selection
var functionName = prompt("Enter the function name (add/multiply):");

// Prompt user for arguments
var userInput = prompt("Enter arguments separated by commas:");

// Convert input string to an array
var argsArray = userInput.split(',').map(Number);

// Select the function based on user input
var selectedFunction;
if (functionName === "add") {
    selectedFunction = add;
} else if (functionName === "multiply") {
    selectedFunction = multiply;
} else {
    alert("Invalid function name");
}

// Wrap the selected function with the once function
if (selectedFunction) {
    var onceFunction = once(selectedFunction);

    // Call the once function with user arguments and display the result
    alert("First call result: " + onceFunction(...argsArray));
    alert("Second call result: " + onceFunction(...argsArray));
};