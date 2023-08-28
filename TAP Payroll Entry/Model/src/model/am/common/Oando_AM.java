package model.am.common;

import java.math.BigDecimal;

import oracle.jbo.ApplicationModule;

public interface Oando_AM extends ApplicationModule {
    void filterUser();

    BigDecimal getPersonId(String userName);
}

