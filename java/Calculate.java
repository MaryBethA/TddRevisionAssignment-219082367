/*
*Mary-Beth Agulhas
* 219082367
* 4 February 2022
* Calculate.java
 */

public class Calculate {
    private int num1, num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Calculate{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
}
