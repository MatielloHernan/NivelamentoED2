Questao 3 - nivelamento ed2

//Sim. Para isso é necessário pegar cada caractere da string com o "charAt" e adicionar(pull) cada caractere a pilha. Depois que a frase toda estiver na //pilha desempilharesmos(pop) dando um print em cada letra(char) até formar a frase inteira de forma contrária. O sistema de LIFO da pilha cuidará de //inverter a frase.


package nivelamento;
import java.util.*;
import java.util.regex.*;

import java.util.Stack;

public class Ex3 {
 
    public static void main(String[] args) {
 
         
          Scanner in = new Scanner(System.in);
          System.out.println("Escreva uma frase");
 
          String str = in.nextLine();
 
          Stack stack = new Stack<>();
 
          
          for(int i = 0; i < str.length(); i++) {
               stack.push(str.charAt(i));
          }
 
          System.out.println("Invertendo a frase");
 
          while(!stack.empty()) {
              System.out.print(stack.pop());
          }
      }
}
