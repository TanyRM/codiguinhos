string pangram = "The quick brown fox jumps over the lazy dog";
string[] palavras = pangram.Split(" ");
string[] result = new string[palavras.Length];

for (int i = 0; i < palavras.Length; i++){
    char[] letras = palavras[i].ToCharArray();
    Array.Reverse(letras);
    result[i] = new string(letras);
}

pangram = String.Join(" ", result);
Console.WriteLine(pangram);
