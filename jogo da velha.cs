using System.Diagnostics.Contracts;

namespace JogoDaVelha
{
    class Program
    {
        static Random random = new();
        static char[,] tabuleiro = new char[3, 3];
        static char[] jogadores = ['X', 'O'];
        static char jogador = jogadores[random.Next(0, 2)];
        static bool fimDeJogo = false;

        static void Main(string[] args)
        {
            
            int count = 0;

            InicializarTabuleiro();
            do
            {
                count++;

                Console.WriteLine("É a vez do jogador " + jogador);

                MostrarTabuleiro();

                SelecionarPosicao();

                VerificarFimDeJogo(count);

                jogador = TrocarJogador();

            } while (fimDeJogo == false);
        }

        static void InicializarTabuleiro()
        {
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    tabuleiro[i, j] = '-';
                }
            }
        }

        static void MostrarTabuleiro()
        {
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Console.Write(tabuleiro[i, j]);
                    Console.Write("  ");
                }

                Console.WriteLine();
            }
        }

        static void SelecionarPosicao()
        {
            bool valido = false;
            do
            {
                Console.Write("Escolha uma linha: ");
                int linha = int.Parse(Console.ReadLine());
                Console.Write("Escolha uma coluna: ");
                int coluna = int.Parse(Console.ReadLine());

                if (tabuleiro[linha - 1, coluna - 1] == '-')
                {
                    tabuleiro[linha - 1, coluna - 1] = jogador;
                    valido = true;
                }
                else if (linha - 1 > 3 || coluna - 1 > 3) {
                    Console.WriteLine("Valor invalido!");
                }
                else
                {
                    Console.WriteLine("Essa posição já está ocupada, selecione outra");
                }
            } while (valido == false);
        }

        static void VerificarFimDeJogo(int count)
        {
            MostrarTabuleiro();
            for (int i = 0; i < 3; i++)
            {
                if ((tabuleiro[i, 0] == jogador && tabuleiro[i, 1] == jogador && tabuleiro[i, 2] == jogador) ||
                    (tabuleiro[1, i] == jogador && tabuleiro[2, i] == jogador && tabuleiro[3, i] == jogador))
                {
                    Console.WriteLine("Fim de jogo!\nO jogador " + jogador + " venceu!");
                    fimDeJogo = true;
                }
            }

            if ((tabuleiro[0, 0] == jogador && tabuleiro[1, 1] == jogador && tabuleiro[2, 2] == jogador) ||
                (tabuleiro[0, 2] == jogador && tabuleiro[1, 1] == jogador && tabuleiro[2, 0] == jogador))
            {
                Console.WriteLine("Fim de jogo!\nO jogador " + jogador + " venceu!");
                fimDeJogo = true;
            }
            else if (count == tabuleiro.Length)
            {
                Console.WriteLine("Fim de jogo!\nEmpate!");
                fimDeJogo = true;
            }
            else {
                TrocarJogador();
            }
        }

        static char TrocarJogador()
        {
            if (jogador == 'X') return 'O';
            else return 'X';
        }
    }
}