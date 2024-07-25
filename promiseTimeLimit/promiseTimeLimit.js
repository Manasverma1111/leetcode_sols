/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    return async function(...args) {
        const originalFnPromise = fn(...args);

        const timeoutPromise = new Promise((_, reject) => {
            setTimeout(() => {
                reject("Time Limit Exceeded");
            }, t);
        });
        return Promise.race([originalFnPromise, timeoutPromise]);
    };
};

// Example function that returns a promise
function exampleFunction(t) {
    return new Promise(res => setTimeout(res, t));
}

// Get user input
let executionTime = parseInt(prompt("Enter the function execution time in milliseconds:"), 10);
let timeLimitValue = parseInt(prompt("Enter the time limit in milliseconds:"), 10);

// Apply the timeLimit function
const limited = timeLimit(exampleFunction, timeLimitValue);

// Execute the function with the user's input
limited(executionTime).then(() => {
    console.log('Function executed within time limit');
}).catch(console.log); // Will catch and log "Time Limit Exceeded" if the time limit is exceeded
