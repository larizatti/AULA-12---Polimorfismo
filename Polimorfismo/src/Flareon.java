public class Flareon extends Eevee {

    public Flareon (String nome, String tipo, double altura, int hP, double peso) {
        super (nome, tipo, altura, hP, peso);
}
    

@Override //serve para sobrepor os métodos que estavam presentes no Eevee, essa é a vantagem

public String ataque() {
    return "Fire Attack";
}
@Override
public String defesa(){
    return "Fire Defense";
}
@Override
public String especial(){
    return "Special Fire";
}

}