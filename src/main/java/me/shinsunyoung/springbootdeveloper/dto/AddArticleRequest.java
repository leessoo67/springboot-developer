package me.shinsunyoung.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shinsunyoung.springbootdeveloper.domain.Article;

@NoArgsConstructor //기본생성자
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity() {//생성자를 이용해 객체 생성
        return Article.builder()
                .title(title)
                .content(content)
                .build();

        //추후에 블로그 글을 추가할 때 저장할 엔티티로 변환하는 용도
    }
}
