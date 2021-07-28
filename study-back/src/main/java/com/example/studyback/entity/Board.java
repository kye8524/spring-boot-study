package com.example.studyback.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Integer view;

    @Column
    private Date regdate;

    @Builder
    public Board(Long seq, String title, String content,Integer view, Date regdate){
        this.seq=seq;
        this.title=title;
        this.content=content;
        this.view=view;
        this.regdate=regdate;
    }
}
