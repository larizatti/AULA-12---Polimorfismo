public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();
        
        System.out.println("Eu sou: Eevee");
        System.out.println("Ataque: " +e.ataque());
        System.out.println("Defesa: " +e.defesa());
        System.out.println("Especial: " +e.especial());

        System.out.println("Eu sou: Joelton");
        System.out.println("Ataque: " +j.ataque());
        System.out.println("Defesa: " +j.defesa());
        System.out.println("Especial: " +j.especial());

        e=j; //A vantagem do polimorfismo é um objeto receber o valor do outro
    }
}
