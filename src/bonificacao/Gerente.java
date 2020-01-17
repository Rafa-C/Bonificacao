package bonificacao;

public class Gerente extends Funcionario{


    public Gerente(String nome, String cpf, double salario, int cargo) {
        super(nome, cpf, salario, cargo);
    }

    public double  bonificacao(double salario){
    salario = salario*0.5;
    return  salario;
    }

}
