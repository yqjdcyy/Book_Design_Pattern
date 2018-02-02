package state.vo;

import state.work.Machine;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public class WinnerState implements State {

    private Machine machine;

    public WinnerState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.err.println("WinnerState: had insert the quarter");
    }

    @Override
    public void ejectQuarter() {

        System.out.println("WinnerState: eject the quarter");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.err.println("WinnerState: prepare");
    }

    @Override
    public void dispense() {

        System.out.println("WinnerState: dispense");
        machine.setSize(machine.getSize() - (machine.getSize() >= 2 ? 2 : 1));
        machine.setState(
                machine.getSize() <= 0
                        ? machine.getSoldOutState()
                        : machine.getNoQuarterState());
    }
}
