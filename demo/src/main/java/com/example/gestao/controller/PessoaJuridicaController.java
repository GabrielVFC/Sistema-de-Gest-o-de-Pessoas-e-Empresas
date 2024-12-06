package com.example.gestao.controller;

import com.example.gestao.model.PessoaJuridica;
import com.example.gestao.service.PessoaJuridicaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas-juridicas")
public class PessoaJuridicaController {
    private final PessoaJuridicaService pessoaJuridicaService;

    public PessoaJuridicaController(PessoaJuridicaService pessoaJuridicaService) {
        this.pessoaJuridicaService = pessoaJuridicaService;
    }

    @GetMapping
    public List<PessoaJuridica> listarTodas() {
        return pessoaJuridicaService.listarTodas();
    }

    @GetMapping("/{id}")
    public PessoaJuridica buscarPorId(@PathVariable Long id) {
        return pessoaJuridicaService.buscarPorId(id).orElseThrow(() -> new RuntimeException("Pessoa Jurídica não encontrada"));
    }

    @PostMapping
    public PessoaJuridica salvar(@RequestBody PessoaJuridica pessoaJuridica) {
        return pessoaJuridicaService.salvar(pessoaJuridica);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pessoaJuridicaService.deletar(id);
    }
}
