package br.com.fiap.repository;

import br.com.fiap.model.Carro;

public class CarroRepository extends Repository {

    public CarroRepository(String persistenceUnitName) {
        super(persistenceUnitName);
    }

    public void save(Carro c){
        this.getManager().persist(c);
    }

}