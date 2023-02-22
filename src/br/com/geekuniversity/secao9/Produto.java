package br.com.geekuniversity.secao9;

// Classes
//- Nome de Classes iniciam com letra MAIÚSCULA
//- Nome não deve conter: Acento, caracteres especiais e espaço
//- Classes Java não tem MAIN
//- Tudo que estiver dentro de {} faz parte da Classe

// Atributos
//- Características da classe/molde/modelo de dados
//- Atributos -> variáveis da classe
//- Atributos -> estados;
//- Atributos -> nomeados letras minúsculas, sem espaço, sem caracteres especiais, sem acentuação

// Métodos
//- Açao que é realizada por um objeto/instancia da classe
//- Métodos -> comportamentos dos objetos da classe
//- a) Tipo de retorno (tipo de dado que a função vai retornar)
//- b) Nome -> açao que realiza
//- c) Parâmetros/Argumentos de entrada (Opcional)
//- d) Retorno (Opcional - depende do tipo de retorno)
public class Produto {
    String nome;
    float preco;
    float desconto;

    // Método para aumentar o preço do produto
    void aumentaPreco(float valor) {
        this.preco += valor;
    }
}
