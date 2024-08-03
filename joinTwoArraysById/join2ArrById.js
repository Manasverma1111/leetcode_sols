/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
function join(arr1, arr2) {
    const result = {};
    
    // Process arr1
    for (let i = 0; i < arr1.length; i++) {
        result[arr1[i].id] = arr1[i];
    }
    
    // Process arr2 and merge if necessary
    for (let i = 0; i < arr2.length; i++) {
        if (result[arr2[i].id]) {
            // Merge objects, arr2 overrides arr1
            for (const key in arr2[i]) {
                result[arr2[i].id][key] = arr2[i][key];
            }
        } else {
            result[arr2[i].id] = arr2[i];
        }
    }

    // Convert the result object back into an array and sort by id
    return Object.values(result).sort((a, b) => a.id - b.id);
}

// Example usage:

// Take input from the user
const arr1 = JSON.parse(prompt("Enter the first array in JSON format:"));
const arr2 = JSON.parse(prompt("Enter the second array in JSON format:"));

// Call the join function with user input and display the output
const joinedArray = join(arr1, arr2);
console.log("Resulting Merged Array:", joinedArray);

// When prompted, enter the arrays in JSON format. For example:
// For arr1: [{"id": 1, "x": 1}, {"id": 2, "x": 9}]
// For arr2: [{"id": 3, "x": 5}]
