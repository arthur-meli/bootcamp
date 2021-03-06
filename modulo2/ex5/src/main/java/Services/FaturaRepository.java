package Services;
import Models.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaRepository implements Repository<Fatura> {

    List<Fatura> faturaList;

    public FaturaRepository() {
        this.faturaList = new ArrayList<>();
    }

    @Override
    public void save(Fatura object) {
        faturaList.add(object);
    }

    public void save(Fatura object, ClienteRepository clientList) {
        if (clientList.getClienteList().contains(object.getCliente())) faturaList.add(object);
        else System.out.println("Cliente não cadastrado");
    }

    @Override
    public void showList() {
        faturaList.forEach(System.out::println);
    }

    @Override
    public boolean findById(int id) {
        return true;
    }

    @Override
    public void deleteById(int id) {

    }
}