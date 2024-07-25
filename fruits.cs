string[] fruits = ["apple", "banana", "cherry","orange"];
Random randomFruit = new();
int value = randomFruit.Next(fruits.Length);
string fruit = fruits[value];

switch (fruit){
    case "apple": 
        Console.WriteLine("App wil display information for apple."); 
        break;
    
    case "banana": 
        Console.WriteLine("App wil display information for banana."); 
        break;
    
    case "cherry": 
        Console.WriteLine("App wil display information for cherry.");
        break;
    
    default: 
        Console.WriteLine("App wil display information for " + fruit);
        break;
}