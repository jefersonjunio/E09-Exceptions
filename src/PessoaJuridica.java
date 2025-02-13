import java.util.Date;
import java.util.Objects;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private int numFuncionarios;
    private String setor;

    public PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor) {
        setNome(nome);
        setEndereco(endereco);
        setData(new Date());
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String toString() {

        String pessoaJuridicaStr = ("\nNome: " + this.getNome() +
                "\nCNPJ: " + this.getCnpj() +
                "\nFuncionarios: " + this.getNumFuncionarios() +
                "\nSetor: " + this.getSetor() +
                "\nEndereco: " + this.getEndereco() +
                "\nData: " + this.getData());

        return pessoaJuridicaStr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PessoaJuridica) {
            PessoaJuridica objPessoaJuridica = (PessoaJuridica) obj;

            if (this.cnpj.equals(objPessoaJuridica.cnpj)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    @Override
    public boolean autentica(String chave) {
        if(chave.equals(this.cnpj))
            return true;
        else
            return false;
    }
}