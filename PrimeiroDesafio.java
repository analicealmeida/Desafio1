/**
 * PrimeiroDesafio
 */
import java.lang.String;

public class PrimeiroDesafio {
    
    public static void main(String[] args) {
        //Manipulando Strings: Revertendo a ordem das palavras.
        String texto = "Hello, World! OpenAI is amazing."; //Frase que vamos manipular.
        System.out.println("Frase original: " + texto);

        //Chamando o método abaixo e guardando na variavel revertido.
        String revertido = revertendo(texto);
        System.out.println("Frase revertida: " + revertido);
    }
        
        public static String revertendo (String r) {
        int t = r.indexOf(" "); /*Método indexOf para retornar índice da primeira ocorrência a cada espaço*/
        //Uso int pois quero tratar meus dados(String) como se fosse índices ex: 0,1,2,3,4...
        if(t == -1){ /* Condição assegurando como ela retornará, no caso será ao contrario ex: ...4,3,2,1,0 */
        return r;
        }
        //substring, o método mais usado com strings, ele extrai partes de uma string.
        return revertendo(r.substring(t+1)) +" "+ r.substring(0, t);
        }  

    }

