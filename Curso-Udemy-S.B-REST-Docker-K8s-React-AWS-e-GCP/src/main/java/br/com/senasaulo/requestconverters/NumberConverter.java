package br.com.senasaulo.requestconverters;

public class NumberConverter {

    private static boolean isNumeric(String strNumber){
        if (strNumber == null || strNumber.isEmpty()) {
            throw new IllegalArgumentException("O valor não pode ser nulo ou vazio");
        }
        String number = strNumber.replace(",",".");
        if (!number.matches("[-+]?[0-9]*\\.?[0-9]+")) {
            throw new IllegalArgumentException("O valor informado não é numérico: " + strNumber);
        }
        return true;
    }

    public static Double convertToDouble(String strNumber) {
        isNumeric(strNumber);
        String number = strNumber.replace(",",".");
        return Double.parseDouble(number);
    }


}
