package hello;

import org.springframework.data.repository.CrudRepository;

/**
 * <code></code>
 *
 * @author masonhsieh
 * @version 1.0
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
