package SqueakyClean;

public class SqueakyClean {
    public static void main(String[] args) {
        System.out.println(clean("my   Id"));
        System.out.println(clean(" myId "));
        System.out.println(clean("my\0Id"));
        System.out.println(clean("my\0\r\u007FId"));
        System.out.println(clean("à-ḃç"));
        System.out.println(clean("a1😀2😀3😀b"));
        System.out.println(clean("MyΟβιεγτFinder"));
        System.out.println(clean("Hola-como-estas Bebe"));

    }

    public static String clean(String identifier) {
        // Reemplazar espacios con _
        identifier = identifier.replaceAll(" ", "_");

        // Reemplazar caracteres control
        StringBuilder controlCharacters = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isISOControl(c)) {
                controlCharacters.append("CTRL");
            } else {
                controlCharacters.append(c);
            }
        }

        identifier = controlCharacters.toString();

        // Kebab-case a camel-case
        StringBuilder camelCase = new StringBuilder(identifier);

        for (int i = 0; i < camelCase.length(); i++) {
            if (camelCase.charAt(i) == '-') {
                camelCase.deleteCharAt(i);
                camelCase.replace(i, i + 1,
                        String.valueOf(Character.toUpperCase(camelCase.charAt(i))));
            }
        }

        identifier = camelCase.toString();

        // Eliminar caracteres que no son letras
        StringBuilder onlyLetters = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isLetter(c) || c == '_') {
                onlyLetters.append(c);
            }
        }

        identifier = onlyLetters.toString();

        // Eliminar letras griegas
        StringBuilder noGreek = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (!(c >= 'α' && c <= 'ω')) {
                noGreek.append(c);
            }
        }

        identifier = noGreek.toString();

        return identifier;
    }
}
