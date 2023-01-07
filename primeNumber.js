function isPrime(n)
{
    let flag=true;
    if (n <= 1) return false;                   //since 1 is not a prime
    if (n <= 3) return true;                    //since 2 and 3 are prime
     
    if (n%2 == 0 || n%3 == 0)                   //eliminating multiple of 2 and 3s
        return false;
     
    for (let i=5; i<n; i++)                    //check if prime
        if (n%i == 0 )
            flag=false;
    if(flag)
        return true;
    else 
        return false;
}
function nextPrime(N)
{
 
    // Base case
    if (N <= 1)
        return 2;
 
    let prime = N;
    let found = false;
 
    while (!found) {
        prime++;                                     //looping till we get a prime number
 
        if (isPrime(prime))
            found = true;
    }
    
    return prime-N;
}

const input=23
if(isPrime(input))                                    //pass input
    console.log(`${input} is a prime Number`)
else
    console.log(`${input} is NOT a prime Number`)
console.log(`next prime number is after ${nextPrime(input)} digits from ${input}`)