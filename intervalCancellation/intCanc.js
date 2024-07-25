var cancellable = function(fn, args, t) {
    fn(...args);
    let timer = setInterval(() => fn(...args), t);

    let cancelFn = () => clearInterval(timer);
    return cancelFn;
};

// Example function to use with cancellable
function exampleFunction(...args) {
    console.log('Function called with arguments:', ...args);
}

// Get user input
let functionArgs = prompt("Enter arguments for the function (comma-separated):").split(',');
let intervalTime = parseInt(prompt("Enter the interval time in milliseconds:"), 10);

// Call the cancellable function
let cancelExample = cancellable(exampleFunction, functionArgs, intervalTime);

// You can cancel the interval by calling cancelExample
// For demonstration, cancel after 10 seconds
setTimeout(() => {
    cancelExample();
    console.log('Interval cancelled');
}, 10000);
