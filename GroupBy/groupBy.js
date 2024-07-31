// Extend the Array prototype to include the groupBy method
Array.prototype.groupBy = function(fn) {
    return this.reduce((grouped, item) => {
      const key = fn(item);
      if (!grouped[key]) {
        grouped[key] = [];
      }
      grouped[key].push(item);
      return grouped;
    }, {});
  };
  
  // Function to get input from the user and display the grouped output
  const getUserInputAndGroupBy = () => {
    // Prompt the user for the array input
    let arrInput = prompt("Enter the array (e.g., [{\"id\":\"1\"}, {\"id\":\"1\"}, {\"id\":\"2\"}]):");
  
    // Prompt the user for the function definition
    let fnInput = prompt("Enter the function definition (e.g., function (item) { return item.id; }):");
  
    // Parse the array input as JSON
    let arr = JSON.parse(arrInput);
  
    // Convert the function input into an actual function
    let fn = new Function('return ' + fnInput)();
  
    // Call the groupBy method and store the result
    let groupedResult = arr.groupBy(fn);
  
    // Display the result using console.log
    console.log("Grouped Result:", groupedResult);
  
    // Display the result using alert
    alert("Grouped Result: " + JSON.stringify(groupedResult));
  };
  
  // Call the function to get input and display the grouped output
  getUserInputAndGroupBy();
  