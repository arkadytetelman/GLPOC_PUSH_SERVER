package com.globallogic.poc.push_server.dao;

import com.globallogic.poc.push_server.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by arkadii.tetelman on 3/18/14.
 */
public interface InvoiceRepository extends  CrudRepository<Invoice, Long> {
}
