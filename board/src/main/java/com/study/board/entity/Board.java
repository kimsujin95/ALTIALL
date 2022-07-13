package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



// 클래스 위에 선언하여 이 클래스가 엔티티임을 알려준다. 이렇게 되면 JPA 에서 정의된 필드들을 바탕으로 데이터베이스에 테이블을 만들어 준다.
@Entity
// lombok 라이브러리에서 제공하는 Annotation이다.
// @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 을 한꺼번에 설정해주는 매우 유용한 어노테이션이다.
@Data
public class Board {

    // 해당 엔티티의 주요 키(Primary key, PK)가 될 값을 지정해주는 것이 @Id 이다. (PK를 의미한다고 보면 된다.)
    @Id
    // @GeneratedValue는 이 PK가 자동으로 1씩 증가하는 형태로 생성될지 등을 결정해주는 어노테이션이다. (자동 생성되는 키 값)
    // IDENTITY -> 마리아DB
    // SEQUENCE -> 오라클에서 지정
    // AUTO -> 알아서 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    private String filename;

    private String filepath;
}
