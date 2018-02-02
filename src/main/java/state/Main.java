package state;

import state.work.Machine;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        Machine machine = new Machine(5);

        machine.dispense();
        System.out.println();

        machine.insertQuarter();
        machine.ejectQuarter();
        System.out.println();

        for (int i = 0; i < 5; i++) {
            machine.insertQuarter();
            machine.turnCrank();
            machine.dispense();
        }
    }
}
