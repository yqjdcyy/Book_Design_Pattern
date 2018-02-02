package state.vo;

import state.work.Machine;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public class NoQuarterState implements State {

    private Machine machine;

    public NoQuarterState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("NoQuarterState: insert quarter");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.err.println("NoQuarterState: fail to eject quarter");
    }

    @Override
    public void turnCrank() {

        System.err.println("NoQuarterState: fail to turn crank");
    }

    @Override
    public void dispense() {
        System.err.println("NoQuarterState: fail to dispense");
    }
}
