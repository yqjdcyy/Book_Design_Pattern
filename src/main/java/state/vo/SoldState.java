package state.vo;

import state.work.Machine;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public class SoldState implements State {

    private Machine machine;

    public SoldState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.err.println("SoldState: had insert the quarter");
    }

    @Override
    public void ejectQuarter() {

        System.out.println("SoldState: eject the quarter");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.err.println("SoldState: prepare");
    }

    @Override
    public void dispense() {

        System.out.println("SoldState: dispense");
        machine.setSize(machine.getSize() - 1);
        machine.setState(
                machine.getSize() <= 0
                        ? machine.getSoldOutState()
                        : machine.getNoQuarterState());
    }
}
