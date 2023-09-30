package org.example.Mapper;

import javax.annotation.processing.Generated;
import org.example.DTO.TransactionDto;
import org.example.Model.Transaction;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-30T19:44:25+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionDto mapToDto(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransactionDto transactionDto = new TransactionDto();

        transactionDto.setId( transaction.getId() );
        transactionDto.setAmount( transaction.getAmount() );
        transactionDto.setType( transaction.getType() );
        transactionDto.setTimestamp( transaction.getTimestamp() );
        transactionDto.setNotes( transaction.getNotes() );
        transactionDto.setAccount( transaction.getAccount() );

        return transactionDto;
    }
}
