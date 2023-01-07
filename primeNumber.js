function isPrime(n)
{
    let flag=true;
    if (n <= 1) return false;                   //since 1 is not a prime
    for(let i=2; i <=  Math.sqrt(n); i++) {
        if(n % i ===0)
            return false;
    }
    return true;
}
function nextPrimeDiff(N)
{ 
    let prime = N;
    let found = false;
 
    while (!found) {
        prime++;                                     //looping till we get a prime number
 
        if (isPrime(prime))
            found = true;
    }
    
    return prime-N;
}

const input=3
if(isPrime(input))                                    //pass input
    console.log(`${input} is a prime Number`)
else
    console.log(`${input} is NOT a prime Number`)
console.log(`next prime number is after ${nextPrimeDiff(input)} digits from ${input}`)