package com.example.gestao.controller;

import com.example.gestao.model.PessoaFisica;
import com.example.gestao.service.PessoaFisicaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas-fisicas")
public class PessoaFisicaController {
    private final PessoaFisicaService pessoaFisicaService;

    public PessoaFisicaController(PessoaFisicaService pessoaFisicaService) {
        this.pessoaFisicaService = pessoaFisicaService;
    }

    @GetMapping
    public List<PessoaFisica> listarTodas() {
        return pessoaFisicaService.listarTodas();
    }

    @GetMapping("/{id}")
    public PessoaFisica buscarPorId(@PathVariable Long id) {
        return pessoaFisicaService.buscarPorId(id).orElseThrow(() -> new RuntimeException("Pessoa Física não encontrada"));
    }

    @PostMapping
    public PessoaFisica salvar(@RequestBody PessoaFisica pessoaFisica) {
        return pessoaFisicaService.salvar(pessoaFisica);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pessoaFisicaService.deletar(id);
    }
}
