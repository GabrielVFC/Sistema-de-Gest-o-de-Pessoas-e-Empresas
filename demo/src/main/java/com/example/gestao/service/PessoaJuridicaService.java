package com.example.gestao.service;

import com.example.gestao.model.PessoaJuridica;
import com.example.gestao.repository.PessoaJuridicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaJuridicaService {
    private final PessoaJuridicaRepository pessoaJuridicaRepository;

    public PessoaJuridicaService(PessoaJuridicaRepository pessoaJuridicaRepository) {
        this.pessoaJuridicaRepository = pessoaJuridicaRepository;
    }

    public List<PessoaJuridica> listarTodas() {
        return pessoaJuridicaRepository.findAll();
    }

    public PessoaJuridica salvar(PessoaJuridica pessoaJuridica) {
        return pessoaJuridicaRepository.save(pessoaJuridica);
    }

    public Optional<PessoaJuridica> buscarPorId(Long id) {
        return pessoaJuridicaRepository.findById(id);
    }

    public void deletar(Long id) {
        pessoaJuridicaRepository.deleteById(id);
    }
}
