# π Spring Bootλ₯Ό μ΄μ©ν λ©ν°λͺ¨λ μ€κ³

<br/>

##  β κ°μ
μ κ· νλ‘μ νΈ μ§ν μ λΉ λ₯΄κ² λ©ν°λͺ¨λ νκ²½μ μ μ©νκΈ° μν΄ Spring Bootλ₯Ό μ΄μ©ν λ©ν°λͺ¨λ κ΅¬μ‘°λ₯Ό μ€κ³ν¨

<br/><br/>


## π₯ κ°λ° νκ²½
 - Java 11
 - Gradle 6.9
 - Spring Boot 2.5.8
   - Spring Web
   - Spring Data JPA
   - Spring Security
   - Spring REST Docs
   - Spring HATEOAS
   - JUnit 5
   - Thymeleaf
 - Querydsl 4.4.0
 - H2 2.0.202

<br/><br/>

## π νλ‘μ νΈ κ΅¬μ‘°

> temo -   TEMporary layOut



``` bash
temo-project
    βββ temo-application         --> μ νλ¦¬μΌμ΄μ μ€ν λͺ¨λ
    βββ temo-core                --> Utils, POJO ν΄λμ€λ₯Ό κ°λ λͺ¨λ
    βββ temo-internal-api        --> μ νλ¦¬μΌμ΄μ λ΄λΆμμ μ¬μ©νλ API λͺ¨λ
    βββ temo-security            --> μ€νλ§ μνλ¦¬ν° μ€μ  λͺ¨λ
    βββ temo-web-thymeleaf       --> νμλ¦¬ν λͺ¨λ
```

### λͺ¨λ κ° κ΄κ³
![image](https://user-images.githubusercontent.com/61148082/147764691-34911f26-06f3-474a-ad41-3732f586fc42.png)
- ν΄λΉ μ΄λ―Έμ§μ μμ‘΄μ±μ νμ¬ νλ‘μ νΈμ μ μ©λ μμ‘΄μ±μΌλΏ, μμ‘΄μ±μ μΆκ°νκ±°λ μ­μ νλ κ²μ μ¬μ©μκ° μνλλλ‘ λ³κ²½ κ°λ₯
<br/><br/>


## π μ νλ¦¬μΌμ΄μ μ€ν
### [Intellij]
μμ€ Clone ν temo-application λͺ¨λμ μ‘΄μ¬νλ TemoApplication main λ©μλ μ€ν

### [bootJar]
Gradle BootJar Task μ€ν ν temo-application/build/libsμ λΉλλ jarλ₯Ό ν°λ―Έλμμ μ€ν
```
java -jar temo-application-1.0-SNAPSHOT.jar
```

<br/><br/>
## π λΉκ³ 
### Spring REST Docsμ Querydsl μ€μ μ temo-internal-api λͺ¨λμ Example μ½λ μ°Έμ‘°


<br/>



## π Reference
[Spring κ³΅μ κ°μ΄λ - λ©ν°λͺ¨λ μ€κ³]()

[λ©ν°λͺ¨λ νκ²½ - λΉ λ±λ‘](https://stackoverflow.com/questions/41430051/scan-components-of-different-maven-modules-jars-in-a-spring-boot-application)

[λ©ν°λͺ¨λ νκ²½ -  νμ€νΈ μμ±](https://jojoldu.tistory.com/123)

[λ©ν°λͺ¨λ νκ²½ - Build.Gradle κ³΅ν΅ν](https://lemontia.tistory.com/1013)

[REST DOCS νκ²½ μ€μ  - 1](https://garve32.tistory.com/38)

[REST DOCS νκ²½ μ€μ  - 2](https://gaemi606.tistory.com/entry/Spring-Boot-REST-Docs-%EC%A0%81%EC%9A%A9%ED%95%98%EA%B8%B0)

[REST DOCS νκ²½ μ€μ  - 3](https://godekdls.github.io/Spring%20REST%20Docs/workingwithaciidoctor/)

[Querydsl νκ²½ μ€μ ](https://jaime-note.tistory.com/67)

[Thymeleaf νκ²½ μ€μ ](https://bamdule.tistory.com/30)


