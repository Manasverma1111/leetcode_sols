const chunk = function(arr, size) {
    const chunkedArray = [];
    for (let i = 0; i < arr.length; i += size) {
        chunkedArray.push(arr.slice(i, i + size));
    }
    return chunkedArray;
};

// Function to get input from the user and call the chunk function
const getUserInputAndChunk = () => {
    // Prompt the user for the array and size
    let arrInput = prompt("Enter the array (e.g., [1,2,3,4,5]):");
    let sizeInput = prompt("Enter the chunk size:");

    // Parse the array input as JSON
    let arr = JSON.parse(arrInput);

    // Convert size input to a number
    let size = parseInt(sizeInput, 10);

    // Call the chunk function and log the result
    let chunkedArr = chunk(arr, size);
    console.log(chunkedArr);
};

// Call the function to get input and display the chunked array
getUserInputAndChunk();
