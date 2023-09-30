package org.example.Controllers;



import org.example.DTO.AccountDto;
import org.example.Model.Account;
import org.example.Services.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("accounts")
public class AccountController {


    private final AccountService accountService;


    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public AccountDto addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }


    @GetMapping("/login")
    public AccountDto login(@RequestParam String cardNumber, @RequestParam String password) {
        return accountService.login(cardNumber, password);
    }


    @GetMapping("/{accountId}/balance/{amount}")
    public double getAccountBalance(@PathVariable Long accountId) {
        return accountService.getAccountBalance(accountId);

    }



   }