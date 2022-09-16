package br.com.curso.contato.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.curso.contato.dto.PessoaDTO;
import br.com.curso.contato.repository.PessoaRepository;

@Service
public class PessoaService {


    public PessoaDTO consultar(Integer id) {
        
        PessoaRepository pessoaRepository = new PessoaRepository();

        List<PessoaDTO> listPessoa = pessoaRepository.getAll();

        PessoaDTO pessoaSelecionada = new PessoaDTO();

        for (PessoaDTO pessoa : listPessoa) {
            if (pessoa.getId().equals(id)){
                pessoaSelecionada = pessoa;
            }
        }
        return pessoaSelecionada;
    }

    /**
     * Classe service usada para regras de negocio
     * @param pessoaDTO
     * @return
     */
    public PessoaDTO salvar(PessoaDTO pessoaDTO) {
        System.out.println("Acessando a classe Service");
        if (pessoaDTO.getIdade() < 18) {
            System.out.println("Não e possível cadastrar menor de idade.");
        } else {
            pessoaDTO.setIdade(pessoaDTO.getIdade() + 5);
            System.out.println("Cadastro feito com sucesso.");
        }
        
        return pessoaDTO;
    }


    
}
