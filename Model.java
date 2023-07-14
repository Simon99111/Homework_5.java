public class Model {
private double result;

public void add(double number1, double number2, char op) {
    switch(op) {
        case '+': result = number1 + number2;
           break;
        case '-': result = number1 - number2;
           break;
        case '*': result = number1 * number2;
           break;
        case '/': result = number1 / number2;
           break;
        default:  System.out.printf("Error! Enter correct operator");
           return;
     }
}

public double getResult() {
    return result;
}
}