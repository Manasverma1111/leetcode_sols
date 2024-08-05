class EventEmitter {
    constructor(){
        this.events = new Map();
    }

    subscribe(event, callback) {
        if (!this.events.has(event)){
            this.events.set(event, []);
        }

        const listeners = this.events.get(event);
        listeners.push(callback);

        return {
            unsubscribe: () => {
                const index = listeners.indexOf(callback);
                if(index !== -1){
                    listeners.splice(index, 1);
                }
            }
        };
    }

    emit(event, args = []) {
        if(!this.events.has(event)){
            return [];
        }
        const listeners = this.events.get(event);
        const results = [];

        for(const listener of listeners){
            results.push(listener(...args));
        }
        return results;
    }
}

// Creating an EventEmitter instance
const emitter = new EventEmitter();

while (true) {
    const action = prompt("Enter an action (subscribe, emit, unsubscribe, or exit):");

    if (action === "exit") {
        break;
    }

    switch(action) {
        case "subscribe":
            const eventName = prompt("Enter the event name:");
            const callbackString = prompt("Enter the callback function as a string:");
            const callback = new Function("return " + callbackString)(); // Caution: using new Function can be unsafe
            emitter.subscribe(eventName, callback);
            console.log(`Subscribed to event "${eventName}" with the given callback.`);
            break;
        
        case "emit":
            const emitEvent = prompt("Enter the event name to emit:");
            const argsString = prompt("Enter the arguments as a JSON array:");
            let args = [];
            try {
                args = JSON.parse(argsString);
            } catch (e) {
                console.error("Invalid JSON array for arguments.");
            }
            const results = emitter.emit(emitEvent, args);
            console.log(`Emitted event "${emitEvent}" with arguments ${argsString}. Results:`, results);
            break;

        case "unsubscribe":
            const unsubEvent = prompt("Enter the event name to unsubscribe:");
            const unsubIndex = parseInt(prompt("Enter the index of the subscription to remove:"), 10);
            if (!isNaN(unsubIndex)) {
                const subscriptions = emitter.events.get(unsubEvent) || [];
                if (unsubIndex < subscriptions.length) {
                    const subscription = subscriptions[unsubIndex];
                    subscription.unsubscribe();
                    console.log(`Unsubscribed from event "${unsubEvent}" at index ${unsubIndex}.`);
                } else {
                    console.log(`No subscription found at index ${unsubIndex} for event "${unsubEvent}".`);
                }
            } else {
                console.error("Invalid index.");
            }
            break;

        default:
            console.log("Invalid action. Please enter subscribe, emit, unsubscribe, or exit.");
    }
}

console.log("Exiting the EventEmitter interaction.");
