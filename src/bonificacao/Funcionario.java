package bonificacao;

public class Funcionario {
    String nome;
    String cpf;
    double salario;
    int cargo;

    public Funcionario(String nome, String cpf, double salario, int cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double bonificacao(double salario){
     salario = salario*0.1;
    return salario;
    }

}
