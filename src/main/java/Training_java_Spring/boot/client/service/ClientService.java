package Training_java_Spring.boot.client.service;

import Training_java_Spring.boot.client.dto.request.ClientRequest;
import Training_java_Spring.boot.client.dto.response.ClientResponse;

public interface ClientService {

    ClientResponse create(ClientRequest request);
    ClientResponse getById(String id);
    ClientResponse update ( ClientRequest request, String id);
    void deleteById(String id );
}
