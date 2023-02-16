package br.com.fiap.view;

import br.com.fiap.model.Carro;

import javax.swing.*;
import java.math.BigDecimal;

public abstract class CarroView {

    public static Carro form() {
        String cor =JOptionPane.showInputDialog("Cor do carro", "ROXO");
        String marca = JOptionPane.showInputDialog("Marca do carro", "BMW");
        String modelo = JOptionPane.showInputDialog("Modelo do carro", "120i");
        BigDecimal preco = new BigDecimal(JOptionPane.showInputDialog("Preco do carro", "45000"));

        return new Carro().setCor(cor).setMarca(marca).setModelo(modelo).setPreco(preco);
    }

}