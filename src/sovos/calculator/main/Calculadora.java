package sovos.calculator.main;

import sovos.calculator.main.divisao.Divisao;
import sovos.calculator.main.multiplicacao.Multiplicacao;
import sovos.calculator.main.soma.Soma;
import sovos.calculator.main.subtracao.Subtracao;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Soma somatoria = new Soma();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        int operacao;
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Qual operação deseja fazer?\n 1 - Soma\n 2 - Subtração\n 3 - Divisão\n 4 - Multiplicação"));

        switch (operacao) {
            case 1:
                somatoria.setVal1(50);
                somatoria.setVal2(75);
                somatoria.somarValoresAtributos();
                System.out.println("O Resultado da Soma é: " + somatoria.getResultado());
                somatoria.somarValoresParametros(30,30);
                System.out.println("O Resultado da Soma é: " + somatoria.getResultado());
                somatoria.setVal2(77);
                System.out.println("O Resultado da Soma é: " + somatoria.somarValoresAtribParam(23) + "\n");
                break;
            case 2:
                System.out.println("O Resultado da Subtração é: " + calculadora.subValoresAtributos());
                System.out.println("O Resultado da Subtração é: " + calculadora.subValoresParametros(40,30));
                System.out.println("O Resultado da Subtração é: " + calculadora.subValoresAtribParam(77));
                break;
            case 3:
                System.out.println("O Resultado da Divisão é: " + calculadora.divValoresAtributos());
                System.out.println("O Resultado da Divisão é: " + calculadora.divValoresParametros(40,20));
                System.out.println("O Resultado da Divisão é: " + calculadora.divValoresAtribParam(25));
                break;
            case 4:
                System.out.println("O Resultado da Multiplicação é: " + calculadora.multiValoresAtributos());
                System.out.println("O Resultado da Multiplicação é: " + calculadora.multiValoresParametros(30,30));
                System.out.println("O Resultado da Multiplicação é: " + calculadora.multiValoresAtribParam(50));
                break;
        }
    }

    Subtracao subtracao = new Subtracao();
    Divisao divisao = new Divisao();
    Multiplicacao multiplicacao = new Multiplicacao();

    //Subtração
    private float subValoresAtributos(){
        subtracao.setVal1(75);
        subtracao.setVal2(50);
        subtracao.subValores();
        return subtracao.getResultado();
    }

    private float subValoresParametros(float valor1, float valor2){
        subtracao.setVal1(valor1);
        subtracao.setVal2(valor2);
        subtracao.subValores();
        return subtracao.getResultado();
    }

    private float subValoresAtribParam(float algumValor){
        subtracao.setVal2(23);
        return algumValor - subtracao.getVal2();
    }

    //Divisão
    private float divValoresAtributos(){
        divisao.setVal1(75);
        divisao.setVal2(50);
        divisao.divValores();
        return divisao.getResultado();
    }

    private float divValoresParametros(float valor1, float valor2){
        divisao.setVal1(valor1);
        divisao.setVal2(valor2);
        divisao.divValores();
        return divisao.getResultado();
    }

    private float divValoresAtribParam(float algumValor){
        divisao.setVal2(5);
        return algumValor / divisao.getVal2();
    }

    //Multiplicação
    private float multiValoresAtributos(){
        multiplicacao.setVal1(75);
        multiplicacao.setVal2(50);
        multiplicacao.multiValores();
        return multiplicacao.getResultado();
    }

    private float multiValoresParametros(float valor1, float valor2){
        multiplicacao.setVal1(valor1);
        multiplicacao.setVal2(valor2);
        multiplicacao.multiValores();
        return multiplicacao.getResultado();
    }

    private float multiValoresAtribParam(float algumValor){
        multiplicacao.setVal2(2);
        return algumValor * multiplicacao.getVal2();
    }
}
