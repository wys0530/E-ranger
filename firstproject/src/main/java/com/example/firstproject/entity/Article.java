package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor //클래스 안쪽의 모든 필드(id, title, content를 매개변수로 하는 생성자 자동으로 만들어짐
@NoArgsConstructor
@ToString
@Entity
@Getter //롬복으로 게터 추가
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

   // public String getId() {
  //  }

    //Aritcle 생성자 추가

}
