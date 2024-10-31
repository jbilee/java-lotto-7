package lotto;

import lotto.ui.InputView;
import lotto.ui.OutputView;
import lotto.validators.BonusNumberValidator;
import lotto.validators.LottoNumberValidator;
import lotto.validators.PurchaseAmountValidator;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        String purchaseInput = inputView.getPurchaseAmount();

        PurchaseAmountValidator purchaseAmountValidator = new PurchaseAmountValidator();
        purchaseAmountValidator.validate(purchaseInput);

        String lottoNumbers = inputView.getLottoNumbers();

        LottoNumberValidator lottoNumberValidator = new LottoNumberValidator();
        lottoNumberValidator.validate(lottoNumbers);

        String bonusNumber = inputView.getBonusNumber();
        BonusNumberValidator bonusNumberValidator = new BonusNumberValidator();
        bonusNumberValidator.validate(bonusNumber + ":" + lottoNumbers);

        int purchaseAmount = Integer.parseInt(purchaseInput);
        Lottos lottos = new Lottos(purchaseAmount);
        OutputView outputView = new OutputView();
        lottos.registerObserver(outputView);
        lottos.notifyObserver();
        lottos.generateLottos();

        lottos.getResults(lottoNumbers, bonusNumber);
        lottos.getProfit(purchaseAmount);
    }
}
