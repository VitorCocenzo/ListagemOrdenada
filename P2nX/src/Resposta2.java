import java.util.Scanner;

public class Resposta2 {
    private static boolean auxResposta = true;

    public static int RespostaP2(){
        int count=0;

        while(auxResposta){
            try{

                if(count == 4){
                    break;
                }
                
                count++;
                Scanner teclado = new Scanner(System.in);
                String respostaAux = teclado.next();
                teclado.nextLine();
                
                
                if(Integer.parseInt(respostaAux) == 1 || Integer.parseInt(respostaAux) == 2 || Integer.parseInt(respostaAux) == 3 || Integer.parseInt(respostaAux) == 4 || Integer.parseInt(respostaAux) == 5
                || Integer.parseInt(respostaAux) == 10 || Integer.parseInt(respostaAux) == 9 || Integer.parseInt(respostaAux) == 8 || Integer.parseInt(respostaAux) == 7 || Integer.parseInt(respostaAux) == 6
                || Integer.parseInt(respostaAux) == 11 || Integer.parseInt(respostaAux) == 12 || Integer.parseInt(respostaAux) == 13 || Integer.parseInt(respostaAux) == 14 || Integer.parseInt(respostaAux) == 15
                || Integer.parseInt(respostaAux) == 16){
                    auxResposta = false;
                    return Integer.parseInt(respostaAux);
                }else{
                    throw new IllegalArgumentException();
                }
                
            }catch(Exception e){
                if(count == 4){
                    break;
                }

                System.out.println("Tente novamente: (" + (4-count) + " tentativas)");
                auxResposta = true;
            }
        }
        return -1;
    }
    
}
