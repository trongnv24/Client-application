package Training_java_Spring.boot.client.dto.response;

import Training_java_Spring.boot.client.dto.request.ClientRequest;

public class ClientResponse extends ClientRequest {
    private String id;

    public ClientResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClientResponse{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", gender='" + getGender() + '\'' +
                '}';
    }
}
