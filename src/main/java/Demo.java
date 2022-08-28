public class Demo {

    public static void main(String[] args){
        LivroDeBiblioteca L1 = new LivroDeBiblioteca("POO com JAVA", "João", "Abril", (short)2008, "10jkdjnsd33");

        System.out.println(L1.getDados());
        System.out.println();

        if(!L1.getEmprestado()){
            L1.Empresta();
            System.out.println("O livro " + L1.getTitulo() + " foi emprestado com sucesso!\nDevera ser devolvido em " + L1.diasemprestimo + " dias.");
        }else{
            System.out.println("O livro " + L1.getTitulo() + " não está disponivel para emprestimo");
        }

        System.out.println();

        if(!L1.getEmprestado()){
            L1.Empresta();
            System.out.println("O livro " + L1.getTitulo() + " foi emprestado com sucesso!\nDevera ser devolvido em " + LivroDeBiblioteca.diasemprestimo + " dias.");
        }else{
            System.out.println("O livro " + L1.getTitulo() + " não está disponivel para emprestimo");
        }
    }
}