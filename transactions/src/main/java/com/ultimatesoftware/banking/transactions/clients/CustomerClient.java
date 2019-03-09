package com.ultimatesoftware.banking.transactions.clients;

import com.ultimatesoftware.banking.transactions.models.CustomerDto;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Retryable;
import io.reactivex.Maybe;

@Client(id ="customers", path = "/api/v1/customer/")
@Retryable(attempts = "2", delay = "2s")
public interface CustomerClient {
    Maybe<CustomerDto> get(String id);
}
