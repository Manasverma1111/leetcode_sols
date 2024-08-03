/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, depth) {
    const stack = [...arr.map(item => [item, depth])];
    const result = [];

    while (stack.length > 0) {
        const [item, n] = stack.pop();

        if (Array.isArray(item) && n > 0) {
            stack.push(...item.map(subItem => [subItem, n - 1]));
        } else {
            result.push(item);
        }
    }

    return result.reverse();
};

// Function to take input and display output
function getUserInputAndFlatten() {
    // Get the array input from the user as a string
    let arrayInput = prompt("Enter the multi-dimensional array in JSON format:");
    // Get the depth from the user
    let depthInput = prompt("Enter the depth to flatten the array:");

    // Parse the input JSON array
    let arr;
    let depth;
    try {
        arr = JSON.parse(arrayInput);
        depth = parseInt(depthInput, 10);
    } catch (error) {
        console.error("Invalid input. Please enter a valid JSON array and depth.");
        return;
    }

    // Call the flat function with the user input
    const flattenedArray = flat(arr, depth);

    // Display the result
    console.log("Flattened Array:", flattenedArray);
}

// Call the function to execute the code
getUserInputAndFlatten();
