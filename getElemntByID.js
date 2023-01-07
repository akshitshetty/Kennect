const getElementById = (element, id) => {
    const queue = [element];
    while (queue.length) {
      const curr = queue.shift();
      if (curr.id === id) {
        return curr;
      }
      for(let i=0; i<curr.childNodes.length; i++) {
        queue.push(curr.childNodes[i]);
      }
    }
  };
  
  console.log(getElementById(document.body, 'hello')); 