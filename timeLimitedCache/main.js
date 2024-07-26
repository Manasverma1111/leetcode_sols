const readline = require('readline');
const TimeLimitedCache = require('./cacheTimeLimited');

const cache = new TimeLimitedCache();

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const askForAction = () => {
    rl.question('Choose an action (set, get, count, exit): ', action => {
        if (action === 'set') {
            rl.question('Enter key: ', key => {
                rl.question('Enter value: ', value => {
                    rl.question('Enter duration (ms): ', duration => {
                        const found = cache.set(key, value, parseInt(duration));
                        console.log(`Set operation completed. Key was ${found ? 'updated' : 'added'}.`);
                        askForAction();
                    });
                });
            });
        } else if (action === 'get') {
            rl.question('Enter key: ', key => {
                const value = cache.get(key);
                console.log(`Get operation completed. Value: ${value}`);
                askForAction();
            });
        } else if (action === 'count') {
            console.log(`Count operation completed. Number of items in cache: ${cache.count()}`);
            askForAction();
        } else if (action === 'exit') {
            console.log('Exiting...');
            rl.close();
        } else {
            console.log('Invalid action. Please choose set, get, count, or exit.');
            askForAction();
        }
    });
};

askForAction();
