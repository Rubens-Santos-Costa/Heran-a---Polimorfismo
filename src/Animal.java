//Exercicio 1
public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void emitirSom() {
        System.out.println("Animal emitindo som");
    }

    public void correr() {
        System.out.println("Animal correndo");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo");
    }

    @Override
    public void correr() {
        System.out.println("Cachorro correndo");
    }
}


class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }


    public void emitirSom() {
        System.out.println("Cavalo relinchando");
    }

 
    public void correr() {
        System.out.println("Cavalo correndo");
    }
}

class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }


    public void emitirSom() {
        System.out.println("Preguiça emitindo som");
    }

    public void subirArvores() {
        System.out.println("Preguiça subindo em árvores");
    }
    //Exercicio 2
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 7);
        Animal preguica = new Preguica("Flash", 3);

        Animal[] animais = {cachorro, cavalo, preguica};

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }


}
