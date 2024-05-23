import java.util.Scanner;

public class Resposta1 {
    private static boolean auxResposta = true;
    
    public static int RespostaP1(){
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
                
                
                if(Integer.parseInt(respostaAux) == 1 || Integer.parseInt(respostaAux) == 2 || Integer.parseInt(respostaAux) == 3){
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
