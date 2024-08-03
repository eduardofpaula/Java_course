package string_treatment;

public class FunctionsSrings {
    public static void main(String[] args) {
        String original = "abcde FGHI ABC abc DSADAS      ";

        String minusculas = original.toLowerCase(); // letras minusculas
        String maisculas = original.toUpperCase(); // letras maisculas
        String noSpaces = original.trim(); // remover espaços
        String sub = original.substring(2); // subString(imprimir) a partir da posição 2
        String sub2 = original.substring(2,9); // subString(imprimir) da posição 2 até 9
        String rep = original.replace('a','y'); // trocar letra a por y
        String rep2 = original.replace("abc","eduardo"); // trocar string abc por eduardo
        int i = original.indexOf("bc"); // retornar o numero da posição onde encontrar o primeiro elemento
        int j = original.lastIndexOf("bc"); // indexOf de tras pra frente

        System.out.println("Original: /" + original + "/");
        System.out.println("Letras minusculas: /" + minusculas + "/");
        System.out.println("Letras maiúsculas: /" + maisculas + "/");
        System.out.println("Sem espaços: /" + noSpaces + "/");
        System.out.println("Substring: /" + sub + "/");
        System.out.println("Substring(2,9): /" + sub2 + "/");
        System.out.println("Replace('a','y'): /" + rep + "/");
        System.out.println("Replace('abc','xy'): /" + rep2 + "/");
        System.out.println("Index Of 'bc': " + i);
        System.out.println("Last Index Of 'bc': " + j);

        String s = "Eduardo muito gostosão"; // separar as palavras em um array
        String[] split = s.split(" "); // definindo a condição para separar

        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        /*
        EXEMPLO DE COMENTARIO
         */

    }
}
