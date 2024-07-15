const createCounter = (init) => {
    let curr = init;

    return {
        increment: () => ++curr,
        decrement: () => --curr,
        reset: () => {
            curr = init;
            return curr;
        }
    };
};

// Get user input for initial value
const init = parseInt(prompt("Enter the initial value for the counter:"), 10);
const counter = createCounter(init);

// Array of operations to perform
const operations = prompt("Enter operations (increment, decrement, reset) separated by commas:")
    .split(',')
    .map(op => op.trim());

const results = operations.map(op => {
    switch (op) {
        case "increment":
            return counter.increment();
        case "decrement":
            return counter.decrement();
        case "reset":
            return counter.reset();
        default:
            return "Invalid operation";
    }
});

console.log(results);
