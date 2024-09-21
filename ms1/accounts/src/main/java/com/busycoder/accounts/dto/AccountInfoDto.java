package com.busycoder.accounts.dto;

import lombok.Data;

@Data
public class AccountInfoDto {
    private AccountDto accountDto;
    private CardDto cardDto;
    private LoanDto loanDto;

    public AccountDto getAccountDto() {
        return accountDto;
    }

    public void setAccountDto(AccountDto accountDto) {
        this.accountDto = accountDto;
    }

    public CardDto getCardDto() {
        return cardDto;
    }

    public void setCardDto(CardDto cardDto) {
        this.cardDto = cardDto;
    }

    public LoanDto getLoanDto() {
        return loanDto;
    }

    public void setLoanDto(LoanDto loanDto) {
        this.loanDto = loanDto;
    }
}
