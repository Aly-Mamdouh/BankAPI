package org.example.Mapper;

import javax.annotation.processing.Generated;
import org.example.DTO.AccountDto;
import org.example.Model.Account;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-30T19:44:25+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountDto mapToDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        accountDto.setId( account.getId() );
        accountDto.setName( account.getName() );
        accountDto.setPassword( account.getPassword() );
        accountDto.setCardNumber( account.getCardNumber() );
        accountDto.setBalance( account.getBalance() );

        return accountDto;
    }
}
