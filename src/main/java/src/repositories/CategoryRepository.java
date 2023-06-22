package src.repositories;

import org.springframework.data.repository.CrudRepository;
import src.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
