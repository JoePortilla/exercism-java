package SqueakyClean;

public class SqueakyClean {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.out.println(clean("my   Id"));
        System.out.println(clean(" myId "));
        System.out.println(clean("my\0Id"));
        System.out.println(clean("à-ḃç"));
        System.out.println(clean("a1😀2😀3😀b"));
        System.out.println(clean("MyΟβιεγτFinder"));
        System.out.println(clean("Hola-como-estas Bebe"));

    }

    public static String clean(String identifier) {
        // Eliminar espacios
        identifier = identifier.replaceAll("\\s", "_");

        // Eliminar caracteres control
        identifier = identifier.replaceAll("\\\0", "CTRL");

        // Kebab-case a camel-case
        StringBuilder camelCase = new StringBuilder(identifier);

        for (int i = 0; i < camelCase.length(); i++) {
            if (camelCase.charAt(i) == '-') {
                camelCase.deleteCharAt(i);
                camelCase.replace(i, i + 1, String.valueOf(Character.toUpperCase(camelCase.charAt(i))));
            }
        }

        identifier = camelCase.toString();

        // Eliminar caracteres que no son letras
        StringBuilder onlyLetters = new StringBuilder();
        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isLetter(c)) {
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
