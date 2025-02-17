package com.itb.inf3an25.pizzariacursov001.com.itb.inf3an25.pizzariacurso.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "produtos")
@Data
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = true, length = 255)
    private String tipo;

    @Column(nullable = true)
    private String descricao;

    private int quantidadeEstoque;
    @Column(nullable = true, columnDefinition = "DECIMAL(5,2)")

    private double precoVenda;
    @Column(nullable = true, columnDefinition = "DECIMAL(5,2)")
    
    private double precoCompra;
    private boolean codStatus;

    //Atributos de apoio

    @Transient               //Informa que o atributo NÃO É COLUNA DE BANCO DE DADOS
    private String mensagemdErro = "";
    @Transient
    private boolean isValid = true;

}
@Entity
@Table(name = "categoria")
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = true)
    private String descricao;

    private boolean codStatus;



}


}

