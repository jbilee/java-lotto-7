package lotto.models;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    public int getMatches(List<Integer> winningNumbers, int bonusNumber) {
        List<Integer> matchingNumbers = winningNumbers.stream().filter(this.numbers::contains).toList();
        if (matchingNumbers.size() == 6 || matchingNumbers.size() == 5 && winningNumbers.contains(bonusNumber)) {
            return matchingNumbers.size() + 1;
        }
        return matchingNumbers.size();
    }
}