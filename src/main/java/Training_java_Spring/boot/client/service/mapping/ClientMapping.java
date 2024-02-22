package Training_java_Spring.boot.client.service.mapping;

import Training_java_Spring.boot.client.dto.request.ClientRequest;
import Training_java_Spring.boot.client.dto.response.ClientResponse;
import Training_java_Spring.boot.client.entity.ClientEntity;

public class ClientMapping {

    public static ClientEntity convertDtoToEntity (ClientRequest dto){
        ClientEntity entity = new ClientEntity();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setAddress(dto.getAddress());
        entity.setGender(dto.getGender());
        return entity;
    }
    public static ClientResponse covertEntityToClientResponse(ClientEntity entity){
        ClientResponse dto = new ClientResponse();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setAddress(entity.getAddress());
        dto.setGender(entity.getGender());
        return dto;
    }
}
