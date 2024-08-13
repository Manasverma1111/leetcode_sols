const readline = require('readline');

//Run it in Terminal using NODE.JS

// ArrayWrapper class definition
var ArrayWrapper = function(nums) {
    this.nums = nums;
};

ArrayWrapper.prototype.valueOf = function() {
    return this.nums.reduce((sum, num) => sum + num, 0);
};

ArrayWrapper.prototype.toString = function() {
    return `[${this.nums.join(',')}]`;
};

// Setup for reading user input
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Function to take input, create ArrayWrapper objects, and perform operations
function getInputAndOperate() {
    rl.question('Enter the first array (comma-separated integers): ', (input1) => {
        const nums1 = input1.split(',').map(Number);
        const obj1 = new ArrayWrapper(nums1);

        rl.question('Enter the second array (comma-separated integers): ', (input2) => {
            const nums2 = input2.split(',').map(Number);
            const obj2 = new ArrayWrapper(nums2);

            rl.question('Choose an operation ("Add" or "String"): ', (operation) => {
                if (operation === 'Add') {
                    console.log(`Result of obj1 + obj2: ${obj1 + obj2}`);
                } else if (operation === 'String') {
                    console.log(`Result of String(obj1): ${String(obj1)}`);
                    console.log(`Result of String(obj2): ${String(obj2)}`);
                } else {
                    console.log('Invalid operation!');
                }

                rl.close();
            });
        });
    });
}

// Run the function to get input and display output
getInputAndOperate();
