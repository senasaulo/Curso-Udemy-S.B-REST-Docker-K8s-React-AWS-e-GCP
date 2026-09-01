package br.com.senasaulo.operations;

import br.com.senasaulo.exception.UnsupportedMathOperationException;


public class Operations {

    public Double sum(Double numberOne , Double numberTwo)  {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne , Double numberTwo)  {
        return numberOne - numberTwo;
    }

    public Double division(Double numberOne , Double numberTwo)  {
        if (numberTwo == 0) {
            throw new UnsupportedMathOperationException("Não existe divisao por zero");
        }
        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne , Double numberTwo)  {
        return (numberOne + numberTwo) / 2;
    }

    public Double squareRoot(Double number) {
        return Math.sqrt(number);
    }

}
