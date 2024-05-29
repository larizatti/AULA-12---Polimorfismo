public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee ("Eevee","Normal", 0.3, 4, 6.5);
        Jolteon j = new Jolteon("Jolteon", "Eletric", 0.8, 4, 24.5);
        Flareon f = new Flareon("Flareon","Fire", 0.9, 4, 25);
        Glaceon g = new Glaceon("Glaceon","Ice", 0.8, 4, 25.9);
        Leafeon l = new Leafeon("Leafeon","Grass", 1.0, 4, 25.5);
        Sylveron s = new Sylveron("Sylveron", "Fairy", 1.0, 6, 23.5);
        Umbreon u = new Umbreon("Umbreon", "Dark", 1.0, 6, 27);
        Vaporeon v = new Vaporeon("Vaporeon","Water", 1.0, 8, 29);
        Espeon ep = new Espeon("Espeon","Psychic", 0.9, 4, 26.5);


        e.imprimir();
        j.imprimir();
        f.imprimir();
        g.imprimir();
        l.imprimir();
        s.imprimir();
        u.imprimir();
        v.imprimir();
        ep.imprimir();
       
    }
}
