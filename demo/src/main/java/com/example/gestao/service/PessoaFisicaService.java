package com.example.gestao.service;

import com.example.gestao.model.PessoaFisica;
import com.example.gestao.repository.PessoaFisicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaFisicaService {
    private final PessoaFisicaRepository pessoaFisicaRepository;

    public PessoaFisicaService(PessoaFisicaRepository pessoaFisicaRepository) {
        this.pessoaFisicaRepository = pessoaFisicaRepository;
    }

    public List<PessoaFisica> listarTodas() {
        return pessoaFisicaRepository.findAll();
    }

    public PessoaFisica salvar(PessoaFisica pessoaFisica) {
        return pessoaFisicaRepository.save(pessoaFisica);
    }

    public Optional<PessoaFisica> buscarPorId(Long id) {
        return pessoaFisicaRepository.findById(id);
    }

    public void deletar(Long id) {
        pessoaFisicaRepository.deleteById(id);
    }
}
