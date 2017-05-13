package bookStore.repository;

import bookStore.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Catalysts on 9/9/2015.
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
