package com.investsp.investor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by deepan on 3/24/15.
 */
@Component
public class InvestorServiceImpl implements InvestorService {

    private final JdbcTemplate jdbcTemplate;
    private static final String insertSql = "insert into investorsp.investor " +
            "(last_name, first_name, dob, address, city, state, zipcode, phone_number) " +
            "values (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String searchIdSql = "select * from investorsp.investor";

    @Autowired
    public InvestorServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createInvestor(Investor investor) {
        System.out.println("Trying to insert record");
        try {
            jdbcTemplate.update(insertSql, new Object[]{investor.getLastName(), investor.getFirstName(), investor.getDob(),
                    investor.getAddress(), investor.getCity(), investor.getState(),
                    investor.getZipCode(), investor.getPhoneNumber()});
        } catch (Exception e) {
            System.out.println("Error adding the record to table " + e);
        }
        System.out.println("Investor inserted into the database successfully");
    }

    @Override
    public List<Investor> searchInvestor(SearchForm searchForm) {
//        jdbcTemplate.get
        System.out.println(searchForm.getFnSearch());
        List<Investor> investorList = jdbcTemplate.query(searchIdSql,
                new BeanPropertyRowMapper<Investor>(Investor.class));
//        investorList.forEach(investor -> System.out.println(investor.getAddress()));
        System.out.println(investorList.size());
        return investorList;
    }
}
