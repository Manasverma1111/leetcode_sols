var addTwoPromises = async function(promise1, promise2) {
    const [value1, value2] = await Promise.all([promise1, promise2]);
    return value1 + value2;
};

// Function to get user input and create promises
async function getUserInputAndAddPromises() {
    const input1 = parseInt(prompt("Enter the first number:"));
    const input2 = parseInt(prompt("Enter the second number:"));

    const promise1 = new Promise((resolve) => resolve(input1));
    const promise2 = new Promise((resolve) => resolve(input2));

    const result = await addTwoPromises(promise1, promise2);
    alert("The sum of the two numbers is: " + result);
}

// Call the function to get user input and add promises
getUserInputAndAddPromises();