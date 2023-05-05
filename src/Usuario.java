public class Usuario implements ClassificInd{
    private String nome;
    private int idade;
    private String email;
    private int senha;
    private String listfavoritos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getListfavoritos() {
        return listfavoritos;
    }

    public void setListfavoritos(String listfavoritos) {
        this.listfavoritos = listfavoritos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void validadorClassific() {
        if (this.idade < this.getClassindicativa()){
            System.out.println("Esse filme não é indicado para o publico da sua idade!");
        } else {
            System.out.println("Escolha de acordo com a classificação indicativa!");
        }
    }
}
