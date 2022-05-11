package es.escuelaces.alberto.lingo;

import es.escuelaces.alberto.lingo.interfaces.IGame;

public class Main {
    public static void main(String[] args) {
        IGame game;
        System.out.println(args);
        if (args.length >= 2) {
            String arg = args[1].toUpperCase();
            if (arg.indexOf("I") != -1) {
                game = new LingoInteractivo(args[0], 'A');
                game.main();
            }
            else if(arg.indexOf("A") != -1) {
                game = new LingoAutomatico(args[0], 'A');
                game.main();
            }else {
                System.err.println("El argumento \"" + arg + "\" no es valido");
            }
        } else if(args.length == 1) {
            game = new LingoInteractivo(args[0], 'A');
            game.main();
        } else {
            System.err.println("Faltan argumentos");
            System.exit(0);
        }
    }
}
