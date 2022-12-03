
package ClassesPessoa;

public class Gerente extends Funcionario{
    public String area;
    
    @Override
    public double calcularImposto(){
        //Imposto é de 5% do salário
        double aux = 0.95;
        return super.salario * aux;
    }
    
    public void imprimeDados() {
        System.out.println("O nome do Gerente e: " + super.nome + 
                "\nA data de Nascimento do Gerente: " + super.data + 
                "\nO Salario bruto do Gerente: " + this.salario +
                "\nO Salario liquido do Gerente: " + this.calcularImposto()+
                "\nA area do Gerente: " + this.area);
    }
    
}
