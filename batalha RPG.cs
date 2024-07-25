int integridadeMonstro = 10;
int integridadeHeroi = 10;
int ataque;
Random dado = new();

do {
    ataque = dado.Next(1, 10);
    integridadeMonstro -= ataque;
    Console.WriteLine($"Monster was damaged and lost " + ataque + " health and now has " + integridadeMonstro + " health");
    
    if (integridadeMonstro <= 0){
        Console.WriteLine("Hero Wins!");
    } 
    else {
        ataque = dado.Next(1, 10);
        integridadeHeroi -= ataque;
        Console.WriteLine($"Hero was damaged and lost " + ataque + " health and now has " + integridadeHeroi + " health");
        
        if (integridadeHeroi <= 0){
            Console.WriteLine("Monster Wins!");
        }
    }
} while (integridadeHeroi > 0 && integridadeMonstro > 0);

