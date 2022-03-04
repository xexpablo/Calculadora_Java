package sovos.calculator.main;

import javax.swing.*;

public class Calculadora {
    private float val1;
    private float val2;

    public void setVal1(float val1) {
        this.val1 = val1;
    }

    public void setVal2(float val2) {
        this.val2 = val2;
    }

    public Calculadora(){}

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        float soma, sub, div, multi;
        float n1,n2;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Qual o Valor 1?"));
        calc.setVal1(n1);
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Qual o Valor 2?"));
        calc.setVal2(n2);

        System.out.println("O Valor 1 é: " + calc.val1);
        System.out.println("O Valor 2 é: " + calc.val2 + "\n");

        soma = calc.val1 + calc.val2;
        System.out.println("O Resultado da Soma é: " + soma);

        sub = calc.val1 - calc.val2;
        System.out.println("O Resultado da Subtração é: " + sub);

        div = calc.val1 / calc.val2;
        System.out.println("O Resultado da Divisão é: " + div);

        multi = calc.val1 * calc.val2;
        System.out.println("O Resultado da Multiplicação é: " + multi);

    }
}
