package br.com.api.produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.modelo.RespostaModelo;
import br.com.api.produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Autowired
    private RespostaModelo respostaModelo;

    // Método para listar todos os produtos
    public Iterable<ProdutoModelo> listar() {
        return produtoRepositorio.findAll();
    }

    // Método para cadastrar ou alterar produtos
    public ResponseEntity<?> cadastrarAlterar(ProdutoModelo produtoModelo, String operacao) {

        if ("".equals(produtoModelo.getNome())) {
            respostaModelo.setMensagem("O nome do produto é obrigatório!");
            return new ResponseEntity<>(respostaModelo, HttpStatus.BAD_REQUEST);
        }
        if ("".equals(produtoModelo.getMarca())) {
            respostaModelo.setMensagem("O nome da marca é obrigatória!");
            return new ResponseEntity<>(respostaModelo, HttpStatus.BAD_REQUEST);
        }
        if ("cadastrar".equals(operacao)) {
            return new ResponseEntity<>(produtoRepositorio.save(produtoModelo), HttpStatus.CREATED);
        }
        return new ResponseEntity<>(produtoRepositorio.save(produtoModelo), HttpStatus.OK);
    }

    // Método para remover produtos
    public ResponseEntity<RespostaModelo> remover(Long codigo) {
        produtoRepositorio.deleteById(codigo);
        respostaModelo.setMensagem("O produto foi removido com sucesso");
        return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.OK);
    }
}
