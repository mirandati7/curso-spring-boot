package br.com.curso.contato.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.contato.dto.EnderecoDTO;
import br.com.curso.contato.dto.PessoaDTO;
import br.com.curso.contato.model.Endereco;
import br.com.curso.contato.model.Pessoa;
import br.com.curso.contato.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;


    public PessoaDTO consultar(Integer id) {

        // List<Pessoa> listPessoa = pessoaRepository.f();

        // PessoaDTO pessoaSelecionada = new PessoaDTO();

        // for (PessoaDTO pessoa : listPessoa) {
        //     if (pessoa.getId().equals(id)){
        //         pessoaSelecionada = pessoa;
        //     }
        // }
        return null;
    }

    /**
     * Classe service usada para regras de negocio
     * @param pessoaDTO
     * @return
     */
    public PessoaDTO salvar(PessoaDTO dto) {
        System.out.println("Acessando a classe Service");
        
        if (dto.getIdade() < 18) {
            System.out.println("Não e possível cadastrar menor de idade.");
            
            Pessoa pessoa = new Pessoa();
            pessoa.setId(dto.getId());
            pessoa.setEmail(dto.getEmail());
            pessoa.setNome(dto.getNome());
            pessoa.setTelefone(dto.getTelefone());
            pessoa.setIdade(dto.getIdade());

            List<Endereco> lstEndereco = new ArrayList<>();

            for (EnderecoDTO  enderecoDTO : dto.getEnderecos()) {
                Endereco endereco = new Endereco();
                endereco.setPessoa(pessoa);
                endereco.setLogradouro(enderecoDTO.getLogradouro());
                lstEndereco.add(endereco);
                pessoa.setEndereco(lstEndereco);
            }

            // ORM - Mapeamento do Objeto Relacional
            Pessoa pessoaRetornada = pessoaRepository.save(pessoa);

            
            System.out.println("ID .. :" + pessoaRetornada.getId());
        } else {
            dto.setIdade(dto.getIdade() + 5);
            System.out.println("Cadastro feito com sucesso.");
        }
        
        return dto;
    }


    
}
