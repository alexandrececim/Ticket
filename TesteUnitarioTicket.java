import java.util.Scanner;
import java.util.ArrayList;

/**
 * Teste Unitario para classe Ticket (Ticket.java)
 * Deve testa:  
 * 1) O sistema deve controlar uma fila de banco com acesso a dois 
 * tipos de usuários, são eles: Normal e Preferencial.
 * 
 * 2) O sistema deve gerar uma senha(ticket) no formato 'NXXXX' para 
 * usuario normal e 'PXXXX' para usuario Preferencial (Onde cada 'X' 
 * é um digito numérico).
 * 
 * 3) O sistema terá que atender somente uma senha de usuario normal 
 * depois que todos os usuarios Preferenciais estiverem sido atendidos.
 * 
 * @version 1.0
 * @author Carlos Alexandre de Souza Cecim
 */

public class TesteUnitarioTicket{


 public static void main(String[] args){
  ArrayList<Ticket> fila = new ArrayList<Ticket>();
  Scanner digitado = new Scanner(System.in);
  String foi = "";
  
  do {
   Ticket ticket = new Ticket();
   System.out.println("################ Comandos ################");
   System.out.println("add Tcket Normal:       Digite .... 1  ");
   System.out.println("add Tcket Preferencial: Digite .... 2  ");
   System.out.println("Visualizar Fila:        Digite .... *  ");
   System.out.println("Atender Fila:           Digite .... #  ");
   System.out.println("##########################################");

   System.out.println("Adicinar na fila: ");
   
   foi = digitado.nextLine();
   //ticket.setTicketNormal(foi);
   if(foi.equals("-")){break;} 

//Mostra a fila
   if(foi.equals("*")){
    System.out.println("####### Fila #######");
    int xt = fila.size();
    for(int i = 0; xt > i; i++){
         System.out.println("["+i+"] "+	fila.get(i).getTicketNormal() + " .... At.: " +	fila.get(i).getStatusAtendimento());
    }
    continue;
   }
//Muda o status do ticket(atendimento)
  if(foi.equals("#")){
    System.out.println("##### Altera Status #####");
    ticket.atendeFila(fila);


    continue;
   } 


  if(foi.equals("1")){
   ticket.addFilaNormal(fila);
  }
  if(foi.equals("2")){
   ticket.addFilaPreferencial(fila);
  }
   System.out.println("fila: "+fila.size());
  }while (foi.trim().equals("-") == false);

   int xp = fila.size() - 1;
   System.out.println("******************");
   System.out.println("*Fim do Sistema*");

 }  
}
