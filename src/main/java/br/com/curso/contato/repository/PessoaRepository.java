package br.com.curso.contato.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.curso.contato.dto.PessoaDTO;

public class PessoaRepository {

    public List<PessoaDTO> getAll() {
        List<PessoaDTO> listPessoa = new ArrayList<>();

        PessoaDTO pessoa1 = new  PessoaDTO();
        pessoa1.setId(1);
        pessoa1.setNome("Alex Miranda");
        pessoa1.setEmail("alexsistemass@gmail.com");
        pessoa1.setTelefone("62966360547");
        listPessoa.add(pessoa1);

        PessoaDTO pessoa2 = new  PessoaDTO();
        pessoa2.setId(2);
        pessoa2.setNome("Marilainny");
        pessoa2.setEmail("mary@gmail.com");
        pessoa2.setTelefone("6212342679");
        listPessoa.add(pessoa2);


        PessoaDTO pessoa3 = new  PessoaDTO();
        pessoa3.setId(3);
        pessoa3.setNome("Julio Cesar");
        pessoa3.setEmail("juliocezar@gmail.com");
        pessoa3.setTelefone("45957887897");
        listPessoa.add(pessoa3);

        PessoaDTO pessoa4 = new  PessoaDTO();
        pessoa4.setId(4);
        pessoa4.setNome("Eribilton");
        pessoa4.setEmail("rribilton@gmail.com");
        pessoa4.setTelefone("11966360547");
        listPessoa.add(pessoa4);

        return listPessoa;
    }
    
}
