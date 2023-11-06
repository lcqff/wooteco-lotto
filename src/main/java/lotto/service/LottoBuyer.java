package lotto.service;

import java.util.List;
import lotto.domain.Lotto;
import lotto.domain.Payment;

public class LottoBuyer {
    private int lottoTicketNumber;
    private Payment payment;
    private List<Lotto> lottos;
    private static final int LOTTO_PRICE = 1000;

    public LottoBuyer(int lottoTicketNumber) {
        this.lottoTicketNumber = lottoTicketNumber;
    }

    public LottoBuyer(Payment payment) {
        this.payment = payment;
        this.lottoTicketNumber = payment.getPayment()/LOTTO_PRICE;
    }

}
