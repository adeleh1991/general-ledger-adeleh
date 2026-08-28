package com.ledger.domain.common.aggregate;

import com.ledger.domain.common.entity.Entity;
import com.ledger.application.accountheading;

public abstract class AggregateRoot<ID> extends Entity<ID> {

    protected AggregateRoot(ID id) {
        super(id);
    }
}
