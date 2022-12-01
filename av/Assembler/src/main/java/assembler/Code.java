/**
 * Curso: Elementos de Sistemas
 * Arquivo: Code.java
 */

package assembler;

/**
 * Traduz mnemônicos da linguagem assembly para códigos binários da arquitetura Z0.
 */
public class Code {

    /**
     * Retorna o código binário do(s) registrador(es) que vão receber o valor da instrução.
     * @param  mnemnonic vetor de mnemônicos "instrução" a ser analisada.
     * @return Opcode (String de 4 bits) com código em linguagem de máquina para a instrução.
     */
    public static String dest(String[] mnemnonic) {

    	return "";
    }

    /**
     * Retorna o código binário do mnemônico para realizar uma operação de cálculo.
     * @param  mnemnonic vetor de mnemônicos "instrução" a ser analisada.
     * @return Opcode (String de 7 bits) com código em linguagem de máquina para a instrução.
     */
    public static String comp(String[] mnemnonic) {
        /* TODO: implementar */
        switch (mnemnonic[0]) {
            

            case "addw":

            String output = "0";
            String r0 = "";
            String b14 = "";
            boolean flag = false;
            String op = mnemnonic[0];
            String calc = "";

            String a = mnemnonic[1];
            String b = mnemnonic[2];
            if (op.equals("addw")) {

                if (a.equals("(%A)") || b.equals("(%A)")) {
                    flag = true;
                    r0 = "1";
                } else {
                    flag = false;
                    r0 = "0";
                }

                String destiny = mnemnonic[3];
                if (!flag) {

                    if ((a.equals("%D") && b.equals("%A")) || (a.equals("%A") && b.equals("%D"))) {
                        calc = "000010";
                        b14 = "0";
                    } else if ((a.equals("$1") && b.equals("%A")) || (a.equals("%A") && b.equals("$1"))) {
                        calc = "110111";
                        b14 = "0";
                    } else if ((a.equals("(%A)") && b.equals("%A")) || (a.equals("%A") && b.equals("(%A)"))) {
                        calc = "000010";
                        r0 = "0";
                        b14 = "1";

                    } else {
                        calc = "011111";
                        b14 = "0";
                    }
                } else {
                    if ((a.equals("%D") && b.equals("(%A)")) || (a.equals("(%A)") && b.equals("%D"))) {
                        b14 = "0";
                        calc = "000010";
                    } else if ((a.equals("$1") && b.equals("(%A)")) || (a.equals("(%A)") && b.equals("$1"))) {
                        b14 = "0";
                        calc = "110111";
                    } else if ((a.equals("(%A)") && b.equals("(%A)"))) {
                        calc = "000010";
                        b14 = "1";
                    }

                    }
                }
                

                output = output + b14 + r0 + calc;
                return output;


            default:
                return "000000000";
        }
    }

    /**
     * Retorna o código binário do mnemônico para realizar uma operação de jump (salto).
     * @param  mnemnonic vetor de mnemônicos "instrução" a ser analisada.
     * @return Opcode (String de 3 bits) com código em linguagem de máquina para a instrução.
     */
    public static String jump(String[] mnemnonic) {

    	return "";
    }

    /**
     * Retorna o código binário de um valor decimal armazenado numa String.
     * @param  symbol valor numérico decimal armazenado em uma String.
     * @return Valor em binário (String de 15 bits) representado com 0s e 1s.
     */
    public static String toBinary(String symbol) {

    	return "";
    }

}
