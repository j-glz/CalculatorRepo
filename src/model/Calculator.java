package model;

public class Calculator {
    private final OperationFactory operationFactory;

    public Calculator() {
        this.operationFactory = new OperationFactory();
    }

    public  OperationFactory getOperationFactory() {
        return operationFactory;
    }
}
