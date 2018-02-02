package command.work;

import command.vo.Light;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
