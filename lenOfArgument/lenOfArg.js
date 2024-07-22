var argumentsLength = function(...args) {
    return args.length;
};

// Take input from the user
var userInput = prompt("Enter arguments separated by commas:");

// Split the input string into an array
var argsArray = userInput.split(',');

// Call the function with the user input and display the result
alert("Number of arguments: " + argumentsLength(...argsArray));