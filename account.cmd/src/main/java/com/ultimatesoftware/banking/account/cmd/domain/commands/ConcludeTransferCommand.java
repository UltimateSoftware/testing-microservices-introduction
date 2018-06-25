package com.ultimatesoftware.banking.account.cmd.domain.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.util.UUID;

public class ConcludeTransferCommand extends TransactionCommand {
    @TargetAggregateIdentifier
    private UUID id;
    private double amount;

    public ConcludeTransferCommand(double amount, UUID id, String transactionId) {
        super(transactionId);
        this.id = id;
        this.amount = amount;
    }


    public UUID getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

}