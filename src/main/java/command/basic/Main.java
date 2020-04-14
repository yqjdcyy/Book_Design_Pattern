package command.basic;

import command.basic.vo.*;
import command.basic.work.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        // init
        List<Command> list = new ArrayList<>();

        // init.light
        Light light = new PhoneLight();
        list.add(new LightOnCommand(light));
        list.add(new LightOffCommand(light));
        light = new SunLight();
        list.add(new LightOnCommand(light));
        list.add(new LightOffCommand(light));
        light = new WallLampLight();
        list.add(new LightOnCommand(light));
        list.add(new LightOffCommand(light));

        // init.airConditioner
        AirConditioner conditioner = new MediaAirConditioner();
        list.add(new AirConditionerOpenCommand(conditioner));
        list.add(new AirConditionerCloseCommand(conditioner));
        conditioner = new SamsungAirConditioner();
        list.add(new AirConditionerOpenCommand(conditioner));
        list.add(new AirConditionerCloseCommand(conditioner));
        conditioner = new GreeAirConditioner();
        list.add(new AirConditionerOpenCommand(conditioner));
        list.add(new AirConditionerCloseCommand(conditioner));


        // done
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).execute();
        }
    }
}
