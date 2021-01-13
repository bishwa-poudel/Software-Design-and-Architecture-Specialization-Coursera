/**
* @author Bishwa on 15/10/2020
*/
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine oldVendingMachine;

    public void connect(OldCoffeeMachine oldVendingMachine) {
    this.oldVendingMachine = oldVendingMachine;
    }

    @Override
    public void chooseFirstSelection() {
    oldVendingMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
    oldVendingMachine.selectB();
    }
}