const readline = require('readline');
const debounce = require('./debounce');

// Create an instance of readline
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Debounced log function
const debouncedLog = debounce((message) => {
    console.log(`Logged after debounce: ${message}`);
}, 1000);  // Change the debounce delay as needed

const askForInput = () => {
    rl.question('Enter a message (or type "exit" to quit): ', (message) => {
        if (message.toLowerCase() === 'exit') {
            console.log('Exiting...');
            rl.close();
        } else {
            debouncedLog(message);
            askForInput();
        }
    });
};

askForInput();
