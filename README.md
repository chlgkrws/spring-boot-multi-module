# 📚 Spring Boot를 이용한 멀티모듈 설계



##  ✅ 개요
신규 프로젝트 진행 시 빠르게 멀티모듈 환경을 적용하기 위해 Spring Boot를 이용한 멀티모듈 구조를 설계함


## 🖥 개발 환경
 - Java 11
 - Gradle 6.9
 - Spring Boot 2.5.8
 - Spring Data JPA
 - Querydsl
 - JUnit 5
 - Spring REST DOCS
 - Thymeleaf


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


