// Step 1: Take input for the array
const arrayInput = prompt("Enter the array elements separated by commas:");
const arr = arrayInput.split(',').map(Number);

// Step 2: Define a filtering function based on user input
const filterCondition = prompt("Enter the filtering condition. Use 'x' as the placeholder for the array element. Example: 'x > 5'");

// Convert the filter condition string to a function
const fn = new Function('x', 'i', `return ${filterCondition};`);

// Step 3: Manually filter the array without using the provided filter function
const newArray = [];
for (let i = 0; i < arr.length; i++) {
    if (fn(arr[i], i)) {
        newArray.push(arr[i]);
    }
}

console.log("Filtered Array:", newArray);
