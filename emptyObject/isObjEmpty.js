const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  });
  
  /**
   * @param {Object|Array} obj
   * @return {boolean}
   */
  var isEmpty = function(obj) {
      for (const _ in obj)
      return false;
      return true;
  };
  
  readline.question('Please enter an object or array in JSON format: ', input => {
    let parsedInput;
  
    try {
      parsedInput = JSON.parse(input);
    } catch (error) {
      console.log('Invalid JSON format. Please try again.');
      readline.close();
      return;
    }
  
    const result = isEmpty(parsedInput);
    console.log('Is the input empty?', result);
    readline.close();
  });
  