package org.example.Services;


import org.example.DTO.AccountDto;
import org.example.Mapper.AccountMapper;

import org.example.Model.Account;
import org.example.Repositories.AccountRepository;
import org.example.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountMapper accountMapper;
    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    @Autowired
    public AccountService(AccountMapper accountMapper, AccountRepository accountRepository, TransactionRepository transactionRepository) {
        this.accountMapper = accountMapper;
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    public AccountDto addAccount(Account account) {
        return accountMapper.mapToDto(accountRepository.save(account));

    }

    public AccountDto login(String cardNumber, String password) {

        return accountMapper.mapToDto(accountRepository.findByCardNumberAndPassword(cardNumber, password));
    }

    public double getAccountBalance(Long accountId) {
        Account account = accountRepository.findById(accountId).orElseThrow(() -> new IllegalArgumentException("Account not found"));
        return account.getBalance();
    }

    public boolean isThereEnoughMoneyToWithdraw(Long accountId, double amount) {
        return !(amount > getAccountBalance(accountId));
    }

}
