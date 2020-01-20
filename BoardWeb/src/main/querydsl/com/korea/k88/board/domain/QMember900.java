package com.korea.k88.board.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember900 is a Querydsl query type for Member900
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember900 extends EntityPathBase<Member900> {

    private static final long serialVersionUID = 2077726609L;

    public static final QMember900 member900 = new QMember900("member900");

    public final ListPath<Board900, QBoard900> boardList = this.<Board900, QBoard900>createList("boardList", Board900.class, QBoard900.class, PathInits.DIRECT2);

    public final BooleanPath enabled = createBoolean("enabled");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final EnumPath<Role> role = createEnum("role", Role.class);

    public QMember900(String variable) {
        super(Member900.class, forVariable(variable));
    }

    public QMember900(Path<? extends Member900> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember900(PathMetadata metadata) {
        super(Member900.class, metadata);
    }

}

