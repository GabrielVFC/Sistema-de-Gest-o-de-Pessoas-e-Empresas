package com.example.gestao.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Usuario extends Pessoa {
    private String email;
    private String senha;
}
