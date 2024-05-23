public class P2nX {
    public static void main(String[] args) throws Exception {

        //Criando as instancias de Homem e de Mulher, com valores aleatorios.

        Mulher mulher1 = new Mulher("Ana", "Souza", 10, 11, 1999, 100, 1.65f, 19526908708l);
        Mulher mulher2 = new Mulher("Amanda", "Posta", 10, 1, 2004, 100, 1.32f, 11191731740l);
        Homem homem1 = new Homem("Paulo", "da Silva", 10, 2, 2002, 84.3f, 1.87f, 49023780910l);
        Mulher mulher3 = new Mulher("Amanda", "Carrilho", 10, 4, 2004, 50, 1.75f, 12345678910l);
        Homem homem2 = new Homem("Roberto", "Freire", 5, 2, 1980, 70.3f, 1.80f, 15567123496l);
        Homem homem3 = new Homem("Roberto", "Amaral", 19, 2, 1980, 95.3f, 1.69f, 89071236789l);
        Homem homem4 = new Homem("Vitor", "Cocenzo", 2, 12, 2017, 64.6f, 1.88f, 12379805778l);
        Homem homem5 = new Homem("Joaquim", "Ferreira", 26, 11, 1993, 79.8f, 1.72f, 28526908776l);
        Mulher mulher4 = new Mulher("Cecilia", "Ramos", 15, 3, 2010, 63.20f, 1.75f, 82198171664l);
        Mulher mulher5 = new Mulher("Maria", "Joaquina", 5, 5, 2006, 45.7f, 1.37f, 13026908708l);


        MinhaListaOrdenavel exemplo = new MinhaListaOrdenavel();

        exemplo.add(mulher1);
        exemplo.add(mulher2);
        exemplo.add(mulher3);
        exemplo.add(mulher4);
        exemplo.add(mulher5);
        exemplo.add(homem1);
        exemplo.add(homem2);
        exemplo.add(homem3);
        exemplo.add(homem4);
        exemplo.add(homem5);
        
        try{
            System.out.println("-----OPCOES-----");
            System.out.println("1.Imprimir Lista");
            System.out.println("2.Imprimir lista de forma ordenada");
            System.out.println("3.Sair\n");
            System.out.print("Digite sua opcao: ");

            int auxResposta = Resposta1.RespostaP1();

            if(auxResposta==-1){
                //Lancar excessao para causar o encerramento do programa(Nesse caso, devido ao ocorrido em "Resposta1" do numero maximo de tentativas ter sido atingido)
                throw new NumberFormatException();
            }

            if(auxResposta == 3){
                //Lancar excessao para causar o encerramento do programa(Usuario escolheu encerrar sem fazer nada)
                throw new Exception();
            }

            if(auxResposta == 1){
                System.out.println(exemplo.ordena(0));
                //Lancar excessao para causar o encerramento do programa(Usuario escolheu imprimir a lista de forma aleatoria)
                throw new Exception();
            }
            
            System.out.println("-----OPCOES-----: ");
            System.out.println("1.Peso(ordem crescente)");
            System.out.println("2.Peso(ordem decrescente)");
            System.out.println("3.Altura(ordem crescente)");
            System.out.println("4.Altura(ordem decrescente)");
            System.out.println("5.Idade(ordem crescente)");
            System.out.println("6.Idade(ordem decrescente)");
            System.out.println("7.CPF(ordem crescente)");
            System.out.println("8.CPF(ordem decrescente)");
            System.out.println("9.Nome(A-Z)");
            System.out.println("10.Nome(Z-A)");
            System.out.println("11.IMC(ordem crescente)");
            System.out.println("12.IMC(ordem decrescente)");
            System.out.println("13.Data de nascimento(Mais velho -> Mais novo)");
            System.out.println("14.Data de nascimento(Mais novo -> Mais velho)");
            System.out.println("15.Genero(Mulher/Homem)");
            System.out.println("16.Genero(Homem/Mulher)\n");
            System.out.print("Escolha seu metodo de ordenacao: ");
            
            auxResposta = Resposta2.RespostaP2();
            
            if(auxResposta==-1){
                //Lancar excessao para causar o encerramento do programa(Nesse caso, devido ao ocorrido em "Resposta1" do numero maximo de tentativas ter sido atingido)
                throw new NumberFormatException();
            }
            
            System.out.println("");

            System.out.println(exemplo.ordena(auxResposta));
            
        }catch(NumberFormatException nf){
            System.out.println("ERRO! Tentativas maximas alcancadas.(encerrando programa...)");
        }catch(Exception e){
        }
    }
}
