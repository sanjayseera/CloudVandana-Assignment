function reverseWords(sentence) {
    const words = sentence.split(' ');
  
    const reversedWords = words.map(word => {
      const reversed = word.split('').reverse().join('');
      return reversed;
    });
  
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  

  const inputSentence = prompt("Enter a sentence:");
  const reversedSentence = reverseWords(inputSentence);
  
  
  console.log("Reversed sentence: " + reversedSentence);
  