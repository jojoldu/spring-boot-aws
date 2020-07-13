# Spring Boot에서 AWS 파라미터 스토어로 private 설정값 사용하기

이를테면 DB의 접속정보나 암호화에 사용될 Salt Key 등은 프로젝트 코드 내부에서 관리하기엔 위험이 따릅니다.  
  


![price](./images/price.png)

[요금표](https://aws.amazon.com/ko/systems-manager/pricing/)


동적 파라미터로 사용하는게 아니라, **처음 부트 실행시에만 한번 불러오는 구조**