package com.github.yun.shiro.server.dao;

import com.github.yun.shiro.server.entity.Client;

import java.util.List;

/**
 * @author Administrator
 * <p>Date:
 * <p>Version: 1.0
 */
public interface ClientDao {

    public Client createClient(Client client);
    public Client updateClient(Client client);
    public void deleteClient(Long clientId);

    Client findOne(Long clientId);

    List<Client> findAll();

    Client findByClientId(String clientId);
    Client findByClientSecret(String clientSecret);

}
