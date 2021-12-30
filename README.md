# 📚 Spring Boot를 이용한 멀티모듈 설계

<br/>

##  ✅ 개요
신규 프로젝트 진행 시 빠르게 멀티모듈 환경을 적용하기 위해 Spring Boot를 이용한 멀티모듈 구조를 설계함

<br/><br/>


## 🖥 개발 환경
 - Java 11
 - Gradle 6.9
 - Spring Boot 2.5.8
 - Spring Data JPA
 - Querydsl
 - JUnit 5
 - Spring REST Docs
 - Thymeleaf

<br/><br/>

## 📜 프로젝트 구조

> temo -   TEMporary layOut



``` bash
temo-project
    ├── temo-application         --> 애플리케이션 실행 모듈
    ├── temo-core                --> Utils, POJO 클래스를 갖는 모듈
    ├── temo-internal-api        --> 애플리케이션 내부에서 사용하는 API 모듈
    ├── temo-security            --> 스프링 시큐리티 설정 모듈
    └── temo-web-thymeleaf       --> 타임리프 모듈
```

### 모듈 간 관계
![image](https://user-images.githubusercontent.com/61148082/147764691-34911f26-06f3-474a-ad41-3732f586fc42.png)

<br/><br/>


## 애플리케이션 실행
### [Intellij]
소스 Clone 후 temo-application 모듈에 존재하는 TemoApplication main 메서드 실행

### [bootJar]
Gradle BootJar Task 실행 후 temo-application/build/libs에 빌드된 jar를 터미널에서 실행
```
java -jar temo-application-1.0-SNAPSHOT.jar
```

<br/><br/>
## 📑 비고

### Spring REST Docs
> Spring REST Docs는 REST 아키텍처 중 Self-descriptive message를 달성하기 위해 Spring에서 지원하는 프로젝트입니다.
> 
> 테스트 코드로 작성된 REST Docs는 HTTP Response를 통해 클라이언트에게 전달 됩니다.

<br/><br/>
### Querydsl
> Querydsl 정적 타입을 이용해서 SQL과 같은 쿼리를 생성할 수 있도록 해 주는 프레임워크입니다.
>
> Gradle Task 중 compileQuerydsl를 통해 Entity를 Q타입으로 변환할 수 있습니다.

<br/><br/>






## 📌 Reference
[Spring 공식 가이드 - 멀티모듈 설계]()

[멀티모듈 환경 - 빈 등록](https://stackoverflow.com/questions/41430051/scan-components-of-different-maven-modules-jars-in-a-spring-boot-application)

[멀티모듈 환경 -  테스트 작성](https://jojoldu.tistory.com/123)

[멀티모듈 환경 - Build.Gradle 공통화](https://lemontia.tistory.com/1013)

[REST DOCS 환경 설정 - 1](https://garve32.tistory.com/38)

[REST DOCS 환경 설정 - 2](https://gaemi606.tistory.com/entry/Spring-Boot-REST-Docs-%EC%A0%81%EC%9A%A9%ED%95%98%EA%B8%B0)

[REST DOCS 환경 설정 - 3](https://godekdls.github.io/Spring%20REST%20Docs/workingwithaciidoctor/)

[Querydsl 환경 설정](https://jaime-note.tistory.com/67)

[Thymeleaf 환경 설정](https://bamdule.tistory.com/30)


