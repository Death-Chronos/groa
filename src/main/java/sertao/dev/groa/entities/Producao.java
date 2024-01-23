package sertao.dev.groa.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate data;
    private Float pesoBruto;
    private Float pesoRefugo;
    private Float pesoVenda;

    public Producao(Long id, String nome, LocalDate data, Float pesoBruto, Float pesoRefugo, Float pesoVenda) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.pesoBruto = pesoBruto;
        this.pesoRefugo = pesoRefugo;
        this.pesoVenda = pesoVenda;
    }

    public Producao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Float getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Float pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public Float getPesoRefugo() {
        return pesoRefugo;
    }

    public void setPesoRefugo(Float pesoRefugo) {
        this.pesoRefugo = pesoRefugo;
    }

    public Float getPesoVenda() {
        return pesoVenda;
    }

    public void setPesoVenda(Float pesoVenda) {
        this.pesoVenda = pesoVenda;
    }

}
