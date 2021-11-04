package br.com.joaopcamposs.controller;

import br.com.joaopcamposs.exception.UnsuportedMathOperationExcepiton;
import org.springframework.web.bind.annotation.*;
import br.com.joaopcamposs.converters.NumberConverter;

@RestController
public class MathController {

    NumberConverter nc = new NumberConverter();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!nc.isNumeric(numberOne) || !nc.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationExcepiton("Please set a numeric value!");
        }
        double sum = nc.convertToDouble(numberOne) + nc.convertToDouble(numberTwo);
        return sum;
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!nc.isNumeric(numberOne) || !nc.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationExcepiton("Please set a numeric value!");
        }
        double sub = nc.convertToDouble(numberOne) - nc.convertToDouble(numberTwo);
        return sub;
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!nc.isNumeric(numberOne) || !nc.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationExcepiton("Please set a numeric value!");
        }
        double mult = nc.convertToDouble(numberOne) * nc.convertToDouble(numberTwo);
        return mult;
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!nc.isNumeric(numberOne) || !nc.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationExcepiton("Please set a numeric value!");
        }
        double div = nc.convertToDouble(numberOne) / nc.convertToDouble(numberTwo);
        return div;
    }

    @RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double med(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!nc.isNumeric(numberOne) || !nc.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationExcepiton("Please set a numeric value!");
        }
        double med = (nc.convertToDouble(numberOne) + nc.convertToDouble(numberTwo))/2;
        return med;
    }

    @RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
    public Double sqrt(@PathVariable("numberOne") String numberOne) throws Exception {
        if(!nc.isNumeric(numberOne)){
            throw new UnsuportedMathOperationExcepiton("Please set a numeric value!");
        }
        double sqrt = (Double) Math.sqrt(nc.convertToDouble(numberOne));
        return sqrt;
    }


}
