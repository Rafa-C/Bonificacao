package bonificacao;

public class App {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario(
                "Rafa",
                "434523",
                10200,
                0);

        Gerente gerente1 = new Gerente(
                "F",
                "34344",
                11900,
                1);

        System.out.println(funcionario1.bonificacao(funcionario1.salario));
        System.out.println(gerente1.bonificacao(gerente1.salario));






    }


}
