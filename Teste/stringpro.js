function reverseString(str) {
    let reversedString = ""; 

    // Percorre a string original de trás para frente
    for (let i = str.length - 1; i >= 0; i--) {

        reversedString += str[i];
    }

    return reversedString; 
}

// Exemplo de uso
const originalString = "Olá mundo"; 
const invertedString = reverseString(originalString);
console.log("String invertida:", invertedString); 