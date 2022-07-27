# 숫자 야구 게임

### 프로젝트 목적
- **협업** 을 경험하는 것을 목적으로 둔다.

### 컨벤션


## **기능 요구 사항**

기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

- 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
    - e.g. 상대방(컴퓨터)의 수가 425일 때, 123을 제시한 경우 : 1스트라이크, 456을 제시한 경우 : 1볼 1스트라이크, 789를 제시한 경우 : 낫싱
- 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
- 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
    - 9라운드 까지 정답을 맞추지 못하면, 게임에 패배한다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.

## 이슈

issue : #1 #2 프로젝트 뼈대 준비

issue : #4 랜덤 숫자 생성 기능

issue : #5 생성된 숫자와 유저 입력 숫자 비교 결과 생성, 출력 기능

issue : #6 사용자로 부터 입력받고 검증하는 작업

issue : #10 게임 재시작 로직 및 피칭 결과 리팩토링

issue : #14 게임 결과 기록및 승리 시 종료
1. OS 별 Path 설정 오류
2. 유저 친화적인 인터페이스 제공에 대한 문구 추가