const expect = function(val) {
    return {
        toBe: (val2) => {
            if (val !== val2) {
                throw new Error("Not Equal");
            } else {
                return true;
            }
        },
        notToBe: (val2) => {
            if (val === val2) {
                throw new Error("Equal");
            } else {
                return true;
            }
        }
    };
};

// Function to execute user input and return structured output
const executeExpect = (inputFunc) => {
    try {
        const result = inputFunc();
        return { value: result };
    } catch (error) {
        return { error: error.message };
    }
};

// Get user input
const userInput = prompt("Enter a comparison (e.g., 'expect(5).toBe(5)', 'expect(5).notToBe(null)'):");

// Create a function from user input
const func = new Function(`return ${userInput}`);

// Execute the function and log the result
const output = executeExpect(func);
console.log(JSON.stringify(output));
