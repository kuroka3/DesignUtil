# DesignUtil
Server Message Designer

# 한국어 / Korean
서버 채팅 / 입퇴장 메시지를 꾸미기 위한 플러그인입니다.  
: 1.20 버전만 지원합니다.

## 사용법
플러그인 데이터 폴더의 `designs.txt` 파일의 텍스트를 원하는 형식으로 수정합니다.  
: `<<Player>>` 는 플레이어 닉네임으로, `<<message>>` 는 채팅 텍스트로 대체됩니다.  
: 이전 버전의 색깔 코드를 사용할 수 있습니다.

## 예시
입력  
```
chat= &7[ &e<<Player>> &7] &f<<message>>
join= &7[&a+&7] &e<<Player>>
quit= &7[&c-&7] &e<<Player>>
```

출력 (Player: kuroka35, message: test message)  
```
[ kuroka35 ] test message
[+] kuroka35
[-] kuroka35
```

# 영어 / English
A Plugin to design server chat / join / quit message.  
: supports ONLY 1.20.

## 사용법
Edit `designs.txt` file in plugin data folder.  
: `<<Player>>` will be replaced to player's nickname, `<<message>>` will be replaced to chat message.  
: Color code(like &7, &a) can be used.

## 예시
input  
```
chat= &7[ &e<<Player>> &7] &f<<message>>
join= &7[&a+&7] &e<<Player>>
quit= &7[&c-&7] &e<<Player>>
```

output (Player: kuroka35, message: test message)  
```
[ kuroka35 ] test message
[+] kuroka35
[-] kuroka35
```
