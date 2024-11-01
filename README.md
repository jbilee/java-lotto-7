# 로또

🎟 *로또 구매를 시뮬레이션하는 프로그램*

## 소개

**로또**는 현실의 로또 발매기처럼 로또 번호를 자동으로 뽑아주는 프로그램입니다. 구매 금액만큼의 로또를 발매해서 사전에 입력한 가상의 당첨 번호와 비교하고, 발생한 수익을 통계표와 퍼센테이지로 출력합니다.

## 사용법

프로그램을 가동하면 먼저 구입 금액을 입력합니다. 로또 한 장당 가격은 1,000원이며, 입력한 금액에 맞춰 로또의 장수가 발매됩니다.

금액 후에 당첨 번호와 보너스 번호를 입력하면 시뮬레이터가 발매한 로또 번호와 맞춰 당첨을 확인합니다. 최소 3개의 번호가 일치해야 당첨되며, 단계별 당첨금은 아래 표를 따릅니다. 

```
3개 일치: 5,000원
4개 일치: 50,000원
5개 일치: 1,500,000원
5개 + 보너스 번호 일치: 30,000,000원
6개 일치: 2,000,000,000원
```

## 구현 기능

#### 입력 처리
- [x] 로또 구입 금액을 입력 받는다
- [x] 입력 받은 금액의 유효성을 검증한다
  - [x] 숫자가 아닐 경우 예외를 발생시킨다
  - [x] 천 단위로 나눌 수 없는 경우 예외를 발생시킨다
  - [x] 허용 범위(1,000~100,000)가 아닐 경우 예외를 발생시킨다
- [x] 당첨 번호를 입력 받는다
- [x] 입력 받은 당첨 번호의 유효성을 검증한다
  - [x] 6개의 번호가 아닐 경우 예외를 발생시킨다
  - [x] 1~45 사이의 번호로만 구성되지 않을 경우 예외를 발생시킨다
  - [x] 6개의 번호 중 중복이 있으면 예외를 발생시킨다
- [x] 보너스 번호를 입력 받는다
- [x] 입력 받은 보너스 번호의 유효성을 검증한다
  - [x] 당첨 번호와 중복될 경우 예외를 발생시킨다
  - [x] 1~45 사이의 번호가 아닐 경우 예외를 발생시킨다
- [x] 입력값이 잘못되면 `[ERROR] ${문구}` 형식의 안내 문구를 출력하고 입력을 다시 받는다

#### 주요 비즈니스 로직 실행
- [x] 사용자가 입력한 구입 금액만큼의 로또를 생성한다
- [x] 사용자가 입력한 당첨 및 보너스 번호와 각 로또의 일치 여부를 계산한다
- [x] 일치하는 번호 갯수에 대한 통계를 구한다
- [x] 구입 금액 대비 수익률을 계산한다

#### 결과 출력
- [x] 발행한 로또의 수량과 번호를 출력한다
- [x] 당첨 여부에 대한 통계를 출력한다
- [ ] 총 수익률을 출력한다