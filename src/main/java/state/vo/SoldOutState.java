package state.vo;

import state.work.Machine;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public class SoldOutState implements State{

    private Machine machine;

    public SoldOutState(Machine machine) {

        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.err.println("SoldOutState: eject quarter");
    }

    @Override
    public void ejectQuarter() {
        System.err.println("SoldOutState: no quarter");
    }

    @Override
    public void turnCrank() {
        System.err.println("SoldOutState: no quarter");
    }

    @Override
    public void dispense() {
        System.err.println("SoldOutState: sold out");
    }
}
