package br.com.fiap;

import br.com.fiap.repository.CarroRepository;
import br.com.fiap.view.CarroView;

public class Main {

    public static void main(String[] args) {


        var c = CarroView.form();


        CarroRepository repo = new CarroRepository("oracle-fiap");

        repo.getManager().getTransaction().begin();
        repo.save(c);

        repo.getManager().flush();


        repo.close();


        System.out.println(c);
    }

}