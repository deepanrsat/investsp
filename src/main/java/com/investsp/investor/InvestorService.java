package com.investsp.investor;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by deepan on 3/24/15.
 */
public interface InvestorService {
    public void createInvestor(Investor investor);

    List<Investor> searchInvestor(SearchForm searchForm);
}
