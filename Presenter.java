public class Presenter {
private Model model;
private View view;

public Presenter(Model model, View view) {
    this.model = model;
    this.view = view;
}

public void onAddButtonClicked() {
    double number1 = view.getUserInput();
    double number2 = view.getUserInput();
    char op = view.getOperation();

    model.add(number1, number2, op);
    double result = model.getResult();

    view.displayResult(result);
}
}
