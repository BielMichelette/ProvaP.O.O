
package ClassesPessoa;

public class Funcionario extends Pessoa{
    public double salario;

    public double calcularImposto(){
        // Imposto é de 3% do salário
        double aux = 0.97;
        return salario * aux;
    }
    @Override
    public void imprimeDados() {
        System.out.println("O nome do Funcionario e: " + super.nome + 
                "\nA data de Nascimento do Funcionario: " + super.data + 
                "\nO Salario bruto do Funcioario: " + this.salario +
                "\nO Salario liquid do Funcionarioo: " + this.calcularImposto());
    }
    
    
}
