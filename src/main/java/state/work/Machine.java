package state.work;

import state.vo.*;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public class Machine {

    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;
    private WinnerState winnerState;
    private SoldOutState soldOutState;

    private int size;
    private State state;

    public Machine(int size) {

        this.size = size;

        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        soldOutState = new SoldOutState(this);

        if (size > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }


    // setter.*
    public void setState(State state) {
        this.state = state;
    }

    // getter.*
    public State getState() {
        return state;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public WinnerState getWinnerState() {
        return winnerState;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // common.*
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }
}
