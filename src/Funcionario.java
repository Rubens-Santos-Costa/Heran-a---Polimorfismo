// Exercicio 5
class Funcionario {
    private String nome;
    private int codigoFuncional;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }
}

class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaEnsinoBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaEnsinoBasico) {
        super(nome, codigoFuncional);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }
}


class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, escolaEnsinoBasico);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }
}


class FuncionarioGraduado extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
        super(nome, codigoFuncional, escolaEnsinoBasico, escolaEnsinoMedio);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }
}
