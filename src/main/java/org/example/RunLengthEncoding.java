package org.example;

public class RunLengthEncoding {
    //LIFE IS ABOUT FAIL AND CONTINUE

    private String phrase;

    public String encode(String phrase) {
        //mi manera
        int count = 1;
        StringBuilder encodePhrase = new StringBuilder("");
        char wordBefore = phrase.toLowerCase().charAt(0);
        for (int i = 1; i < phrase.length(); i++) {
            if (phrase.toLowerCase().charAt(i) == wordBefore) {
                count++;
                wordBefore = phrase.toLowerCase().charAt(i);
            }
            else {
                if (count == 1){
                    encodePhrase.append(phrase.toLowerCase().charAt(i-1));
                }
                else{
                    encodePhrase.append(count);
                    encodePhrase.append(phrase.toLowerCase().charAt(i-1));
                }
                wordBefore = phrase.toLowerCase().charAt(i);
                count = 1;
            }
        }
        return encodePhrase.toString();
    }

    public String decode(String phrase){

        StringBuilder decodePhr = new StringBuilder("");
        int i = 0;

        //Se recorre la phrase para decodificar
        while (i < phrase.length()){

            //si es un digito
            if (Character.isDigit(phrase.charAt(i))){
                int j = 1;
                while(j <= Character.getNumericValue(phrase.charAt(i))) {
                    decodePhr.append(phrase.charAt(i + 1)); //se debe agregar tantas veces este en el numero anterior
                    j++;
                }
                i +=2;
            }

            //si no es un digito
            else{
                decodePhr.append(phrase.charAt(i));
                i++;
            }
        }
        return decodePhr.toString();
    }
}
