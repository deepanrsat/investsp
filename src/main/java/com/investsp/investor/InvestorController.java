package com.investsp.investor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by deepan on 3/23/15.
 */
@Controller
//@ComponentScan
public class InvestorController {

    @Autowired
    private InvestorService investorService;

    @RequestMapping("/investorHome.do")
    public String investorHome(Model model) {
        model.addAttribute("searchForm", new SearchForm());
        return "investorHome";
    }

    @RequestMapping(value = "/createInvestor.do", method = RequestMethod.GET)
    public String getInvestorPage(Model model) {
        model.addAttribute("createUserForm", new Investor());
        return "createInvestor";
    }

    @RequestMapping(value = "/createInvestor.do", method = RequestMethod.POST)
    public String createInvestor(@ModelAttribute("createUserForm") @Valid Investor investor, BindingResult result) {
        if(result.hasErrors()) {
            return "createInvestor";
        }
        try {
            investorService.createInvestor(investor);
        } catch (Exception e) {
            result.reject("investor.error.exists");
            return "createInvestor";
        }
        return "redirect:/investorHome.do";
    }

    @RequestMapping(value="/getInvestorInfo.do", method = RequestMethod.POST)
    public String getInvestorInfo(@ModelAttribute("searchForm") @Valid SearchForm searchForm, BindingResult result, Model model) {
        List<Investor> investorList = investorService.searchInvestor(searchForm);
        model.addAttribute("investorList", investorList);
        return "investorSearchResult";
    }

    public void setInvestorService(InvestorService investorService) {
        this.investorService = investorService;
    }
}
