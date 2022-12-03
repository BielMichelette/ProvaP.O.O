
package ClassesPessoa;

public class Cliente extends Pessoa{
    public int codigo;

    @Override
    public void imprimeDados() {
        System.out.println("O nome do Cliente e: " + super.nome + 
                "\nA data de Nascimento do cliente: " + super.data + 
                "\nCodigo do Cliente: " + this.codigo);
    }
    
    
    
}
