package sovos.calculator.main.multiplicacao;

public class Multiplicacao {
    private float val1;
    private float val2;
    private float resultado;

    public float getVal1() {
        return val1;
    }
    public void setVal1(float val1) {
        this.val1 = val1;
    }

    public float getVal2() {
        return val2;
    }
    public void setVal2(float val2) {
        this.val2 = val2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public void multiValores(){
        setResultado(this.val1 * this.val2);
    }
    public void multiValores(float valor1, float valor2){
        setResultado(valor1 * valor2);
    }
}
