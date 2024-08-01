namespace quiz
{
    class Program
    {
        static List<Pergunta> perguntas = [];
        static int id = 0;
        static Random random = new();
        static List<Pergunta> perguntasSorteadas = [];
        static int countAcertos = 0;
        static void Main(string[] args)
        {

            int countPerguntas = 0;

            string op;
            bool continuar = true;
            do
            {
                AdicionarPergunta();

                Console.WriteLine("Deseja adicionar outra pergunta? ");
                op = Console.ReadLine().ToLower();
                if (op == "n")
                {
                    continuar = false;
                }
            } while (continuar);

            continuar = true;
            Console.WriteLine("Iniciar Quiz? (s/n)");
            op = Console.ReadLine().ToLower();
            if (op == "n")
            {
                continuar = false;
            }

            while (continuar || countPerguntas == perguntas.Count)
            {
                SortearPergunta();
                countPerguntas++;
                Console.WriteLine("Deseja continuar jogando? ");
                op = Console.ReadLine().ToLower();
                if (op == "n")
                {
                    continuar = false;
                }
            }

            Console.WriteLine("Quiz encerrado!\nVocê acertou " + countAcertos + " questões!");
            if (countAcertos >= perguntasSorteadas.Count / 2 + 1)
            {
                Console.WriteLine("Você ganhou!");
            }
            else
            {
                Console.WriteLine("Você perdeu!");
            }
        }

        static void AdicionarPergunta()
        {
            Console.WriteLine("Qual a categoria da pergunta? ");
            string categoria = Console.ReadLine();

            Console.WriteLine("Insira a pergunta: ");
            string questao = Console.ReadLine();

            Pergunta pergunta = new Pergunta(id + 1, categoria, questao);
            pergunta.GerarAlternativas();
            perguntas.Add(pergunta);

            foreach (Alternativa alternativa in pergunta.Alternativas)
            {
                Console.WriteLine("Digite a alternativa: ");
                alternativa.Descricao = Console.ReadLine();
                Console.WriteLine("Essa é a alternativa correta? ");
                string correta = Console.ReadLine();
                if (correta == "")
                {
                    alternativa.Correta = false;
                }
                else
                {
                    alternativa.Correta = Convert.ToBoolean(correta);
                    Console.WriteLine();
                }
            }
        }

        static void SortearPergunta()
        {
            bool sortear = true;
            while (sortear)
            {
                int id = random.Next(1, perguntas.Count + 1);

                foreach (Pergunta pergunta in perguntas)
                {
                    if (pergunta.Id == id)
                    {
                        if (!perguntasSorteadas.Contains(pergunta))
                        {
                            ExibirPergunta(pergunta);
                            sortear = false;
                        }
                        break;
                    }
                }
            }
        }

        static void ExibirPergunta(Pergunta pergunta)
        {
            Pergunta perguntaSorteada = pergunta;
            Console.WriteLine($"A categoria é: {pergunta.Categoria}\n{pergunta.Questao}");
            foreach (Alternativa alternativa in pergunta.Alternativas)
            {
                Console.WriteLine($"{alternativa.Id}) {alternativa.Descricao}");
            }
            ResponderPergunta(perguntaSorteada);
            perguntasSorteadas.Add(perguntaSorteada);
        }

        static void ResponderPergunta(Pergunta pergunta)
        {
            Console.WriteLine("Qual é a alternativa correta?");
            int result = Convert.ToInt32(Console.ReadLine());

            foreach (Alternativa alternativa in pergunta.Alternativas)
            {
                if (alternativa.Id == result)
                {
                    Console.WriteLine("Você escolheu a alternativa " + alternativa.Descricao);
                    if (alternativa.Correta == true)
                    {
                        Console.WriteLine("Resposta Correta!");
                        countAcertos++;
                    }
                    else
                    {
                        Console.WriteLine("Resposta Errada!");
                    }
                    break;
                }
            }
        }
    }

    class Pergunta(int id, string categoria, string questao)
    {
        public int Id { get; set; } = id;
        public string Categoria { get; set; } = categoria;
        public string Questao { get; set; } = questao;
        public List<Alternativa> Alternativas = new(4);

        public void GerarAlternativas()
        {
            for (int i = 0; i < 4; i++)
            {
                Alternativa alternativa = new(i + 1, "");
                Alternativas.Add(alternativa);
            }
        }
    }

    internal class Alternativa(int id, string descricao, bool correta = false)
    {
        public int Id { get; set; } = id;
        public string Descricao { get; set; } = descricao;
        public bool Correta { get; set; } = correta;
    }
}