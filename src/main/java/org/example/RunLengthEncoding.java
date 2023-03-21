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

    public void decode(String phrase){

        StringBuilder decodePhr = new StringBuilder("");
        for(int i = 0; i<phrase.length();i++){

        }
    }
}
