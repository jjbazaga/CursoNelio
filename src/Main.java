import model.entidades.Reserva;
import util.DateUtilFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Numero do apartamento: ");
        int numApto = sc.nextInt();
        System.out.print("Data de entrada (dd/MM/aaaa): ");
        LocalDate dataEntrada = DateUtilFormat.formatDate(sc.next());
        System.out.print("Data de saída (dd/MM/aaaa): ");
        LocalDate dataSaida = DateUtilFormat.formatDate(sc.next());

        if(!dataSaida.isAfter(dataEntrada)){
            System.out.println("Erro na reserva: a data de saida deverá ser maior que a data de chegada!");
        }
        else{
            Reserva reserva = new Reserva(numApto, dataEntrada, dataSaida);
            System.out.println(reserva);
            System.out.println();

            System.out.println("Entre com dos dados da nova reserva:");
            System.out.print("Data de entrada (dd/MM/aaaa): ");
            dataEntrada = DateUtilFormat.formatDate(sc.next());
            System.out.print("Data de saída (dd/MM/aaaa): ");
            dataSaida = DateUtilFormat.formatDate(sc.next());
            if(!dataSaida.isAfter(dataEntrada)){
                System.out.println("Erro na reserva: a data de saida deverá ser maior que a data de chegada!");
            }else if(dataEntrada.isBefore(LocalDate.now()) || dataSaida.isBefore(LocalDate.now())){
                System.out.println("Erro na reserva: As datas da reserva para atualização devem ser datas futuras");
            }
            else{
                reserva.atualizacaoDatas(dataEntrada, dataSaida);
                System.out.println(reserva);
            }
        }
        sc.close();
    }
}