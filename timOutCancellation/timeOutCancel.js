var cancellable = function(fn, args, t) {
    const cancelFn = function() {
        clearTimeout(timer);
    };
    const timer = setTimeout(() => {
        fn(...args);
    }, t);
    return cancelFn;
};

// Example function to be passed to cancellable
function exampleFunction(...args) {
    alert("Function executed with arguments: " + args.join(", "));
}

// Function to get user input and call the cancellable function
function getUserInputAndCancellable() {
    const argsInput = prompt("Enter the arguments for the function (comma separated):");
    const args = argsInput.split(',').map(arg => arg.trim());

    const t = parseInt(prompt("Enter the delay time in milliseconds:"));
    if (isNaN(t) || t < 0) {
        alert("Please enter a valid non-negative number.");
        return;
    }

    const cancelFn = cancellable(exampleFunction, args, t);

    const shouldCancel = confirm("Do you want to cancel the execution?");
    if (shouldCancel) {
        cancelFn();
        alert("Function execution cancelled.");
    }
}

// Call the function to get user input and set up cancellable function
getUserInputAndCancellable();