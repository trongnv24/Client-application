package Training_java_Spring.boot.client.service.impl;

import Training_java_Spring.boot.client.dto.request.ClientRequest;
import Training_java_Spring.boot.client.dto.response.ClientResponse;
import Training_java_Spring.boot.client.entity.ClientEntity;
import Training_java_Spring.boot.client.repository.ClientRepository;
import Training_java_Spring.boot.client.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static Training_java_Spring.boot.client.service.mapping.ClientMapping.convertDtoToEntity;
import static Training_java_Spring.boot.client.service.mapping.ClientMapping.covertEntityToClientResponse;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientResponse create(ClientRequest request) {
        log.info(" === Start api create new client ==== ");
        log.info(" === Request Body : {} === ", request);
        ClientEntity entity = convertDtoToEntity(request);
        entity=clientRepository.save(entity);
        ClientResponse response = covertEntityToClientResponse(entity);
        log.info(" === Finish api create new client, Client Id {} : ", response.getId());
        return response;
    }
}
