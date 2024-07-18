// Step 1: Take input for the array
const arrayInput = prompt("Enter the array elements separated by commas:");
const nums = arrayInput.split(',').map(Number);

// Step 2: Define a reducing function based on user input
const reduceFunction = prompt("Enter the reducing function. Use 'acc' for accumulator and 'curr' for current element. Example: 'acc + curr'");

// Step 3: Take input for the initial value
const init = parseFloat(prompt("Enter the initial value:"));

// Convert the reduce function string to a function
const fn = new Function('acc', 'curr', `return ${reduceFunction};`);

// Step 4: Manually perform the reduction operation without using the provided reduce function
let val = init;
for (let i = 0; i < nums.length; i++) {
    val = fn(val, nums[i]);
}

console.log("Reduced Value:", val);
