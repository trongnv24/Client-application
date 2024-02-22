package Training_java_Spring.boot.client.repository;

import Training_java_Spring.boot.client.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, String> {
}
