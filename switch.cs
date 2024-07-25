int employeeLevel = 100;
string employeeName = "John Smith";

string title = "";

switch (employeeLevel)
{
    case 100:
    case 200:
        title = "Senior Associate";
        break;
    case 300:
        title = "Manager";
        break;
    case 400:
        title = "Senior Manager";
        break;
    default:
        title = "Associate";
        break;
}
/*
title = employeeLevel switch
{
    100 => "Junior Associate",
    200 => "Senior Associate",
    300 => "Manager",
    400 => "Senior Manager",
    _ => "Associate",
}; 
*/

Console.WriteLine($"{employeeName}, {title}");