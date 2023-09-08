# Word Manager (단어 관리자 프로젝트)

Word Manager는 영어 단어를 관리하고 .txt 파일에 저장하는 간단한 Java 어플리케이션이다. 이 어플리케이션을 사용하여 모든 단어를 보기, 난이도 별로 단어 검색, 특정 단어 검색, 단어 추가, 단어 업데이트 및 삭제, 단어 데이터를 파일에 저장하는 등의 작업이 가능하다.

## 시작화면

![Screenshot from 2023-09-07 21-03-38](https://github.com/soljung1997/WordMasterProject/assets/143365361/9fd5e480-676a-4939-bb7c-64f9cbdedf5d)


## 기능

### 1. 모든 단어 보기 - txt 파일에 불러온 모든 단어와 txt파일로 저장하기 전에 새로 추가한 단어들을 모두 출력한다.

- 터미널에 1을 입력하면 txt파일에 저장되어있는 모든 단어를 출력한다.

![Screenshot from 2023-09-07 21-20-52](https://github.com/soljung1997/WordMasterProject/assets/143365361/3ed48fbc-4850-4ea1-8714-46842bf2a112)


### 2. 수준별 단어 보기 - 단어를 입력된 수준/난이도에 따라 같은 난이도의 단어를 모두 출력한다.

- 터미널에 2를 입력하면 <원하는 레벨은? (1~3)> 이 나온다.
- 그중 1(쉬운단어)에서 3(어려운단어)을 선택하면 그 난이도에 단어를 모두 출력한다.

![Screenshot from 2023-09-07 21-21-17](https://github.com/soljung1997/WordMasterProject/assets/143365361/e9d8437a-d9d6-455e-aea1-ee50c6ce7dc6)


### 3. 단어 검색 - 특정 단어를 파일에서 찾는 기능, 검색어가 단어에 포함되어있다면 그것도 출력한다. e.g.: ap 검색하면 apple 등 "ap"가 들어있는 모든 단어를 출력한다.

- 터미널에 3을 입력하면 "==> 원하는 단어는?" 이 나온다.
- 키워드만 입력하면 키워드 포함된 모든 단어를 출력한다.

![Screenshot from 2023-09-07 21-21-51](https://github.com/soljung1997/WordMasterProject/assets/143365361/18d740d9-87fc-476c-af5d-1b74fa3e50c4)


### 4. 단어 추가 - 새로운 단어를 출력한다.

- 터미널에 4를 입력하면 "난이도(1, 2, 3) & 새 단어 입력" 이라는 프롬트 옆에 <번호>_<영문단어> 를 입력한다.
- 터미널에 "뜻 입력:" 프롬트 옆에 국문으로 입력한 단어의 뜻을 입력한다.
  
![Screenshot from 2023-09-07 21-23-11](https://github.com/soljung1997/WordMasterProject/assets/143365361/dd989da0-76d9-4cdb-bee4-f105da464d9c)

![Screenshot from 2023-09-07 21-23-40](https://github.com/soljung1997/WordMasterProject/assets/143365361/9c3255f9-15a3-4f3b-ad41-e2a641e94b48)


### 5. 단어 수정 - 목록에 있는 단어중 단어의 뜻을 수정한다.

- 터미널에 5를 입력하면 "수정할 단어 검색 :" 이 뜬다.
- 터미널에 단어 검색과 똑같이 영문으로 키워드 입력한다.
  - 출력된 단어들 중 번호에 맞는 단어를 찾는다.
- 터미널에 해당된 숫자를 입력한다.
- "뜻 입력:" 옆에 국문으로 선택한 단어의 뜻을 수정한다.

![Screenshot from 2023-09-07 21-24-56](https://github.com/soljung1997/WordMasterProject/assets/143365361/a6e63f48-1d2f-4ea1-a269-af3be2b2c3e2)

[수정된 단어 뜻]

![Screenshot from 2023-09-07 21-25-21](https://github.com/soljung1997/WordMasterProject/assets/143365361/3f404db7-e5d6-40b9-b619-6246489fecd1)


### 6. 단어 삭제 - 검색어로 단어를 찾아서 삭제한다.

- 터미널에 6을 입력하면 "삭제할 단어 검색 :" 프롬트가 뜬다.
- 터미널에 키워드를 입력한다. "삭제할 번호 선택 :" 옆에 삭제할 단어 좌측에 있는 번호를 입력한다.
- "정말로 삭제하실래요(Y/n) :" 이라는 프롬트 옆에 "Y/y"를 입력하면 삭제되고 "n"을 입력하면 삭제가 안된다.

![Screenshot from 2023-09-07 21-26-09](https://github.com/soljung1997/WordMasterProject/assets/143365361/354de133-84ca-4c92-835e-f76a0891b9cf)

[hello 단어 위에 있는 apple 없어짐]

![Screenshot from 2023-09-07 21-26-32](https://github.com/soljung1997/WordMasterProject/assets/143365361/45744bfd-8325-46c8-884a-d6b90bbd226e)


### 7. 파일 저장 - 파일을 저장한다.

- 터미널에 7을 입력하고 "==> 데이터 저장 완료 !!!" 가 출력되면 txt 파일로 저장된다.

![Screenshot from 2023-09-07 21-27-07](https://github.com/soljung1997/WordMasterProject/assets/143365361/03c24910-9e87-4f87-b7b2-878fb650c1ac)


### 0. 나가기 - 프로그램을 종료한다.

- 프로그램 종료.

![Screenshot from 2023-09-07 21-27-23](https://github.com/soljung1997/WordMasterProject/assets/143365361/b01e1485-0cc1-4a47-af4b-0aa417bf3edc)


## 시작하기

### 사전 필수 조건

- Java 개발 키트 (JDK)
- Java 통합 개발 환경 (IDE) 또는 텍스트 편집기
- Git (선택 사항, 리포지토리를 복제하는 경우)
