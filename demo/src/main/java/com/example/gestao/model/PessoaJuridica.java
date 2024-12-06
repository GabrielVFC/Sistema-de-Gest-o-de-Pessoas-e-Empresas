package com.example.gestao.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PessoaJuridica extends Usuario {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
}
