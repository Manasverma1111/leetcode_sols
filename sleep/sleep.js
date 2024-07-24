async function sleep(millis) {
    return new Promise(delay => setTimeout(delay, millis));
}

// Function to get user input and call the sleep function
async function getUserInputAndSleep() {
    const millis = parseInt(prompt("Enter the number of milliseconds to sleep:"));
    if (isNaN(millis) || millis < 0) {
        alert("Please enter a valid non-negative number.");
        return;
    }

    alert("Starting the sleep...");
    await sleep(millis);
    alert("Sleep finished after " + millis + " milliseconds.");
}

// Call the function to get user input and sleep
getUserInputAndSleep();