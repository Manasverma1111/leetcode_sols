const readline = require('readline');

//Run in Terminal using NODE.JS
class Calculator {
    constructor(value) {
        this.result = value;
    }

    add(value) {
        this.result += value;
        return this;
    }

    subtract(value) {
        this.result -= value;
        return this;
    }

    multiply(value) {
        this.result *= value;
        return this;
    }

    divide(value) {
        if (value === 0) {
            throw new Error("Division by zero is not allowed");
        }
        this.result /= value;
        return this;
    }

    power(value) {
        this.result **= value;
        return this;
    }

    getResult() {
        return this.result;
    }
}

// Setup for reading user input
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Function to process the input and execute the calculator actions
function processInput(actions, values) {
    try {
        let calculator = new Calculator(values[0]);

        for (let i = 1; i < actions.length; i++) {
            if (actions[i] !== "getResult") {
                calculator = calculator[actions[i]](values[i]);
            } else {
                console.log(`Output: ${calculator.getResult()}`);
            }
        }
    } catch (error) {
        console.log(`Output: ${error.message}`);
    }
}

// Function to get input from the user
function getInputAndOperate() {
    rl.question('Enter actions (comma-separated): ', (actionInput) => {
        const actions = actionInput.split(',').map(action => action.trim());

        rl.question('Enter values (comma-separated): ', (valueInput) => {
            const values = valueInput.split(',').map(Number);

            processInput(actions, values);
            rl.close();
        });
    });
}

// Run the function to get input and display output
getInputAndOperate();
