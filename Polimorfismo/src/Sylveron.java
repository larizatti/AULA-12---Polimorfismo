public class Sylveron extends Eevee {

    public Sylveron (String nome, String tipo, double altura, int hP, double peso) {
        super (nome, tipo, altura, hP, peso);
    }

@Override //serve para sobrepor os métodos que estavam presentes no Eevee

public String ataque() {
        return "Fairy Attack";
    }
@Override
    public String defesa(){
        return "Fairy Defense";
    }
@Override
    public String especial(){
        return "Special Fairy";
}

}