import Models.Cliente;
import Models.Fatura;
import Models.Item;
import Services.ClienteRepository;
import Services.FaturaRepository;
import Services.ItemRepository;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ClienteRepository clienteList = new ClienteRepository();
        FaturaRepository faturaList = new FaturaRepository();
        ItemRepository itemList = new ItemRepository();

        Cliente cliente1 = new Cliente(0, "asdadsadsa", "dasdsa");
        clienteList.save(cliente1);
        Cliente cliente2 = new Cliente(1, "dasda", "dasa");
        clienteList.save(cliente2);

        clienteList.showList();
        clienteList.deleteById(1);
        clienteList.showList();

        System.out.println("Search ID");
        int id = s.nextInt();
        clienteList.findById(id);


    }
}