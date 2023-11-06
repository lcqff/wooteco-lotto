package lotto.view;

import static java.lang.Integer.parseInt;
import static lotto.utils.Message.*;

import camp.nextstep.edu.missionutils.Console;
import lotto.domain.Payment;


public class InputView {
    public Payment inputPayment() {
        System.out.println(PAYMENT_INPUT_MESSAGE.getMessage());
        int payment = parseInt(Console.readLine());
        return new Payment(payment);
    }
}
