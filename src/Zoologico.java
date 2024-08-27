//Exercicio 4
class Zoologico {
    private Animal[] jaulas = new Animal[10];

    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < 10) {
            jaulas[index] = animal;
        }
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                System.out.println("Animal na jaula: " + animal.getNome());
                animal.emitirSom();
                if (animal instanceof Cachorro || animal instanceof Cavalo) {
                    animal.correr();
                } else if (animal instanceof Preguica) {
                    ((Preguica) animal).subirArvores();
                }
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(0, new Cachorro("Rex", 5));
        zoologico.adicionarAnimal(1, new Cavalo("Spirit", 7));
        zoologico.adicionarAnimal(2, new Preguica("Flash", 3));
        zoologico.adicionarAnimal(3, new Cachorro("Max", 4));
        zoologico.adicionarAnimal(4, new Cavalo("Silver", 6));
        zoologico.adicionarAnimal(5, new Preguica("Slow", 2));
        zoologico.adicionarAnimal(6, new Cachorro("Buddy", 8));
        zoologico.adicionarAnimal(7, new Cavalo("Thunder", 9));
        zoologico.adicionarAnimal(8, new Preguica("Lazy", 4));
        zoologico.adicionarAnimal(9, new Cavalo("Blaze", 5));

        zoologico.percorrerJaulas();
    }
}
