package br.com.fiap.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Carro {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_CARRO"
    )
    @SequenceGenerator(
            name = "SQ_CARRO",
            sequenceName = "SQ_CARRO",
            allocationSize = 1,
            initialValue = 1
    )
    private Long id;
    private String cor;
    private String marca;
    private String modelo;
    private BigDecimal preco;

    public Carro() {
    }

    public Carro(Long id, String cor, String marca, String modelo, BigDecimal preco) {
        this.id = id;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public Carro setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCor() {
        return cor;
    }

    public Carro setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Carro setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Carro setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
