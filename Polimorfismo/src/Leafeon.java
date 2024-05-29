public class Leafeon extends Eevee {

    public Leafeon (String nome, String tipo, double altura, int hP, double peso) {
        super (nome, tipo, altura, hP, peso);
    }
@Override //serve para sobrepor os métodos que estavam presentes no Eevee

public String ataque() {
        return "Grass Attack";
    }
@Override
    public String defesa(){
        return "Grass Defense";
    }
@Override
    public String especial(){
        return "Special Grass";
}

}