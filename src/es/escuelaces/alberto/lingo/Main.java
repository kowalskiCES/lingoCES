package es.escuelaces.alberto.lingo;

import es.escuelaces.alberto.lingo.interfaces.IGame;

public class Main {
    public static void main(String[] args) {
        System.out.println(args);
        if (args.length >= 2) {
            String arg = args[1].toUpperCase();
            if (arg.indexOf("I") != -1) {
                IGame game = new LingoInteractivo(args[0], 'A');
            }
            else if(arg.indexOf("A") != -1) {
                IGame game = new LingoAutomatico(args[0], 'A');
            }else {
                System.err.println("El argumento \"" + arg + "\" no es valido");
            }

        } else if(args.length == 1) {
            IGame game = new LingoInteractivo(args[0], 'A');
        } else {
            System.err.println("Faltan argumentos");
            System.exit(0);
        }
    }
}
