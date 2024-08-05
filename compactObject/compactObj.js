function compactObject(obj) {
    if (obj === null) {
        return null;
    } else if (Array.isArray(obj)) {
        return obj.filter(Boolean).map(compactObject);
    } else if (typeof obj !== "object") {
        return obj;
    }

    const compacted = {};
    for (const key in obj) {
        let value = compactObject(obj[key]);
        if (value) compacted[key] = value;
    }
    return compacted;
}

// Take input from the user
const userInput = prompt("Enter a JSON string:");

// Parse the input to create a JavaScript object
let obj;
try {
    obj = JSON.parse(userInput);
} catch (e) {
    console.error("Invalid JSON input.");
}

// Process the object with the compactObject function
const result = compactObject(obj);

// Display the output
console.log("Output:", JSON.stringify(result));
