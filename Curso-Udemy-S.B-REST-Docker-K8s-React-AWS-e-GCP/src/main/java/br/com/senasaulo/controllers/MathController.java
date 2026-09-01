package br.com.senasaulo.controllers;

import br.com.senasaulo.operations.Operations;
import br.com.senasaulo.requestconverters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/math")
public class MathController {

    private Operations operations = new Operations();

    // http://Localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne ,
                      @PathVariable("numberTwo") String numberTwo)  {
         return operations.sum(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
    }

    // http://Localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable("numberOne") String numberOne ,
                           @PathVariable("numberTwo") String numberTwo) {
        return operations.subtraction(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
    }
    // http://Localhost:8080/math/division/3/5
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable("numberOne") String numberOne ,
                           @PathVariable("numberTwo") String numberTwo) {
        return operations.division(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
    }

    // http://Localhost:8080/math/mean/3/5
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(@PathVariable("numberOne") String numberOne ,
                           @PathVariable("numberTwo") String numberTwo) {
        return operations.mean(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
    }

    // http://Localhost:8080/math/squareRoot/5
    @RequestMapping("/squareRoot/{number}")
    public Double squareRoot(@PathVariable("number") String number) {
        return operations.squareRoot(NumberConverter.convertToDouble(number));
    }

}

