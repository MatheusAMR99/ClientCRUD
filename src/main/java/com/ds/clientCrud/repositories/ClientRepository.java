package com.ds.clientCrud.repositories;

import com.ds.clientCrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
