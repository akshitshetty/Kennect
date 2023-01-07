function main() {
    var companyName = 'Honda'; // name is a local variable created by main function
    function displayCar() {
      // displayCar() is the inner function
      var carName = 'Civic';
      console.log(`Company name is : ${companyName}`); // use variable declared in the parent function
      function carEngine(){
        // this function has access to carName and companyName variable, due to closure.
        console.log(`Company name is : ${companyName}`); // use variable declared in the parent function as its also part of the scope 
        console.log(`Can access carname ${carName}`);
      }
      carEngine();
    }
    function displayBike() {
      console.log(`Company name is : ${companyName}`); // companyName is avaiable because of closure scope.
      console.log(`Cannot access carname ${carName}`)  // Error: we can't use this variable, since it is not available in closure
    }
    displayCar();
    displayBike() 
  }
  main();