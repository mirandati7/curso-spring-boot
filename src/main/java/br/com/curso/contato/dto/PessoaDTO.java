package br.com.curso.contato.dto;

import java.util.List;

public class PessoaDTO {

    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    private Integer idade;
    private List<EnderecoDTO> enderecos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public List<EnderecoDTO> getEnderecos() {
        return enderecos;
    }
    public void setEnderecos(List<EnderecoDTO> enderecos) {
        this.enderecos = enderecos;
    }

    
    
}
