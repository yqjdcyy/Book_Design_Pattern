package command.basic.work;

import command.basic.vo.Light;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
