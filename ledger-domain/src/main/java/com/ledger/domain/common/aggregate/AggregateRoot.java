package com.ledger.domain.common.aggregate;

import com.ledger.domain.common.entity.Entity;
import com.ledger.bootstrap;

public abstract class AggregateRoot<ID> extends Entity<ID> {

    protected AggregateRoot(ID id) {
        super(id);
    }
}
