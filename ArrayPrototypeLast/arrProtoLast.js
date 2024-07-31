// Extend the Array prototype to include the last method
Array.prototype.last = function() {
    if (this.length === 0) {
        return -1;
    } else {
        return this[this.length - 1];
    }
};

// Function to get input from the user and display the output
const getUserInputAndShowLastElement = () => {
    // Prompt the user for the array input
    let arrInput = prompt("Enter the array (e.g., [null, {}, 3]):");

    // Parse the array input as JSON
    let arr = JSON.parse(arrInput);

    // Call the last method and store the result
    let lastElement = arr.last();

    // Display the result using console.log
    console.log("Last element:", lastElement);

    // Display the result using alert
    alert("Last element: " + lastElement);
};

// Call the function to get input and display the last element
getUserInputAndShowLastElement();
