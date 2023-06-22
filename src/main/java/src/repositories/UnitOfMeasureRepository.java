package src.repositories;

import org.springframework.data.repository.CrudRepository;
import src.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
