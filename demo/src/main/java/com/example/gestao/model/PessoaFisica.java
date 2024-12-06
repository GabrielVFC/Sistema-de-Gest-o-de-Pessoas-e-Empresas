package com.example.gestao.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class PessoaFisica extends Usuario {
    private String cpf;
    private LocalDate dataNascimento;

    @ManyToMany(mappedBy = "pessoaFisicas")
    private List<Empresa> empresas;
}
