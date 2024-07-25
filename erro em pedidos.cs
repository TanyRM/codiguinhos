string orderStream = "B123,C234,A345,C15,B177,G3003,C235,B179";
string[] orders = orderStream.Split(",");
Array.Sort(orders);

for (int i = 0; i < orders.Length; i++){
    char[] order = orders[i].ToCharArray();
    if (order.Length == 4){
        Console.WriteLine(order);
    }
    else {
        Console.Write(order);
        Console.WriteLine("\t- Error");
    }
}
