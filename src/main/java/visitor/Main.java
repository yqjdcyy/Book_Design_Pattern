package visitor;

import visitor.vo.Car;
import visitor.work.PrinterVisitor;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        new Car().accept(new PrinterVisitor());
    }
}
