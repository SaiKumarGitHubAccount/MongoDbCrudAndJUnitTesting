package mongodbexample.rep;

import mongodbexample.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,Integer> {

    List<User> findByAddress(String address);
}
