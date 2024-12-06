package com.example.gestao.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(
        name = "empresa_pessoa_fisica",
        joinColumns = @JoinColumn(name = "empresa_id"),
        inverseJoinColumns = @JoinColumn(name = "pessoa_fisica_id")
    )
    private List<PessoaFisica> pessoaFisicas;

    @OneToMany(mappedBy = "empresa")
    private List<PessoaJuridica> pessoaJuridicas;
}
