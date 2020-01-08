package Controller;

import View.*;
import Model.*;

public class Controller {

    int i = InputData.inputNum();

    public void start() {

        Shop shop = new Shop("FOZZY");
        UserMessage.printMessage();
        InputData.inputNum();

    switch(i) {
        case 1:
            shop.addDepart(InputData.getDepName(), InputData.getDepLocation());
        case 2:
            shop.removeDepart(InputData.getDepName());
        case 3:
            shop.sortDeparts();
        case 4:
            shop.supply(InputData.getDepName() ,InputData.getProductName());
            break;

    }
    }
}

