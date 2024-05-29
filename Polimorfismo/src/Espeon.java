public class Espeon extends Eevee {

public Espeon (String nome, String tipo, double altura, int hP, double peso) {
        super (nome, tipo, altura, hP, peso);
}
@Override //serve para sobrepor os métodos que estavam presentes no Eevee

public String ataque() {
        return "Psychic Attack";
    }
@Override
    public String defesa(){
        return "Psychic Defense";
    }
@Override
    public String especial(){
        return "Special Psychic";
}

}