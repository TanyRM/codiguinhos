string? readResult;
int numericValue = 0;
bool validNumber = false;

Console.WriteLine("Enter an integer value between 5 and 10: ");

do {
    readResult = Console.ReadLine();

    validNumber = int.TryParse(readResult, out numericValue);
    if (!validNumber) {
        Console.WriteLine("Sorry, you entered an invalid number, please try again: ");
    }

    else if (numericValue < 5 || numericValue > 10){
        Console.WriteLine("Please enter a number between 5 and 10: ");
    }

} while (validNumber == false || (numericValue < 5 || numericValue > 10));

Console.WriteLine($"Your input value ({numericValue}) has been accepted.");

/*******************************************************************************************/

Console.WriteLine("Enter your role name (Administrator, Manager, or User): ");

string value;

do {
    readResult = Console.ReadLine();
    value = readResult.Trim().ToLower();

    if (value != "administrator" && value != "manager" && value != "user") {
        Console.WriteLine($"The role name that you entered, {readResult} is not valid. Enter your role name (Administrator, Manager, or User)");
    }

} while (value != "administrator" && value != "manager" && value != "user");

Console.WriteLine($"Your input value ({readResult}) has been accepted.");

/*******************************************************************************************/

string[] myStrings = ["I like pizza. I like roast chicken. I like salad", "I like all three of the menu choices"];
int stringsCount = myStrings.Length;

string myString = "";
int periodLocation = 0;

for (int i = 0; i < stringsCount; i++)
{
    myString = myStrings[i];
    periodLocation = myString.IndexOf(".");

    string mySentence;

    // extract sentences from each string and display them one at a time
    while (periodLocation != -1)
    {

        // first sentence is the string value to the left of the period location
        mySentence = myString.Remove(periodLocation);

        // the remainder of myString is the string value to the right of the location
        myString = myString.Substring(periodLocation + 1);

        // remove any leading white-space from myString
        myString = myString.TrimStart();

        // update the comma location and increment the counter
        periodLocation = myString.IndexOf(".");

        Console.WriteLine(mySentence);
    }
 
    mySentence = myString.Trim();
    Console.WriteLine(mySentence);
}