package state.vo;

import state.work.Machine;

import java.util.Random;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public class HasQuarterState implements State {

    private Machine machine;
    private Random random;

    public HasQuarterState(Machine machine) {
        this.machine = machine;
        this.random = new Random();
    }

    @Override
    public void insertQuarter() {

        System.err.println("HasQuarterState: had insert the quarter");
    }

    @Override
    public void ejectQuarter() {

        System.out.println("HasQuarterState: eject the quarter");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {

        if (0 == random.nextInt() % 9) {
            System.out.println("HasQuarterState: winner state");
            machine.setState(machine.getWinnerState());
        } else {
            System.out.println("HasQuarterState: normal sold state");
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.err.println("HasQuarterState: fail to dispense");
    }
}
