function closure() {
    var companyName = 'Honda'; // name is a local variable created by closure
    function displayCar() {
      // displayCar() is the inner function, a closure
      var carName = 'Civic';
      console.log(`Company name is : ${companyName}`); // use variable declared in the parent function
      function carEngine(){
        console.log(`Company name is : ${companyName}`); // use variable declared in the parent function as its also part of the scope 
        console.log(`Can access carname ${carName}`);
      }
      carEngine();
    }
    function displayBike() {
      // displayBike() is the inner function, a closure
      console.log(`Company name is : ${companyName}`); // use variable declared in the parent function
      console.log(`Cannot access carname ${carName}`)  // we cant use variable from a function on same level will gove error
    }
    displayCar();
    displayBike() 
  }
  closure();