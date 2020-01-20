package com.korea.k88.board.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard900 is a Querydsl query type for Board900
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBoard900 extends EntityPathBase<Board900> {

    private static final long serialVersionUID = -305209183L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoard900 board900 = new QBoard900("board900");

    public final NumberPath<Long> cnt = createNumber("cnt", Long.class);

    public final StringPath content = createString("content");

    public final DateTimePath<java.util.Date> createDate = createDateTime("createDate", java.util.Date.class);

    public final QMember900 member;

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath title = createString("title");

    public QBoard900(String variable) {
        this(Board900.class, forVariable(variable), INITS);
    }

    public QBoard900(Path<? extends Board900> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoard900(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoard900(PathMetadata metadata, PathInits inits) {
        this(Board900.class, metadata, inits);
    }

    public QBoard900(Class<? extends Board900> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember900(forProperty("member")) : null;
    }

}

